package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
    double[] workHours = {4, 4, 8, 8, 8.5, 9, 10, 10, 12, 12, 13, 10, 14, 8, 9, 8, 6, 9};
    double [] socialHours = {0, 9, 5, 6, 4, 4, 2, 1, 0, 1, 3, 4, 0, 5, 3.5, 5, 5.5, 3};
        //System.out.println(error(workHours, socialHours));
        System.out.println(workHours[17]);
        System.out.println(socialHours[17]);
    }

    public static double predict(double X){
        return (X * -1) + 13;
    }

    public static double error(double[] X, double[]y){
        double Error = 0;
        for (int i = 0; i < X.length; i++){
            double yHat = predict(X[i]);
            double delta = (yHat - y[i])*(yHat - y[i]);
            Error += delta;
            ;
        }
        return Error/ X.length;
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
