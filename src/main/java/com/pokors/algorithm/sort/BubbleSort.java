package com.pokors.algorithm.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author andrew.liuhp@foxmail.com
 * @version V1.0
 * @since 2021/4/29 16:20
 */
public class BubbleSort {

    /**
     * 冒泡排序
     *
     * 思路：1.比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     * 2.对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
     * 3.针对所有的元素重复以上的步骤，除了最后一个。
     * 4.持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     *
     * 平均时间复杂度：O(n^2)
     * 最好时间复杂度：O(n)
     * 最坏时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     * 稳定性：稳定
     *
     * @param array
     */
    public static void bubbleSort(int[] array) {
        // 边界值判断
        if (array == null || array.length <= 0) {
            return;
        }

        // 记录最后一次交换的位置
        int lastExchangeIndex = 0;
        // 无序数列的边界，每次比较只需要比到这里为止
        int sortBorder = array.length - 1;

        for (int i = 0; i < array.length - 1; i++) {
            // 有序标记，每一轮的初始值都是true
            boolean isSorted = true;
            for (int j = 0; j < sortBorder; j++) {
                int tmp = 0;
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;

                    // 因为有元素进行交换，所以不是有序的，标记变为false
                    isSorted = false;
                    // 更新为最后一次交换元素的位置
                    lastExchangeIndex = j;
                }
            }
            sortBorder = lastExchangeIndex;
            if (isSorted) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] {3, 4, 2, 1, 5, 6, 7, 8};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

}
