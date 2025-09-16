class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hs=new HashMap<>();
           HashMap<Character,Integer> hs1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
             hs1.put(t.charAt(i),hs1.getOrDefault(t.charAt(i),0)+1); 
        }
        return hs.equals(hs1);
    }
}