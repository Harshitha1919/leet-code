class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> hs=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
         }
         for(int i=0;i<t.length();i++){
            if(hs.containsKey(t.charAt(i))){
                hs.put(t.charAt(i),hs.get(t.charAt(i))-1);
                if(hs.get(t.charAt(i))==0){
                    hs.remove(t.charAt(i));
                }
            }
            else{

                return false;
            }
            
         }
         return true;
    }
}