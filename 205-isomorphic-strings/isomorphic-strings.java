class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hs=new HashMap<>();
        HashMap<Character,Character> hs1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!hs.containsKey(s.charAt(i))){
            hs.put(s.charAt(i),t.charAt(i));
            }
        }
         for(int i=0;i<t.length();i++){
            if(!hs1.containsKey(t.charAt(i))){
            hs1.put(t.charAt(i),s.charAt(i));
            }
        }
        String p="";
        for(int i=0;i<s.length();i++){
           if(hs.get(s.charAt(i))==t.charAt(i) && hs1.get(t.charAt(i))==s.charAt(i))
            p=p+hs.get(s.charAt(i));
        }
        if(p.equals(t)){
            return true;
        }

            
        return false;
    }
}