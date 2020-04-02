package com.xumingwei.algorithm.sort;

import org.junit.Test;

/**
 * @Description: 排序算法测试
 * @author: xumingwei
 * @date: 2019—12—19 14:41
 */
public class SortTest {

    @Test
    public void testBubbleSort(){
        new BubbleSort().sort();
    }

    @Test
    public void testSelectionSort(){
        new SelectionSort().sort();
    }

    @Test
    public void testInsertionSort(){
        new InsertionSort().sort();
    }

    @Test
    public void testQuickSort(){
        new QuickSort().sort();
    }

    @Test
    public void testMergeSort(){
        new MergeSort().sort();
    }
}
