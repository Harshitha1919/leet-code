class Solution {
    public int findComplement(int num) {
       StringBuilder sb = new StringBuilder();
        while(num>0){
            int rem=num%2;
            if(rem==0){
                sb.append(1);
            }
            else{
                sb.append(0);
            }
            num=num/2;
        }
        sb.reverse();
        int num1 = Integer.parseInt(sb.toString(), 2);
        return num1;
    }
}