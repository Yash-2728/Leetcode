class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0; i<isConnected.length; i++){
            graph.add(new ArrayList<>());
        }
        for (int i=0; i<isConnected.length; i++){
            for(int j=0; j<isConnected.length; j++){
                if(isConnected[i][j]==1 && i != j){
                    graph.get(i).add(j);
                }
            }
        }

        boolean visited[] = new boolean[graph.size()];
        int count =0; 

        for(int i=0; i<graph.size(); i++){
            
            if(!visited[i]){
                dfs(graph, i, visited);
                count++;
            }
        }

        return count;
    }

    public void dfs(ArrayList<ArrayList<Integer>> graph , int curr,  boolean visited[]){
        visited[curr] = true;

        for(int i: graph.get(curr)){
            if(!visited[i]){
                dfs(graph, i, visited);
            }
        }
    }
}