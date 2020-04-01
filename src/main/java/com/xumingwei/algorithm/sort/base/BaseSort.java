package com.xumingwei.algorithm.sort.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Description:
 * @author: xumingwei
 * @date: 2019—12—19 14:10
 */
public abstract class BaseSort {

    /**
     * 随机生成数据
     * @return
     */
    private List<Integer> loadData(){
        int NUM = 50;
        List<Integer> initDataList = new ArrayList<>(NUM);
        Random random = new Random();
        for (int i = 0; i < NUM; i++) {
            initDataList.add(random.nextInt(100));
        }
        System.out.println("排序前：" + initDataList);
        return initDataList;
    }

    /**
     * 输出结果到控制台
     */
    private void writeData(List<Integer> dataList){
        System.out.println("排序后："  + dataList);
    }

    public void sort(){
        List<Integer> sourceDataList = loadData();
        List<Integer> tagetDataList = new ArrayList<>(sourceDataList.size());
        long start = System.currentTimeMillis();
        algorithm(sourceDataList, tagetDataList);
        long end = System.currentTimeMillis();
        writeData(tagetDataList);
        System.out.println("耗时：" + (end - start) + " 毫秒");
    }

    /**
     * 具体排序算法，由子类实现
     * @param sourceDataList
     * @param targetDataList
     */
    public abstract void algorithm(List<Integer> sourceDataList, List<Integer> targetDataList);
}
