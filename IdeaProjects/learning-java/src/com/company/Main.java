package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
    int [][] X = {{0,0,1}, {0,1,1}, {1,0,1}, {1,1,1}};
    int [][] y = {{0}, {0}, {1}, {1}};
        System.out.println(generateRandom(3, 4));
    }

    //public static int [][] sigmoid(int [][] X, boolean deriv){
        //if(deriv == false){
            //return X * (1-X);}
        //return 1/(1+Math.exp(-X));
        //}

    public static List<List<Float>> generateRandom(int col, int row) {
        List<List<Float>> dataset = new ArrayList<>();
        for (int i = 0; i < row; i++){
        List<Float> column = new ArrayList<Float>();
        for (int j = 0; j < col; j++){
            column.add((float) Math.random());
        }dataset.add(column);}
        return dataset;
    }
}



// public -
// void -
// final -
// && - and
// || - or
// class -
// else is followed by a {}
// use switch when preforming selections on one value, no ands
