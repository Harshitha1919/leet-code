class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character,Integer> hs=new HashMap<>();
        HashMap<Character,Integer> hs1=new HashMap<>();
        for(int i=0;i<target.length();i++){
            hs.put(target.charAt(i),hs.getOrDefault(target.charAt(i),0)+1);
        }


         for(int i=0;i<s.length();i++){
            if(hs.containsKey(s.charAt(i))){
            hs1.put(s.charAt(i),hs1.getOrDefault(s.charAt(i),0)+1);
            }
        }
        int min1=Integer.MAX_VALUE;
        for(Character ch:hs.keySet()){
           int k= hs.get(ch);
           
            min1=Math.min(min1,hs1.getOrDefault(ch,0)/k);
        }
        return min1;
    }
}