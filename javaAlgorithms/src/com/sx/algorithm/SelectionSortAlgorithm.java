package com.sx.algorithm;

/**
 * 平均时间复杂度O(n2)
 * 最坏时间复杂度O(n2)
 * 最好时间复杂度O(n2)
 * 空间复杂度O(1)
 * 不稳定
 */
public class SelectionSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        selectionSort(arr);
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
    private static void selectionSort(int arr[]){
        int min,temp;
        for (int i = 0 ;i< arr.length-1;i++){  //选择次数，从第一个元素开始
            min = i;  //默认第一个为最小的
            for (int j = i + 1;j<arr.length ;j++){  //从默认最小元素后开始寻找比第一个小的
                if(arr[j]<arr[min]){  //找到了就交换
                    min = j;
                }
            }
            if(min != i){  //将最小的元素放到默认最小的位置，此时这个元素就是最小元素，再从它的后一个继续进行选择
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
