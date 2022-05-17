package com.revature.main;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("result reversed on a linked list: " + sumLinkedList(a, b));

    }


    public static List<Integer> sumLinkedList(int a, int b){
        StringBuilder firstResult = new StringBuilder();
        StringBuilder secondResult = new StringBuilder();
        int temp;
        int result;

        List<Integer> first = new LinkedList<>();
        String firstNumber = a + "";

        List<Integer> second = new LinkedList<>();
        String secondNumber = b + "";

        for(int i = firstNumber.length()- 1; i >= 0  ;i --){

            first.add(Character.getNumericValue(firstNumber.charAt(i)));
        }

        for(int i = secondNumber.length()- 1; i >= 0  ;i --){

            second.add(Character.getNumericValue(secondNumber.charAt(i)));
        }


       for(int i = first.size() - 1; i >= 0; i--){

           temp = first.get(i);
           firstResult.append(temp);
       }

        for(int i = second.size() - 1; i >= 0; i--){

            temp = second.get(i);
            secondResult.append(temp);
        }

        int sumFirst = Integer.parseInt(firstResult.toString());
        int sumSecond = Integer.parseInt(secondResult.toString());

        result = sumFirst + sumSecond;

        List<Integer> resultList = new LinkedList<>();
        String resultString = result + "";

        for(int i = resultString.length()- 1; i >= 0  ;i --){

            resultList.add(Character.getNumericValue(resultString.charAt(i)));
        }

        return  resultList;
    }
}
