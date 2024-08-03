class Solution {
    
    class Info {
        int v;
        int cost;
        int stops;
        
        Info(int v, int c , int s){
            this.v= v ;
            this.cost = c;
            this.stops = s;
        }
    }
    
    static class Edge{
        int src;
        int des; 
        int wt;
        
        Edge(int s, int d, int w){
            this.src = s;
            this.des = d;
            this.wt = w;
        }
    }
    
    public static void createGraph(int[][] flights, ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i=0; i<flights.length; i++){
            int src = flights[i][0];
            int des = flights[i][1];
            int wt = flights[i][2];
            
            Edge e = new Edge(src, des, wt);
            graph[src].add(e);
        }
    }
    
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(flights, graph);
        Queue<Info> q = new LinkedList<>();
        int dist [] = new int[n];
        for(int i=0; i<dist.length; i++){
            if(i!= src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        int finalCost=0;
        q.add(new Info(src,0,0));
        
        while(!q.isEmpty()){
            Info curr = q.remove();
            
            if(curr.stops > k){
                break;
            }
            
            for(int i=0; i<graph[curr.v].size(); i++){
                Edge e = graph[curr.v].get(i);
                
                if(curr.stops<=k && curr.cost+e.wt < dist[e.des]){
                    dist[e.des] = curr.cost+e.wt;
                    q.add(new Info(e.des, dist[e.des], curr.stops+1));
                }
            }
        }
        
        if(dist[dst]== Integer.MAX_VALUE){
            return -1;
        }
        else{
            return dist[dst];
        }
    }
}