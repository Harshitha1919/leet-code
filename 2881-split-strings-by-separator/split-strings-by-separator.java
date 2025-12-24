class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<words.size();i++){
          String k=words.get(i);
          String []h=k.split("\\" +separator);
          for(String p:h){
            if(!p.isEmpty())
             arr.add(p);
          }
        }
        return arr;
    }
}