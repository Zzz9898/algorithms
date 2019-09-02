package com.sx.algorithm;

/**
 * 平均时间复杂度O(nlog2n)
 * 最坏时间复杂度O(n2)
 * 最好时间复杂度O(nlog2n)
 * 空间复杂度O(nlog2n)
 * 不稳定
 */
public class QuickSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        quickSortAlgorithm(arr, 0, arr.length-1);
        for (int item : arr) {
            System.out.print(item+ " ");
        }
    }

    private static void quickSortAlgorithm(int arr[],int low,int high){
        int min,max,temp,minValue;
        if(low > high){ //设置跳出条件
            return ;
        }
        min = low;
        max = high;
        //让第一个元素为基准
        minValue = arr[low];
        while (min < max){
            while(minValue <= arr[max] && min < max){  //从最右的一边寻找比基准小的
                max --;
            }
            while(minValue >= arr[min] && min < max){ //从最左的一边寻找比基准大的
                min ++;
            }
            if(min < max){  //最小的和最大的互换
                temp = arr[min];
                arr[min] = arr[max];
                arr[max] = temp;
            }
        }
        //将基准与min互换
        arr[low] = arr[min];
        arr[min] = minValue;
        //此时左边都是比基准小的，右边都是比基准大的，遍历基准左右两边的数组
        quickSortAlgorithm(arr,low,min-1);
        quickSortAlgorithm(arr,min+1,high);
    }
}
