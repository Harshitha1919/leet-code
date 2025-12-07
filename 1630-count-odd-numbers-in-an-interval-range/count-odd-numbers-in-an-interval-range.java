class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        int k=low;
        int h=high;
        if(low%2==0){
             k=low+1;
        }
        if(high%2==0){
             h=high-1;
        }
        for(int i=k;i<=h;i=i+2){

            count++;
        }
        return count;
    }
}