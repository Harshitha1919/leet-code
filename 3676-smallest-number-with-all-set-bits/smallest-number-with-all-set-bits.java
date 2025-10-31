class Solution {
    public int smallestNumber(int n) {
       
        int flag=0;
        int k=0;
       while(flag==0){

          k=n;
        while(k>0){
            int rem=k%2;
            if(rem==0){
                flag=0;
              n++;

            break;
            }
            else{
                k=k/2;
                flag=1;
            }
           
        }
         
        
       }  
       
          return n; 
   
       
    }
}