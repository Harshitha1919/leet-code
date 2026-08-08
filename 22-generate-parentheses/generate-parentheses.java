class Solution {
    public List<String> generateParenthesis(int n) {
      
          List<String> ans = new ArrayList<>();
        BackTrack("",0,0,n,ans);
        return ans;
    }
    public void BackTrack(String s,int open,int close,int n,List<String> ans){
        if(open==n && close==n){
            ans.add(s);
            return;
        }
        if(open<n){
            BackTrack(s+"(",open+1,close,n,ans);
        }
        if(close<open){
            BackTrack(s+")",open,close+1,n,ans);
        }
    }
}