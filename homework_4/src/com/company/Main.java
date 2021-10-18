package com.company;


import java.util.HashMap;

class Isik {
    int ID;
    String nimi;
    int palk;
    int vanus;
    Isik(int ID, String nimi, int kaal, int vanus) {
        this.ID = ID;
        this.nimi = nimi;
        this.palk = palk;
        this.vanus = vanus;
    }
    public int getID() {
        return ID;
    }
    public String getNimi() {
        return nimi;
    }
    public double getPalk() {
        return palk;
    }
    public double getVanus() {
        return vanus;
    }
    public String toString() {
        return "Isik nr." + ID + " " + nimi;
    }
}




class Ylesanne1 {
    public  static  int naiivneUnikaalseteElementideKontroll(Integer[] elemendid){
        int n = elemendid.length;
        int uniqueElementsCount = 0;
        for (int i = 0 ; i<n; i++){
            boolean lastUnique=true;
            for (int j=i+1;j<n;j++){
                if (elemendid[i]==elemendid[j]){
                    lastUnique=false;
                }
            }
            if (lastUnique==true){
                uniqueElementsCount++;
            }
        }
        return uniqueElementsCount;
    }

    public static int intelligentneUnikaalsusKontroll(Integer[] elemendid){
        HashMap<Integer,Integer> uniqueElements = new HashMap<>();
        for (int i=0;i<elemendid.length;i++){
            uniqueElements.put(elemendid[i],1);
        }
        return uniqueElements.size();
    }

    public static void demonstreeriLahendust(){

        Integer [] testList = {1,1,1,2,2,3,4};
        int naiv=naiivneUnikaalseteElementideKontroll(testList);
        int intelligent=intelligentneUnikaalsusKontroll(testList);
        System.out.println(naiv);
        System.out.println(intelligent);
    }

}


// https://99faqs.com/how-to-use-java-to-implement-open-addressing/
class IsikudOpenAdressingLinearProbing {
    Isik[] isikuteList;
    int N;

    IsikudOpenAdressingLinearProbing(int N) {
        isikuteList = new Isik[N];
        this.N = N;
    }
    public void prindiAndmeStruktuur(){
        System.out.println("Praegune Seis isikute listis");
        for(int i = 0;i<N;i++){
            Isik isik = isikuteList[i];
            if (isTombStone(i)){
                System.out.println("Positsioonil "+ i + " on kustutatud element");
            }else if (!isEmptyForPlacement(i)){
                System.out.println("Positsioonil "+ i + " asub "+isik.nimi +" id-ga "+ isik.ID);
            }

        }
        System.out.println();
    }
    private boolean isEmptyForPlacement(int idx){
        if(isikuteList[idx]==null || isTombStone(idx)){
            return true;
        }else return false;
    }
    private boolean isTombStone(int idx){
        if (isikuteList[idx]!=null){
            if(isikuteList[idx].nimi=="HAUD"){
                return true;
            }else return false;
        }
        return false;
    }

    public int lisaElement(Isik isik) {
        int kontrollitud=0;
        int positsioon = isik.ID % N;
        while (!isEmptyForPlacement(positsioon)) {
            kontrollitud++;
            positsioon = (positsioon + 1) % N;
            if (kontrollitud>N) {
                return -1;
            }
        }
        isikuteList[positsioon] = isik;
        prindiAndmeStruktuur();
        return positsioon;
    }


    public int otsiElement(int id){
        int positsioon = id%N;
        int kontrollitud=0;
        while (kontrollitud<N && isikuteList[positsioon] != null) {
            if (isikuteList[positsioon].getID() == id) {
                //System.out.println("Isik id-ga " + id + " asub positsioonil " + positsioon);
                //System.out.println();
                return positsioon;
            }
            kontrollitud++;
            positsioon = positsioon + 1 % N;
        }
        return -1;
    }

    public boolean kustutaElement(int id){
        int idx = otsiElement(id);
        if (idx!=-1){
            isikuteList[idx].nimi="HAUD";
            prindiAndmeStruktuur();
            return true;
        }
        return false;
    }

}


class Ylesanne2 {
    public static void demonstreeriLahendust(){
        IsikudOpenAdressingLinearProbing isikud = new IsikudOpenAdressingLinearProbing(10);
        Isik isik = new Isik(10,"Rambo",10,10);
        Isik isik2 = new Isik(20,"Juhan",10,10);
        isikud.lisaElement(isik);
        isikud.lisaElement(isik2);
        System.out.println("Isik id-ga " + 10 + " asub positsioonil " + isikud.otsiElement(10));
        isikud.otsiElement(20);
        System.out.println("Isik id-ga " + 20 + " asub positsioonil " + isikud.otsiElement(20));
        System.out.println();
        isikud.kustutaElement(10);
        isikud.otsiElement(20);
    }
}

public class Main {

    public static void main(String[] args) {
        //IsikudOpenAdressingLinearProbing t = new IsikudOpenAdressingLinearProbing(10);
        //Ylesanne1.demonstreeriLahendust();
        Ylesanne2.demonstreeriLahendust();
    }
}
