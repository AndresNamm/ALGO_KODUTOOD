package com.company;

import java.util.ArrayList;
import java.util.Random;

/*****************************************************************************
 * Algoritmid ja andmestruktuurid. LTAT.03.005
 * 2021/2022 sügissemester
 *
 * Kodutöö 2
 * Teema: O
 * Järjendi summa, nii iteratiivselt kui ka rekursiivselt
 *
 * Autor: ANDRES NAMM
 *
 *
 *****************************************************************************/
class KasulikKlass{

    public static ArrayList<Integer> genereeriArvuJada(int n) {
        Random random = new Random();
        ArrayList<Integer> arr =  new ArrayList<Integer>();
        int min = 50;
        int max = 100;
        for (int i = 0; i < n; i++) {
            arr.add((int)Math.floor(Math.random()*(max-min+1)+min));
        }
        return arr;
    }
}

class Ylesanne0{
    public static void demonstreeriLahendust(){
        for ( int i =0;i<10;i++){
            System.out.println(i);
        }

    }

}


class Ylesanne1{
    public static void demonstreeriLahendust(){

    }
    public static void bitivektorOptimiseeritud(int k , String bitivektor, int n){
        //TODO: Prindi välja kõik bitivektorid, milles on parajasti k>0 ühte
    }
}

class Ylesanne2{
    public static void demonstreeriLahendust(){
        ArrayList<Integer> kaalud=KasulikKlass.genereeriArvuJada(10);
        for (int kaal : kaalud) {
            System.out.println(kaal);
        }
        ArrayList<ArrayList<Integer>> jaotus = jaotaKaaludKahteGrupp(kaalud);
        //TODO: Programm peab väljastama ekraanile kaalud ja jaotuse järjendite kujul.
        // Ekraanile väljastada ka osade kaalude summad (näiteks nagu 3. loengu 2. slaid).
        // TODO: leida suurim parameetri n väärtus, mille korral arvuti on võimeline 1 sekundi jooksul selliste lahutuste arvu leidma neid ekraanile väljastamata.

    }

    public static ArrayList<ArrayList<Integer>> jaotaKaaludKahteGrupp(ArrayList<Integer> kaalud){
        ArrayList<Integer> g1 = new ArrayList<Integer>();
        ArrayList<Integer> g2 = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> grupid = new ArrayList<ArrayList<Integer>>();
        grupid.add(g1);
        grupid.add(g2);
        //TODO: jaota kaalud võimalikult võrdsetesse gruppidesse
        return grupid;
    }
}

class Ylesanne3{
    public static void demonstreeriLahendust(){
        //TODO:Kirjutada rekursiivne meetod, mis väljastab ekraanile antud naturaalarvu n kõikvõimalikud lahutused liidetavate 1 ja 2 summadeks ja tagastab leitud lahutuste arvu.
        n_koikvoimalikud_lahutused(0,"",10);
        //TODO:Lisaülesandena leida võimaluste arv, kus lahutustes on keelatud mustrid (1, 2, 1) ja (2, 1, 2).
        //TODO: leida suurim parameetri n väärtus, mille korral arvuti on võimeline 1 sekundi jooksul selliste lahutuste arvu leidma neid ekraanile väljastamata.
    }

    public static boolean keelatud_mustrid(String pattern){
        //IMPLEMENTEERI KONTROLLMEETOD
        return true;
    }
    public static void n_koikvoimalikud_lahutused(int summa,String liidetavad, int soovitav_summa){
    }
}


class Ylesanne4{
    public static void genereeriAlamHulkadeSummad(){
        //TODO: Kas on ostetakse asi või ei osteta
    }
    public static void demonstreeriLahendust(){
        //TODO: Selleks kirjutada rekursiivne meetod, millele antakse ette täisarvujärjend ning mis tagastab selle järjendi kõikvõimalike alamhulkade summad
    }
}

class Ylesanne5{
    //https://www.geeksforgeeks.org/combinations-in-python-without-using-itertools/
    public static void genereeriKombinatsioonid(){
    }
    public static void demonstreeriLahendust(){
        //TODO: Kirjutada rekursiivne meetod, mis väljastab ekraanile antud järjendi kõik elementide kombinatsioonid etteantud arvu k > 0 kaupa.
        genereeriKombinatsioonid();
    }
}


class Ylesanne6{
    public static void demonstreeriLahendust(){
    }
}


public class Main{
    public static void main(String[] args) {
        Ylesanne0.demonstreeriLahendust();
//        Ylesanne1.demonstreeriLahendust();
//        Ylesanne2.demonstreeriLahendust();
//        Ylesanne3.demonstreeriLahendust();
//        Ylesanne4.demonstreeriLahendust();
//        Ylesanne5.demonstreeriLahendust();
//        Ylesanne6.demonstreeriLahendust();
    }
}




