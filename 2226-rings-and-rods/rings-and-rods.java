class Solution {
    public int countPoints(String rings) {
       HashMap<Character, HashSet<Character>> hs = new HashMap<>();
        for(int i=1;i<rings.length();i=i+2){
                if(!hs.containsKey(rings.charAt(i))){
                    hs.put(rings.charAt(i),new HashSet<>());
                }
              
                    hs.get(rings.charAt(i)).add(rings.charAt(i-1));
               
        }
        int c=0;
        for(Character key:hs.keySet()){
            if(hs.get(key).size()==3){
                c++;
            }
        }
        return c;
    }
}