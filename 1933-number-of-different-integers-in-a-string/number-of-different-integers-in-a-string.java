class Solution {
    public int numDifferentIntegers(String word) {
        StringBuilder sb=new StringBuilder(word);
        for(int i=0;i<sb.length();i++){
            char h=sb.charAt(i);
           if(Character.isLetter(h)){
           sb.setCharAt(i, ' ');
           }
        }
        String str="";
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!=' '){
                str=str+sb.charAt(i);
            }
            else{
                if(!str.isEmpty() && !str.equals("")){
                     str = str.replaceFirst("^0+", "");
                     if(str.equals("")){
                        hs.add("0");
                     }
                     else{
                      hs.add(str);
                     }
                }
                str="";
            }
        }
        if (!str.isEmpty()) {
    str = str.replaceFirst("^0+", "");
    if (str.equals("")) str = "0";
    hs.add(str);
}
        return hs.size();
    }
}