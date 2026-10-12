package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void swap(int[] arr) {
        int minI = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < arr[minI]){
                minI = i;
            }
        }
        int temp = arr[0];
        arr[0] = arr[minI];
        arr[minI] = temp;
    }

}