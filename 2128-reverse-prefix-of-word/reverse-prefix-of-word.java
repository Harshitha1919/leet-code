class Solution {
    public String reversePrefix(String word, char ch) {
        int k=0;
        StringBuilder sb=new StringBuilder(word);
        int flag=0;
     for(int i=0;i<word.length();i++){
          if(word.charAt(i)==ch){
             k=i;
            flag=1;
            break;
          }
     }
     if(flag==0){
        return word;
     }
    StringBuilder prefix = new StringBuilder(sb.substring(0, k + 1)).reverse();
     prefix.append(sb.substring(k+1));
     
         
        return prefix.toString();
    }
}