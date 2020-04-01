package com.xumingwei.algorithm.sort;

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
        //1、第一层循环，用于控制循环次数（即：循环 size 次）
        for (int i = 0; i < size; i++){
            //2、第二层循环，用于比较和交换。j元素代表光标所在元素
            //由于每次循环结束之后，最右侧已排序元素就会增加一个。因此光标移动的范围是在未排序元素之间，避免最右侧的重复比较。
            for(int j = 0 ; j < size -i - 1; j++){
                //3、当前光标所在元素
                int a = sourceDataList.get(j);
                //4、当前光标的后一位元素
                int b = sourceDataList.get(j + 1);
                //5、若前者比后者大，则交换位置（即：较大的泡泡逐渐上浮（右移））
                if(a > b){
                    sourceDataList.set(j, b);
                    sourceDataList.set(j + 1, a);
                }
            }
        }
        targetDataList.addAll(sourceDataList);
    }
}
