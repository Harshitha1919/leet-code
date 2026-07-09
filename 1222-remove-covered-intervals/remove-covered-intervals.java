class Solution {
    public int removeCoveredIntervals(int[][] in) {
        int count=0;
        Arrays.sort(in,(a,b)->{
            if(a[0]==b[0]){
                return b[1]-a[1];
            }
            return a[0]-b[0];
        });
        int i=in.length-1;
        
        while(i>=0){
            int k=0;
            if(in[i][0]>=in[k][0]){
                if(in[i][1]<in[k][1]){
                    count++;
                }
            
            else{
                
                while(k<i){
                
                    if(in[i][1]<=in[k][1]){
                    count++;
                    break;
                }
                    k++;
                
                }
               
            }
           
             
            }
            i--;
                
        } 
           
        
        return in.length-count;
    }
}