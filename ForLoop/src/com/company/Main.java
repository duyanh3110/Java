package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        /*while(count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }*/

//        for(int i=1; i<7; i++) {
//            System.out.println("Count value is " + count);
//        }

//        for(count = 1; count != 6; count++) {
//            System.out.println("Count value is " + count);
//        }

        /*do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);*/

        int number = 4;
        int finishNumber = 20;
        int evenNumberFound = 0;

        while(number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }

            evenNumberFound++;
            if(evenNumberFound >= 5) {
                break;
            }

            System.out.println("Even number " + number);
        }

        System.out.println("Total even numbers found = " + evenNumberFound);
    }

    public static boolean isEvenNumber(int number) {
        return (number % 2) == 0;
    }
}
