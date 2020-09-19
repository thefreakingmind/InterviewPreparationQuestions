package Arrays;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FlipZero {

    public static void main(String[] args) {

        int[] arr = new int[]{
                1, 1, 0, 1, 1, 0, 1, 0, 1, 1
        };

        /**
         * Changed Array
         */

        List<Integer> newList = new ArrayList<>();

        int sequence = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                sequence++;

            }
        }


        System.out.println(newList);








    }
}
