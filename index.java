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
        insertionSort(new int[]{1, 3, 2, 5, 4});
    }

    /**
     * 插入排序
     * @param arr
     */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

}
