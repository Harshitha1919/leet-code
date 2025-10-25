class Solution {
    public int totalMoney(int n) {
        int j=0;
     
        int sum=0;
        for(int i=0;i<n;i++){
             
            if(i%7!=0){
                j++;
                sum=sum+j;
            }
            else{
                j=((i)/7)+1;
               sum=sum+j;
            }
           

        }
        return sum;
    }
}