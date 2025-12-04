class Solution {
    public int secondHighest(String s) {
           ArrayList<Integer> arr=new ArrayList<>();
           for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
              int h=s.charAt(i)-'0';
              if(!arr.contains(h)){
                arr.add(h);
              }
            }
           }
           Collections.sort(arr);
           if(arr.size()>=2){
            return arr.get(arr.size()-2);
           }
           else{
            return -1;
           }
    }
}