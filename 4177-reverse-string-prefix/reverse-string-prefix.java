class Solution {
    public String reversePrefix(String s, int k) {
        String sub=s.substring(0,k);
        
          String rev = new StringBuilder(sub).reverse().toString();
        String sub2=s.substring(k);
        String ans=rev+sub2;
        return ans;

    }
}