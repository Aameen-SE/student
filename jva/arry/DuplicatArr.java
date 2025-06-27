package jva.arry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicatArr {
    public static void main(String[] args) {
        //wap to find duplicate elements in an array?
        int[] arr= {12,23,43,45,32,45,321,356,67,43,56,12};

        List<Integer > res = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){

                    if(!res.contains(arr[i])){
                        res.add(arr[i]);
                    }
                    break;
                }
            }
        }
        System.out.println("Duplicate ELement in array : ");
        for(int i:res){
            System.out.print(i+" , ");
        }
    }
}
