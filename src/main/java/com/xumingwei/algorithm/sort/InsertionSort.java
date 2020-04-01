package com.xumingwei.algorithm.sort;

import com.xumingwei.algorithm.sort.base.BaseSort;

import java.util.List;

/**
 * @Description: 插入排序
 * @author: xumingwei
 * @date: 2020—04—01 17:00
 */
public class InsertionSort extends BaseSort {

    @Override
    public void algorithm(List<Integer> sourceDataList, List<Integer> targetDataList) {
        int size = sourceDataList.size();
        //1、假定第一个元素为有序序列，从第二个元素开始排序
        for (int i = 1; i < size; i++) {
            //2、取出当前要排序的元素
            int temp = sourceDataList.get(i);
            //3、从当前元素的前（左）边一位开始判断。循环的范围是当前元素前面的所有元素
            int j = i;
            //4、若当前要排序的元素小于当前光标所在元素，则将当前光标所在元素后（右）移一位，然后继续向前（左）判断
            while (j > 0 && temp < sourceDataList.get(j-1)){
                sourceDataList.set(j, sourceDataList.get(j-1));
                j--;
            }
            //5、若当前光标所在位置与当前要排序位置
            if(j != i){
                sourceDataList.set(j, temp);
            }
        }
        targetDataList.addAll(sourceDataList);
    }
}
