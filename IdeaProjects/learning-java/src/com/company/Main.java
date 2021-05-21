package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
    int [][] X = {{0,0,1}, {0,1,1}, {1,0,1}, {1,1,1}};
    int [][] y = {{0}, {0}, {1}, {1}};
    List<List<Float>> syn0 = generateWeights(4, 3, 2, 1);
    List<List<Float>> syn1 = generateWeights(4, 1, 2, 1);
    //for (int i = 0; i < 60000; i++){ int [][] l0 = X; }
        System.out.println(sigmoid((float) 0.78, false));
    }

    public static float sigmoid(float X, boolean deriv){
        if (deriv == true){
            return X * (1-X);
        }
        return (float) (1/(1+Math.exp(-1*X)));
    }
    public static List<List<Float>> generateWeights(int col, int row, int factor, int bias) {
        List<List<Float>> dataset = new ArrayList<>();
        for (int i = 0; i < row; i++){
        List<Float> column = new ArrayList<Float>();
        for (int j = 0; j < col; j++){
            column.add((float) (Math.random()*factor)-bias);
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
