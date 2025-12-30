class Solution {
    public boolean checkValid(int[][] matrix) {
       int freq[]=new int[matrix.length];
     for(int i=0;i<matrix.length;i++){
        Arrays.fill(freq, 0);
         for(int j=0;j<matrix[0].length;j++){
            freq[matrix[i][j]-1]++;
         }
            Arrays.sort(freq);
             if(freq[0]!=freq[freq.length-1]){
        return false;
     }
     else{
         for(int j=0;j<matrix[0].length;j++){
            
            freq[matrix[j][i]-1]++;
         }
     }
Arrays.sort(freq);
    if(freq[0]!=freq[freq.length-1]){
        return false;
     }
    
     }
     return true;
    }
}