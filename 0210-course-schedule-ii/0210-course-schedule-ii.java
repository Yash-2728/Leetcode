class Solution {
    boolean hasCycle;


    public void dfs(List<List<Integer>> graph,boolean visited[], boolean inrecursion[],Stack<Integer> s, int curr){
        visited[curr] = true;
        inrecursion[curr] = true;

        for(int i : graph.get(curr)){
            if(!visited[i]){
                dfs(graph, visited, inrecursion, s, i);
            }
            if(inrecursion[i]==true){
                hasCycle = true;
                return;
            }
        }

        s.push(curr);
        inrecursion[curr] = false;
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        hasCycle = false;
        for(int i=0; i<numCourses; i++){
            graph.add(new ArrayList<>());
        }

        for(int pair[]: prerequisites){
            int a = pair[0];
            int b =pair [1];

            graph.get(b).add(a);
        }

        boolean visited[] = new boolean[numCourses];
        boolean inrecursion[] = new boolean[numCourses];
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<numCourses; i++){
            if(!visited[i]){
                dfs(graph, visited, inrecursion, s, i);
            }
        }

        int res[] = new int[numCourses];

        
        if(!hasCycle){
            int k=0;
            while(!s.isEmpty()){
                res[k] = s.pop();
                k++;
            }

            return res;
        }

        return res;


        
    }
}