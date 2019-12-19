package com.xumingwei.algorithm.sort.bubble;

import com.xumingwei.algorithm.sort.base.BaseSort;

import java.util.List;

/**
 * @Description: 冒泡排序
 * @author: xumingwei
 * @date: 2019—12—19 14:29
 */
public class BubbleSort extends BaseSort {

    @Override
    public void algorithm(List<Integer> sourceDataList, List<Integer> targetDataList) {
        int size = sourceDataList.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                int a = sourceDataList.get(i);
                int b = sourceDataList.get(j);
                if(b < a){
                    sourceDataList.set(i, b);
                    sourceDataList.set(j, a);
                }
            }
        }
        targetDataList.addAll(sourceDataList);
    }
}
