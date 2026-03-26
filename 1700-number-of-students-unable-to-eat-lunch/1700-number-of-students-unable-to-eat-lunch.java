class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<students.length;i++){
           q.add(students[i]);
        }
        for(int i=sandwiches.length-1;i>=0;i--){
           st.push(sandwiches[i]);
        }
        int rej=0;
        while(!st.isEmpty() && !q.isEmpty()){
            if(st.peek()==q.peek()){
                q.poll();
                st.pop();
                rej=0;
            }else{
                q.add(q.poll());
                rej++;
                if(rej==q.size()){
                    return rej;
                }
            }
        }
        return rej;
    }
}