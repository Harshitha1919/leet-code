class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddsum=0;
        int evensum=0;
        for(int i=1;i<=(n*2);i++){
            if(i%2!=0){
            oddsum=oddsum+i;
            }
            else{
            evensum=evensum+i;
            }
        }
        return Math.abs(oddsum-evensum);
    }
}