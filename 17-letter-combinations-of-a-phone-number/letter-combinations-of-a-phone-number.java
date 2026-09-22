class Solution {
    public void solve(String digits, int start,StringBuilder temp,HashMap<Character,String> hs,List<String> ls){
        if(start==digits.length()){
            ls.add(temp.toString());
            return;
        }
        String str=hs.get(digits.charAt(start));
        for(int i=0;i<str.length();i++){
            temp.append(str.charAt(i));
            solve(digits,start+1,temp,hs,ls);
            temp.deleteCharAt(temp.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ls=new ArrayList<>();
        HashMap<Character,String> hs=new HashMap<>();
          hs.put('1',"");
          hs.put('2',"abc");
          hs.put('3',"def");
          hs.put('4',"ghi");
          hs.put('5',"jkl");
          hs.put('6',"mno");
          hs.put('7',"pqrs");
          hs.put('8',"tuv");
          hs.put('9',"wxyz");
           
           StringBuilder temp=new StringBuilder();
    solve(digits,0,temp,hs,ls);
        return ls;
          
    }
}