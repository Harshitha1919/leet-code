class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> hs=new HashSet<>();
           HashSet<Integer> hs1=new HashSet<>();
        int ans[]=new int[A.length];
    







     for(int i=0;i<A.length;i++){
        hs.add(A[i]);
        hs1.add(B[i]);
        int count=0;
       for(Integer num:hs){
        if(hs1.contains(num)){
            count++;
        }

       }
       ans[i]=count;

     }



return ans;







    }
}