class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> hs=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
        }
        int n=k;
         String j="";
        for(int i=0;i<arr.length;i++){
            if(  hs.containsKey(arr[i]) && hs.get(arr[i])==1){
                n--;
                if(n==0){
                    j= arr[i];
                    break;
                }

            }
        }
        return j;
    }
}