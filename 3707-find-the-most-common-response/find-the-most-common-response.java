class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String,Integer> hs1=new HashMap<>();
          HashSet<String> hs=new HashSet<>();
        for(int i=0;i<responses.size();i++){
          
            for(int j=0;j<responses.get(i).size();j++){
                hs.add(responses.get(i).get(j));
            }
              for(String s:hs){
                hs1.put(s,hs1.getOrDefault(s,0)+1);
              }
               hs.clear();
        }
        String ans="";
        int max1=0;
        for(String k:hs1.keySet()){
            if(hs1.get(k)>max1){
                max1=hs1.get(k);
                ans=k;
            }
            else if(max1==hs1.get(k) && ans.compareTo(k)>0){
               ans=k;
            }
        }
        return ans;
    }
}