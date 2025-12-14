class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
      String lower = paragraph.toLowerCase().replaceAll("[^a-z ]", " ");
      HashSet<String> hs1 = new HashSet<>();
for (String b : banned) {
    hs1.add(b.toLowerCase());
}
        String [] arr=lower.split("\\s+");
        HashMap<String,Integer> hs=new HashMap<>();
        for(int i=0;i<arr.length;i++){
         hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
        }
        int max1=0;
        String ans="";
        for(String key:hs.keySet()){
            if(!hs1.contains((key))){
                 
                  if(max1<hs.get(key)){
                    ans=key;
                    max1=hs.get(key);
                  }
            }
        }
        return ans;
    }
}