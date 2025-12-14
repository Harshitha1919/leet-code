class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> hs=new HashSet<>();
      int k=0;
        for(int i=0;i<s.length();i++){
            if(hs.contains(s.charAt(i))){
               k=i;
                break;
            }
            hs.add(s.charAt(i));
        }
        return s.charAt(k);
    }
}