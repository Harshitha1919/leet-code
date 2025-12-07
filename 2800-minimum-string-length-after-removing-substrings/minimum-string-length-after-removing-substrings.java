class Solution {
    public int minLength(String s) {
        Stack<Character> h=new Stack<>();
        for(int i=0;i<s.length();i++){
                
                 if(!h.isEmpty() && s.charAt(i)=='B'){
                    if(h.peek()=='A'){
                        h.pop();
                    }
                    else{
                        h.push(s.charAt(i));
                    }
                }
                 else if(!h.isEmpty() && s.charAt(i)=='D'){
                    if(h.peek()=='C'){
                        h.pop();
                    }
                    else{
                        h.push(s.charAt(i));
                    }
                }
            else{
                h.push(s.charAt(i));
            }
        }
        return h.size();
    }
}