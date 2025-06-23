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
        int[] arr = {1, 3, 2, 5, 4, 6, 9, 8, 7};
        selectionSort(arr);
    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

}
