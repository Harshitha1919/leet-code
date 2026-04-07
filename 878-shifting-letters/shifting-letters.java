class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] arr=s.toCharArray();
        int prev=0;
        int cum[]=new int[s.length()];
        for(int i=shifts.length-1;i>=0;i--){
            prev=(prev+shifts[i])%26;
            cum[i]=prev;
        }
        for(int i=0;i<shifts.length;i++){
              char ch=s.charAt(i);
              arr[i]=(char)('a'+((ch-'a'+cum[i])%26));
        }
  
        return new String(arr);
    }
}