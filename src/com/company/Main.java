package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double[] elements = {1.1, -13.2, 5.4, 2.3, -10.3, 0.2, 5.5, -4.4, 1.2, 3 - 1.2, 21.5, 40.3, -17.1, 2.2, 11.1};
        int i;
        double sum = 0;
        int col = 0;
        boolean pol = false;

        for (double avg: elements ) {
            if (avg < 0 ){
                pol = true;
            }else{
                if (pol){
                    col++;
                    sum += avg;
                }
            }

        }
        System.out.println("Среднее арифметическая = " + sum / col );
        sortirovka(elements);
        System.out.println(Arrays.toString(elements));
        }
        public static void sortirovka (double[] sort ){
            for (int i = 0; i < sort.length; i++) {
               double minznach = sort[i];
                for (int j = i; j < sort.length; j++) {
                   if (minznach > sort[j]){
                       double min = minznach;
                       minznach = sort[j];
                       sort[j] = min;
                   }
                }
                sort[i] = minznach;
            }
        }

    }





