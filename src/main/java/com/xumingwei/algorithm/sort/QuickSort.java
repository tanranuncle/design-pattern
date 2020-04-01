package com.xumingwei.algorithm.sort;

import com.xumingwei.algorithm.sort.base.BaseSort;
import java.util.List;

/**
 * @Description: 快速排序
 * @author: Carney
 * @date: 2020-04-01 21:31
 */
public class QuickSort extends BaseSort{

    @Override
    public void algorithm(List<Integer> sourceDataList, List<Integer> targetDataList) {
        //1、对整个序列进行排序
        List<Integer> list = toSort(sourceDataList, 0, sourceDataList.size() - 1);
        targetDataList.addAll(list);
    }

    /**
     * 快速排序
     * @param dataList
     * @param left
     * @param right
     * @return
     */
    private List<Integer> toSort(List<Integer> dataList, int left, int right){
        //1、只有左端点小于右端点下标时，区间内才有元素。否则没有元素，即为空区间，无需排序
        //注：当基准值一侧的子区间没有元素时，会出现left < right的情况
        //注：当基准值一侧的子区间只有一个元素时，会出现left = right的情况
        if(left < right){
            //2、找到基准值下标，同时将比基准值小的元素移到左侧，比基准值大的元素移到右侧
            int partition = partition(dataList, left, right);
            //3、对基准值左侧的子序列进行排序
            toSort(dataList, left, partition -1);
            //4、对基准值右侧的子序列进行排序
            toSort(dataList, partition + 1, right);
        }
        return dataList;
    }

    /**
     * 获取基准值
     * @param dataList
     * @param left
     * @param right
     * @return
     */
    private int partition(List<Integer> dataList, int left, int right){
        //1、以最左侧第一个元素为基准值所在位置
        int pivot = left;
        //2、假定index左侧元素均小于基准值，index所在位置及其右侧元素均大于等于基准值
        int index = pivot + 1;
        //3、从第二个元素开始比较
        for (int i = index; i <= right; i++) {
            int value = dataList.get(i);
            int pivotValue = dataList.get(pivot);
            //4、若第 i 号元素小于基准值，则将i号元素与index元素交换，并且index向右移一位
            //注：这样是为了保证第二条陈述，将小于基准值的元素都放到index的左侧
            if(value < pivotValue){
                swap(dataList, i, index);
                index++;
            }
        }
        //5、基于第二条陈述，index左侧元素均小于基准值。因此index左移一位，即为最后一个小于基准值的元素位置
        index--;

        //6、将基准值与最后一个小于基准值的元素交换位置
        //注：此时，所有小于基准值的元素均移到了基准值左侧，其余元素均在基准值元素右侧
        swap(dataList, pivot, index);

        //7、返回此时基准值所在的位置
        return index;
    }

    /**
     * 交换元素的值
     * @param dataList
     * @param i
     * @param j
     */
    private void swap(List<Integer> dataList, int i, int j){
        int temp = dataList.get(i);
        dataList.set(i, dataList.get(j));
        dataList.set(j, temp);
    }
}
