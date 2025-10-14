class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> ar=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            ar.add(words[i]);
        }
        
        for(int i=ar.size()-1;i>0;i--){
            
            int flag=0;
            String w=ar.get(i);
            String w1=ar.get(i-1);
            char k[]=w.toCharArray();
             char k1[]=w1.toCharArray();
             Arrays.sort(k);
             Arrays.sort(k1);
            
             if(Arrays.equals(k,k1)){
              ar.remove(i);
              
             }
             
            

        }
        
       
        return ar;
    }
}