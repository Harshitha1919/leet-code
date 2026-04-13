class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(int i=0;i<words.length;i++){
            String s=words[i];
            int k=0;
            int ans=1;
            if(s.length()>=pref.length()){
            while(k<pref.length()){
                if(s.charAt(k)!=pref.charAt(k)){
                    ans=0;
                    break;
                }
                k++;
            }
            
            if(ans!=0){
              count++;
            }
            }

        }
        return  count;

    }
}