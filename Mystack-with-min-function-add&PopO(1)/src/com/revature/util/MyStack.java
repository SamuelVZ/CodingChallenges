package com.revature.util;

import java.util.*;

public class MyStack{


    int min = 0;
    LinkedList<Integer> list;
    List<Integer> minValues;

    public MyStack(){
        this.list = new LinkedList<Integer>();
        this.minValues = new ArrayList<>();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int addElement(int a){
        minValues.add(a);
        list.add(a);
        return list.getFirst();
    }

    public void removeElement(){
        if (list.isEmpty()){
            throw new EmptyStackException();
        }
        minValues.remove(list.getFirst());
        list.removeFirst();

    }

    public int minValue(){
        Collections.sort(minValues);
        return minValues.get(0);
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "min=" + min +
                ", list=" + list +
                ", minValues=" + minValues +
                '}';
    }
}
