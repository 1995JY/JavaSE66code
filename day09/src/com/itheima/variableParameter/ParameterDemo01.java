package com.itheima.variableParameter;

import java.util.List;

public class ParameterDemo01 {
    public static void main(String[] args) {
        System.out.println(getSum(1,2,5,6));
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }
    public static int getSum(int...a){
        int sum=0;
        for (int i : a) {
            sum+=i;
        }
        return sum;
    }
}
