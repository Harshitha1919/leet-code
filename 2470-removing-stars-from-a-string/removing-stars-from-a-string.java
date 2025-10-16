class Solution {
    public String removeStars(String s) {
        ArrayList<Character> ar=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                ar.add(s.charAt(i));
            }
            else{
                ar.remove(ar.size()-1);
            }
        }
        String st="";
        for(int i=0;i<ar.size();i++){
            st=st+ar.get(i);
        }
        return st;
    }
}