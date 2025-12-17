class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum=0;
        HashMap<Character,Integer> hs=new HashMap<>();
        for(int i=0;i<chars.length();i++){
            hs.put(chars.charAt(i),hs.getOrDefault(chars.charAt(i),0)+1);
        }
        for(int i=0;i<words.length;i++){
             String x=words[i];
             HashMap<Character,Integer> hs1=new HashMap<>();
             for(int j=0;j<x.length();j++){
            hs1.put(x.charAt(j),hs1.getOrDefault(x.charAt(j),0)+1);
        }
        int flag=0;
        for(char t:hs1.keySet()){
            if(!hs.containsKey(t) || hs1.get(t)>hs.get(t)){
                 flag=1;
                 break;
            }

        }
        if(flag==0){
            sum=sum+x.length();
                    }
        hs1.clear();
        }
        return sum;
    }
}