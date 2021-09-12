/*****************************************************************************
 * Algoritmid ja andmestruktuurid. LTAT.03.005
 * 2021/2022 sügissemester
 *
 * Kodutöö. Ülesanne nr 1
 * Teema: O
 * Järjendi summa, nii iteratiivselt kui ka rekursiivselt
 *
 * Autor: ANDRES NAMM
 *
 *
 *****************************************************************************/

package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Main {

    public static Integer[][] testCases = {{1,2,3,3},{},{0,2,1,111111},{1,2,3,12,1,2,3},{1}};

    /** Javadoc
     * create list with n elemnets in random order
     * <p>
     * @param n size .
     * @return n size list
     */
    public static Integer[] generateLargeTestCase(int n){
        Random random = new Random();
        Integer[] arr =  new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i]=random.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        ylesanne1();
        ylesanne2();
        ylesanne3();
    }

    public static void ylesanne1(){
        for (int i=0;i<Main.testCases.length;i++) {
            Integer[] arr =  Arrays.copyOf(testCases[i], testCases[i].length);;
            if (testIfSorted(bubbleSort(arr))) {
                System.out.println("PASSED:Array " + i + " is sorted.");
            } else {
                System.out.println("FAILED:Array " + i + " is not sorted.");
            }
        }
    }

    public static void ylesanne2(){
        for (int i=0;i<Main.testCases.length;i++) {
            Integer[] arr =  Arrays.copyOf(testCases[i], testCases[i].length);;
            if (testIfSorted(mergeSort(arr))) {
                System.out.println("PASSED:Array " + i + " is sorted.");
            } else {
                System.out.println("FAILED:Array " + i + " is not sorted.");
            }
        }
    }

    public static void ylesanne3(){
        ArrayList<Long> timings = new ArrayList<>();
        int startLength=5000;
        int endLength=10100000;
        for (int i = startLength; i < endLength; i+=500000){
            Integer[] arr = generateLargeTestCase(i);
            long start = System.currentTimeMillis();
            java.util.Arrays.sort(arr);
            long stop = System.currentTimeMillis();
            timings.add(stop-start);
            //TODO: YOU HAVE TO TIME THE SORTING ALGORITHMS AND BASED ON THAT CREATE A COMPARISON
            //TODO: THIS MEANS YOU NEED TO HAVE IMPLEMENTED SOME LOGIC TO STORE THE TIMING RESULTS
        }

        int addition=timings.size()/10;
        for (int i=0;i<timings.size();i=i+addition) {
            if (i<timings.size()){
                System.out.println(timings.get(i));
            }else {
                break;
            }
        }
    }

    public static boolean testIfSorted(Integer[] array){
        return false; //TODO: generate testing logic here
    }

    //TODO: implement one n2 complexity algorithm and one n log n complexity algorithm
    public  static Integer[] bubbleSort(Integer[] array){
        return array;
    }

    public  static Integer[] selectionSort(Integer[] array){
        return array;
    }

    public  static Integer[] insertionSort(Integer[] array){
        return array;
    }

    public  static Integer[] quickSort(Integer[] array){
        return array;
    }

    public  static Integer[] mergeSort(Integer[] array){
        return array;
    }

    public  static Integer[] shellSort(Integer[] array){
        return array;
    }
}
