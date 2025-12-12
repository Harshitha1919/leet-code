class Solution {
    public boolean wordPattern(String pattern, String s) {
        String []arr=s.split(" ");

        HashMap<Character,String> hs=new HashMap<>();
        HashMap<String,Character> hs1=new HashMap<>();
            if (pattern.length() != arr.length) return false;
        for(int i=0;i<pattern.length();i++){
                if(hs.containsKey(pattern.charAt(i)) && !hs.get(pattern.charAt(i)).equals(arr[i])){
                    return false;
              
                } 
                else{
                    hs.put(pattern.charAt(i),arr[i]);
                }
        }
         for(int i=0;i<arr.length;i++){
                if(hs1.containsKey(arr[i]) && !hs1.get(arr[i]).equals(pattern.charAt(i))){
                    return false;
              
                } 
                else{
                    hs1.put(arr[i],pattern.charAt(i));
                }
        }
        return true;

    }
}