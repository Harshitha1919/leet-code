class Solution {
    public boolean backspaceCompare(String s, String t) {
        ArrayList<Character> ar=new ArrayList<>();
        ArrayList<Character> ar2=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                ar.add(s.charAt(i));
            }
            else{
                if(ar.size()>=1){
                  ar.remove(ar.size()-1);
                }
            }
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                ar2.add(t.charAt(i));
            }
            else{
                if(ar2.size()>=1){
                ar2.remove(ar2.size()-1);
                }
            }
        }
        if(ar.equals(ar2)){
            return true;
        }
        return false;
    }
}