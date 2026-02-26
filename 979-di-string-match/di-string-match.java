class Solution {
    public int[] diStringMatch(String s) {
        int j=0;
        int k=0;
        int l=s.length();
        int ans[]=new int[s.length()+1];
        for(int i=0;i<s.length();i++){
                 if(s.charAt(i)=='I'){
                    ans[j]=k;
                    j++;
                    k++;
                 }
                 else{
                    ans[j]=l;
                    l--;
                    j++;
                 }
        }
        ans[s.length()]=l;
        return ans;
    }
}