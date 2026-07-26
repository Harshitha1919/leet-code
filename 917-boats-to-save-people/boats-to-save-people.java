class Solution {
    public int numRescueBoats(int[] p, int limit) {
       Arrays.sort(p);
       int  sum=0;
       int i=0;
       int j=p.length-1;
        HashMap<Integer,Integer> hs=new HashMap<>();
       for( i=0;i<p.length;i++){
           hs.put(p[i],hs.getOrDefault(p[i],0)+1);
       }
    i=0;
       while(i<=j){
        if(p[i]+p[j]<=limit){
            sum++;
           if(hs.containsKey(p[i])){
             hs.put(p[i],hs.get(p[i])-1);
             if(hs.get(p[i])==0){
                hs.remove(p[i]);
             }


              if(hs.containsKey(p[j])){
             hs.put(p[j],hs.get(p[j])-1);
             if(hs.get(p[j])==0){
                hs.remove(p[j]);
             }
           }
           }

           
            i++;
            j--;
            }
       else if(p[i]+p[j]>limit){
              j--;

        }
        else{
            i++;
        }
       }
       for(int h:hs.keySet()){
              sum=sum+hs.get(h);
       }

       return sum;
    }
}