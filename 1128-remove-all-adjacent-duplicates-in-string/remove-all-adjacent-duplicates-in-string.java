class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && stack.peek()==s.charAt(i)){
                stack.pop();
                continue;
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        String x="";
        while(stack.size()>0){
            x=stack.pop()+x;
        }
        return x;
    }
}