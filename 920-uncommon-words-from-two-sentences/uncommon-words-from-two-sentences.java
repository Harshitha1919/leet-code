class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> hs=new HashMap<>();
          HashMap<String,Integer> hs1=new HashMap<>();
        ArrayList<String> arr=new ArrayList<>();
      String[] s11=s1.split("\\s+");
      String[] s12=s2.split("\\s+");
      for(int i=0;i<s11.length;i++){
        hs.put(s11[i],hs.getOrDefault(s11[i],0)+1);
      }
      for(int i=0;i<s12.length;i++){
       hs1.put(s12[i],hs1.getOrDefault(s12[i],0)+1);
      }
      for(String x:hs.keySet()){
        if(!hs1.containsKey(x) && hs.get(x)==1){
              arr.add(x);
        }
      }
       for(String x:hs1.keySet()){
        if(!hs.containsKey(x) && hs1.get(x)==1){
              arr.add(x);
        }
      }
      
      
      String [] ar=new String[arr.size()];
      for(int i=0;i<arr.size();i++){
        ar[i]=arr.get(i);
      }
      return ar;


    }
}