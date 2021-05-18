package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person Antoine = new Person("Black", 212,true, "Nashville");
        Person Wu = new Person("Asian", 133, false, "Singapore");
        Person Chad = new Person("White", 158, false, "Los Angeles");
        System.out.println(Antoine.married);
    }

    static class Person {
        String race;
        int weight;
        boolean married;
        String city;

        Person(String race, int weight, boolean married, String city){
            this.race = race;
            this.weight = weight;
            this.married = married;
            this.city = city;
        };
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
