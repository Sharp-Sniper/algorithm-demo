package com.pokors.algorithm.sort;

import java.util.Arrays;

/**
 * 鸡尾酒排序
 *
 * @author andrew.liuhp@foxmail.com
 * @version V1.0
 * @since 2021/6/3 22:52
 */
public class CocktailSort {

    public static void cocktailSort(int[] array) {
        // 边界值判断
        if (array == null || array.length <= 0) {
            return;
        }

        int tmp = 0;
        // 记录右边最后一次交换的位置
        int lastRightExchangeIndex = 0;
        // 无序数列的右边界，每次比较只需要比到这里为止
        int sortRightBorder = array.length - 1;
        // 记录左边最后一次交换的位置
        int lastLeftExchangeIndex = 0;
        // 无序数列的左边界，每次比较只需要比到这里为止
        int sortLeftBorder = 0;

        for (int i = 0; i < array.length / 2; i++) {
            // 有序标记，每一轮的初始值都是true
            boolean isSorted = true;
            // 奇数轮，从左向右比较和交换
            for (int j = i; j < sortRightBorder; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    // 有元素交换，所以不是有序的，标记变为false
                    isSorted = false;
                    // 更新为最后一次交换元素的位置
                    lastRightExchangeIndex = j;
                }
            }

            sortRightBorder = lastRightExchangeIndex;

            if (isSorted) {
                break;
            }

            // 在偶数轮之前，将isSorted重新标记为true
            isSorted = true;
            // 偶数轮，从右向左比较和交换
            for (int j = array.length - i - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                    // 有元素交换，所以不是有序的，标记变为false
                    isSorted = false;

                    //更新为最后一次交换元素的位置
                    lastLeftExchangeIndex = j;
                }
            }

            sortLeftBorder = lastLeftExchangeIndex;

            if (isSorted) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] {9, 2, 3, 4, 5, 6, 7, 8, 1};
        cocktailSort(array);
        System.out.println(Arrays.toString(array));
    }

}
