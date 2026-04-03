class Solution {
    public int residuePrefixes(String s) {
        int count=0;
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            hs.add(s.charAt(i));
            if((i+1)%3==hs.size()){
                count++;
            }
        }
        return count;
    }
}