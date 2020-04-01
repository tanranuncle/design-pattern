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
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort();
    }

    @Test
    public void testSelectionSort(){
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort();
    }
}
