package com.xumingwei.algorithm.sort;

import com.xumingwei.algorithm.sort.base.BaseSort;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 归并排序
 * @author: xumingwei
 * @date: 2020—04—02 10:42
 */
public class MergeSort extends BaseSort{

    @Override
    public String algorithmName() {
        return "归并排序";
    }

    /**
     * 算法核心思想：
     * 1、通过递归将原始序列不断的拆分，直到每个子序列中最多只有一个元素位置
     * 2、对子序列两两合并，合并后的结果序列为有序的。通过不断的合并，最终将所有子序列合并为一个结果序列，即排序完成
     * @param sourceDataList
     * @param targetDataList
     */
    @Override
    public void algorithm(List<Integer> sourceDataList, List<Integer> targetDataList) {
        List<Integer> dataList = toSort(sourceDataList);
        targetDataList.addAll(dataList);
    }


    /**
     * 对一个无序序列进行排序
     * @param dataList
     * @return
     */
    private List<Integer> toSort(List<Integer> dataList){
        int size = dataList.size();
        //1、若序列中元素个数小于2个，则无需进行排序
        if(size < 2){
            return dataList;
        }
        //2、计算序列的中间元素下标
        int middle = (int)Math.floor(size/2);
        //3、将序列按照中间元素下标拆分为两个子序列
        List<Integer> leftDataList = dataList.subList(0, middle);
        List<Integer> rightDataList = dataList.subList(middle, size);
        //4、对子序列分别进行排序
        leftDataList = toSort(leftDataList);
        rightDataList = toSort(rightDataList);
        //5、将排序好的子序列，归并为一个序列
        dataList = merge(leftDataList, rightDataList);
        return dataList;
    }

    /**
     * 将两个有序的子序列，归并为一个有序序列
     * @param leftDataList
     * @param rightDataList
     * @return
     */
    private List<Integer> merge(List<Integer> leftDataList, List<Integer> rightDataList){
        //1、创建一个空的结果序列，长度为两个子序列长度之和
        List<Integer> resultList = new ArrayList<>(leftDataList.size() + rightDataList.size());
        //2、两个子序列都不为空时进行处理
        while (leftDataList.size() > 0 && rightDataList.size() > 0){
            //3、取出左、右子序列的第一个元素
            int left = leftDataList.get(0);
            int right = rightDataList.get(0);
            //4、若左子序列的第一个元素更小，则将其放入结果序列中，同时将该元素从左子序列中剔除
            if(left < right){
                resultList.add(left);
                leftDataList = leftDataList.subList(1, leftDataList.size());
            }else {
                //5、若右子序列的第一个元素更小，则将其放入结果序列中，同时将该元素从右子序列中剔除
                resultList.add(right);
                rightDataList = rightDataList.subList(1, rightDataList.size());
            }
        }
        //6、若左子序列为空，说明其中的元素均已放入结果序列中。此时将右子序列的剩余元素全部追加到结果序列之后即可
        if(leftDataList.size() == 0){
            resultList.addAll(rightDataList);
        }
        //7、反之同理，将左子序列的剩余元素全部追加到结果序列之后即可
        if(rightDataList.size() == 0){
            resultList.addAll(leftDataList);
        }
        return resultList;
    }
}
