class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        
        int count1=0;
       
        for(int i=0;i<text.length();i++){
            int j=i;
             boolean flag=true;
         while (j < text.length() && text.charAt(j) != ' ') {
                if(brokenLetters.indexOf(text.charAt(j))!=-1){
                    flag=false;
                   
                }
                j++;
            }
            if(flag){
                count1++;
            }
            i=j;
        }
        return count1;
    }
}