class Solution {

    public boolean isCycleUtil(List<List<Integer>> graph, boolean vis[], boolean recursion[], int curr){
        vis[curr] = true;
        recursion[curr]= true;

        for(int i : graph.get(curr)){
            if(!vis[i] && isCycleUtil(graph, vis, recursion, i)){
                return true;
            }
            else if(recursion[i]){
                return true;
            }
        }

        recursion[curr] = false;
        return false;
        
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        int n = numCourses;
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }

        for(int pair[] : prerequisites){
            int a = pair[0];
            int b = pair[1];

            graph.get(b).add(a);
        }

        boolean vis[] = new boolean[n];
        boolean recursion[] = new boolean[n];

        for( int i=0; i<n; i++){
            if(!vis[i] && isCycleUtil(graph, vis, recursion, i)){
                return false;
            }
        }

        return true;

    }
}