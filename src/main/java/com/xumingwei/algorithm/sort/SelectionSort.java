package com.xumingwei.algorithm.sort;

import com.xumingwei.algorithm.sort.base.BaseSort;

import java.util.List;

/**
 * @Description: 选择排序
 * @author: xumingwei
 * @date: 2019—12—19 15:34
 */
public class SelectionSort extends BaseSort {


    @Override
    public void algorithm(List<Integer> sourceDataList, List<Integer> targetDataList) {
        int size = sourceDataList.size();
        //1、第一层循环，用于控制循环次数（即：循环 size 次）
        for (int i = 0; i < size; i++) {
            //2、假定i元素为当前最小元素
            int min = i;
            //3、第二层循环，用于寻找最小元素的下标
            for(int j = i + 1; j < size ; j++){
                //4、当前光标所在元素
                int a = sourceDataList.get(j);
                //5、当前的最小元素
                int b = sourceDataList.get(min);
                //6、前者小于后者，则将前者下标认定为当前最小元素的下标
                if(a < b){
                    min = j;
                }
            }
            //7、若当前最小元素下标不是i，说明在第二层循环期间发现了更小的元素，则将最小的元素与i元素进行位置交换
            if(min != i){
                int temp = sourceDataList.get(i);
                sourceDataList.set(i, sourceDataList.get(min));
                sourceDataList.set(min, temp);
            }
        }
        targetDataList.addAll(sourceDataList);
    }
}
