class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n= students.length;
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> stack = new Stack();

        for(int i=0; i<n; i++){
            stack.push(sandwiches[n-i-1]);
            q.add(students[i]);
        }
        int count =0;


        while(!q.isEmpty() && count < q.size() ){
            if(stack.peek()==q.peek()){
                stack.pop();
                q.poll();
                count=0;


            }
            else{
                q.add(q.peek());
                count++;
                q.poll();
            }
        }

        return count;
    }
}