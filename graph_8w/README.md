+ [KRUSKALS ALGORITHM 2 minutes](https://www.youtube.com/watch?v=71UQH7Pr9kU)
+ [PRIMs algorithm 2 minutes](https://www.youtube.com/watch?v=cplfcGZmX7I)
+ [Intuitive explanation for Krustkal](https://www.quora.com/What-is-an-intuitive-explanation-of-Prims-algorithm)
+ [Kruskal vs Prim](https://www.quora.com/What-is-the-difference-in-Kruskals-and-Prims-algorithm)

+ Poolik Abimeetod omniva.csv lugemiseks

~~~java 
class Koordinaadid {
    public final String[] nimed;
    public final Double[][] koordinaadid;
    public final Integer n;
    public Koordinaadid(String[] nimed, Double[][] koordinaadid){
        this.nimed=nimed;
        this.koordinaadid=koordinaadid;
        this.n=nimed.length;
    }

    public void printMeOut(){
        for (int i=0;i<this.n;i++){
            System.out.println(i + ") " + this.nimed[i] + ": " + this.koordinaadid[i][0] + ";" + this.koordinaadid[i][1] );
        }
    }

}
//....TODO
public static Koordinaadid loeKaugusedFailist(String fail) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(fail)));
        ArrayList<String> nimed = new ArrayList<>();//br.readLine().split("\t");
        ArrayList<Double[]> koordinaadid = new ArrayList<>();
        String in = br.readLine();

        while(in != null){
            String[] reaJupid = in.split(",");
            //....TODO

        }

        //....TODO
        return new Koordinaadid(nimed_arr,
                koordinaadid_arr);
}
~~~

- Laiuskraad - Latitude (Näiteks Eesti laiuskraad on kuskil 58 ümber)
- Pikkuskraad - Longitude (Näiteks eesti pikkuskraad on umbes kuskil 26 ümber)


Latitude näide

![image](https://user-images.githubusercontent.com/21141607/144815059-e9378357-7525-4586-99f8-3e88f548aff5.png)



# VARIA
+ [How to get Cycles in directed graph](https://www.youtube.com/watch?v=0dJmTuMrUZM&t=107s)
+ [Disjoint Sets](https://www.youtube.com/watch?v=fNHLKhzEmVg)
+ Can you detect cycles with BFS,DFS ?
 + [Ideas for detecting cycles in graph](https://stackoverflow.com/questions/2869647/why-dfs-and-not-bfs-for-finding-cycle-in-graphs)
+ Disjoint sets to check if we have one graph then check how many edges . MUst be n-1 if we have 

