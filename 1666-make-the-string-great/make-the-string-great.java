class Solution {
    public String makeGood(String s) {
        Stack<Character> stack=new Stack<>();
     
        for(int i=0;i<s.length();i++){
            int a=s.charAt(i);
          
            if(stack.size()!=0){
                 int b=stack.peek();
                if(Math.abs(a-b)==32){
                 stack.pop();
                 continue;
                }
            }
         stack.push(s.charAt(i));

                
          
        }
       
        String x="";
        while(stack.size()>0){
            x=stack.pop()+x;
        }
        return x;
    }
}