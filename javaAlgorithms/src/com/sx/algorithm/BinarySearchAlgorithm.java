package com.sx.algorithm;

/**
 * 二分查找
 * 前提：数组必须先有序
 */
public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int arr[] = new int[10000];
        for (int i=0;i<10000;i++) {
            arr[i] = i;
        }
        System.out.println(binarySearch(arr,34));
    }
    private static int binarySearch(int arr[],int value){
        int start = 0;  //开始下标
        int end = arr.length - 1;  //结束下标
        int middle;
        while (start <= end){
            middle = (start + end)/2;  //从中间开始找
            if (value == arr[middle]){  //找到了就输出下标
                return middle;
            }else if(value > arr[middle]){  //如果大于中间则继续查找右边
                start = middle + 1;
            }else{  //如果小于中间则继续查找左边
                end = middle - 1;
            }
        }
        return -1;
    }
}
