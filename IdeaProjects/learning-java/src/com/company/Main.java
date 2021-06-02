package com.company;

import java.util.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //ArrayLists are more 'interactive' while Arrays use less memory
        //Stacks are more computationally expensive and rarely used in the frontend, LIFO principle
        //The Que uses FIFO principle so it's basically a stack in reverse
        //We can use LinkedLists to make Stacks, Ques, etc it is a backer
        Hashtable<String, Double> carMPG = new Hashtable<String, Double>();

        carMPG.put("Rav4", 31.5);
        carMPG.put("Sierra", 26.5);
        carMPG.put("Camaro", 26.0);
        carMPG.put("Chrystler300", 24.5);
        carMPG.put("Explorer", 27.5);

        //System.out.println( hashtable );

        Enumeration<String> keys = carMPG.keys();

        while(keys.hasMoreElements()){
            System.out.println(keys.nextElement());
        }
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
