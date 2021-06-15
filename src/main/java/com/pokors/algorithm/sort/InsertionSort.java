package com.pokors.algorithm.sort;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @author andrew.liuhp@foxmail.com
 * @version V1.0
 * @since 2021/4/29 11:15
 */
public class InsertionSort {

    /**
     * 插入排序
     *
     * 思路：将一个记录插入到已经排好序的有序表中，从而一个新的、记录数增1的有序表。在其实现过程使用双层循环，外层循环对除了第一个元素之外的所有元素，内层循环对当前元素前面有序表进行待插入位置查找，并进行移动。
     * 平均时间复杂度：O(n^2)
     * 最好时间复杂度：O(n)
     * 最坏时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     * 稳定性：稳定
     *
     * @param arr
     */
    public static void insertionSort(int[] arr) {

        // 边界值判断
        if (arr == null || arr.length <= 0) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {

            for (int j = i; j > 0 ; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = new int[] {5, 2, 4, 6, 1, 3};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
