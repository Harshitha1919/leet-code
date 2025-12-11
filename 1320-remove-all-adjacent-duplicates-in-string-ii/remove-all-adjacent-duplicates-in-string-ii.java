class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb=new StringBuilder();
        Stack<Integer> stack=new Stack<>();
       
        for(char c:s.toCharArray()){
            sb.append(c);
            if(sb.length()==1|| sb.charAt(sb.length()-1)!=sb.charAt(sb.length()-2)){
                stack.push(1);
            }
            else{
                
                stack.push(stack.pop()+1);
                if(stack.peek()==k){
                    sb.delete(sb.length()-k,sb.length());
                    stack.pop();
                }
            }

        }
        return sb.toString();
    }
}