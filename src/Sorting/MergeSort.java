package Sorting;

import java.util.Scanner;

public class MergeSort {

    public static void printManager(String s){
    }



    public void mergeSort(int[] arr, int[] arr2){


    }

    public static int[] mergeTwoSortedArray(int[] a, int[]b){

        int[] result = new int[a.length + b.length];
        int i=0; //Pointer for a
        int j=0; //Pointer for b
        int k=0; //Pointer of result

        while (i<a.length && j < b.length){

            if(a[i] < b[j]){
                result[k] = a[i];
                i++;
                k++;

            }else{
                result[k] = b[j];
                j++;
                k++;
            }


        }

        while (i< a.length){
            result[k] = a[i];
            i++;
            k++;
        }

        while (j< b.length){
            result[k] = b[j];
            j++;
            k++;

        }

        return result;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        printManager(s);


    }
}
