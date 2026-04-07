class Solution {
    public int mirrorFrequency(String s) {
        HashMap<Character,Integer> hs=new HashMap<>();
        HashSet<Character> hs1=new HashSet<>();
        for(int i=0;i<s.length();i++){
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);

        }
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char m;
            if(Character.isLetter(ch)){
            m = (char) ('a' + (25 - (ch - 'a')));
            }
            else {
                 m=(char)('0'+(9-(ch-'0')));
            }
            int k=0;
            int l=0;
            if(hs1.contains(ch)|| hs1.contains(m)){
                continue;
            }
            else{
            if(hs.containsKey(s.charAt(i))){
             k=hs.get(s.charAt(i));
            }
            if(hs.containsKey(m)){
                 l=hs.get(m);
            }
            }
            ans=ans+Math.abs(k-l);
            hs1.add(m);
            hs1.add(ch);
        }
        return ans;
    }
}