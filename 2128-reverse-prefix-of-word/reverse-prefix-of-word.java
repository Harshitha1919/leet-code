class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack=new Stack<>();
        int k=0;
        StringBuilder sb=new StringBuilder(word);
        int flag=0;
     for(int i=0;i<word.length();i++){
          if(word.charAt(i)==ch){
            flag=1;
            break;
          }
     }
     if(flag==0){
        return word;
     }
        for(int i=0;i<word.length();i++){
               if(word.charAt(i)!=ch){
                stack.push(word.charAt(i));
               }
               else{
                stack.push(word.charAt(i));
                k=i+1;
               break;
               }
        }
          StringBuilder x=new StringBuilder("");
        while(stack.size()>0){
            x.append(stack.pop());
        }
        for(int i=k;i<word.length();i++){
            x.append(word.charAt(i));
        }
        return x.toString();
    }
}