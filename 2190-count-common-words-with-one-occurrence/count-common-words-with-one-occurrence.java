class Solution {
    public int countWords(String[] words1, String[] words2) {
      HashMap<String,Integer> hs=new HashMap<>();
          HashMap<String,Integer> hs1=new HashMap<>();
        ArrayList<String> arr=new ArrayList<>();
      
      for(int i=0;i<words1.length;i++){
        hs.put(words1[i],hs.getOrDefault(words1[i],0)+1);
      }
      for(int i=0;i<words2.length;i++){
       hs1.put(words2[i],hs1.getOrDefault(words2[i],0)+1);
      }
      for(String x:hs.keySet()){
        if(hs1.containsKey(x) && hs.get(x)==1 && hs1.get(x)==1){
              arr.add(x);
        }
      }
    //    for(String x:hs1.keySet()){
    //     if(hs.containsKey(x) && hs1.get(x)==1){
    //           arr.add(x);
    //     }
    //   }
      
      
      return arr.size();
    }
}