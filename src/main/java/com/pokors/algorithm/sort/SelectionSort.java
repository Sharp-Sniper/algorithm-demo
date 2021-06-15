package com.pokors.algorithm.sort;

import java.util.Arrays;

/**
 * 选择排序
 *
 * @author andrew.liuhp@foxmail.com
 * @version V1.0
 * @since 2021/4/29 09:53
 */
public class SelectionSort {

    /**
     * 选择排序
     *
     * 思路：首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
     * 平均时间复杂度：O(n^2)
     * 最好时间复杂度：O(n^2)
     * 最坏时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     * 稳定性：不稳定
     *
     * @param arr
     */
    public static void selectionSort(int[] arr) {

        // 边界值判断
        if (arr == null || arr.length <= 0) {
            return;
        }

        // 交换次数
        for (int i = 0; i < arr.length - 1; i++) {
            // 先假设每次循环时，最小数的索引为i
            int minIndex = i;
            //每一个元素都和剩下的未排序的元素比较
            for (int j = i + 1; j < arr.length; j++) {
                //寻找最小数
                if (arr[j] < arr[minIndex]) {
                    //将最小数的索引保存
                    minIndex = j;
                }
            }
            //经过一轮循环，就可以找出第一个最小值的索引，然后把最小值放到i的位置
            swap(arr, i, minIndex);
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {22, 8, 16, 5, 14, 17};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
