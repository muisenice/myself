/*
 * @(#)index 1.0 2025/6/23
 *
 * Copyright (c) 2017, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * 描述
 *
 * @author scars
 * @since 0.1.0
 */
public class index {
    public static void main(String[] args) {
        System.out.println("hello world");

        int[] arr = {1, 3, 2, 5, 4};
        optimizedBubbleSort(arr);

    }

    /**
     * 冒泡排序优化
     *
     * @param arr
     */
    public static void optimizedBubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // 如果没有交换，说明已经有序
            if (!swapped) break;
        }
    }

}
