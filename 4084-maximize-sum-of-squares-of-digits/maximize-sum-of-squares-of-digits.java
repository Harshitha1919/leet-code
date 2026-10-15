class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(num*9 <sum){
            return "";
        }
        StringBuilder sb=new StringBuilder();
           int min=Integer.MAX_VALUE;
        for(int i=0;i<num;i++){
            min=Math.min(sum,9);
            sb.append(min);
            sum=sum-min;
        }
     return sb.toString();
    }
}