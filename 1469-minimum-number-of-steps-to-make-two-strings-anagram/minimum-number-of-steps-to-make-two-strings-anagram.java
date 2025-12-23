class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> hs=new HashMap<>();
        
         for(int i=0;i<s.length();i++){
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
         }
         int count=0;
          
         for(int i=0;i<t.length();i++){
            if(!hs.containsKey(t.charAt(i))){
                count++;
            }
            else{
                 hs.put(t.charAt(i),hs.get(t.charAt(i))-1);
                 if(hs.get(t.charAt(i))==0){
                    hs.remove(t.charAt(i));
                 }
            }
         }
       return count;
    }
}