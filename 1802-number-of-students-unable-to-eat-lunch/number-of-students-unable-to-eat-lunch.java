class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> s=new Stack<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<students.length;i++){
            q.add(students[i]);
        }
       for (int i = sandwiches.length - 1; i >= 0; i--) {
    s.push(sandwiches[i]);
}
        int flag=0;
        while(s.size()>0){
            if(s.peek()==q.peek()){
                flag=0;
                s.pop();
                q.poll();
            }
            else{
              flag++;
                 if(flag==q.size()){
                    return q.size();
                 }  
              int  x=q.poll();
                q.add(x);
                 
            }
        }
        return q.size();

    }
}