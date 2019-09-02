package com.sx.algorithm;

/**
 * 平均时间复杂度O(n2)
 * 最坏时间复杂度O(n2)
 * 最好时间复杂度O(n)
 * 空间复杂度O(1)
 * 稳定
 */
public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        bubbleSort(arr);
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
    private static void bubbleSort(int arr[]){
        int temp;
        for(int i = 0;i<arr.length -1; i++){  //冒泡的次数
            for (int j = 0;j<arr.length - i - 1;j++){  //一步步往后一个元素比较，如果比后面元素大则交换，保证直到最后面是最大的
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
