+ [FloydWarshall algorithm explanation](https://www.youtube.com/watch?v=4NQ3HnhyNfQ)
+ [My explanation of the Floyd-Warshall algorithm](https://www.youtube.com/watch?v=QY4Oahva-iA&t=17s)
+ [BFS on graph](https://www.youtube.com/watch?v=oDqjPvD54Ss)

![image](https://user-images.githubusercontent.com/21141607/143672555-40dc4114-dccd-4746-b589-36646c9de40a.png)
+ [BFS example](https://favtutor.com/blogs/breadth-first-search-python)
+ [Dijkstra idea in 3 minutes](https://www.youtube.com/watch?v=_lHSawdgXpI)
+ [Dijkstra Java code examples](https://www.baeldung.com/java-dijkstra)
+ Algoritmid ja andmestruktuurid (LTAT.03.005) kursuselt
~~~java
    public void loeKaugusedFailist(String fail) throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader(new File(fail)))){
            nimed = br.readLine().split("\t");
            kaugused = new int[nimed.length][nimed.length];
            linnaIndeksid = new HashMap<>();
            for(int i=0; i < nimed.length; i++){
                linnaIndeksid.put(nimed[i],i);
            }
            String in = br.readLine();
            int i = 0;
            while(in != null){
                String[] reaJupid = in.split("\t");
                for(int j=1;j<reaJupid.length;j++){
                    if(!reaJupid[j].equals("")){
                        kaugused[i][j-1] = Integer.parseInt(reaJupid[j]);
                    } else {
                        kaugused[i][j-1] = 0;
                    }
                }
                i++;
                in = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
~~~
