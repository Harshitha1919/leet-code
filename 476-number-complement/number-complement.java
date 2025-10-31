class Solution {
    public int findComplement(int num) {
        String binary="";
        while(num>0){
            int rem=num%2;
            if(rem==0){
                binary=1+binary;
            }
            else{
                binary=0+binary;
            }
            num=num/2;
        }
        int num1 = Integer.parseInt(binary, 2);
        return num1;
    }
}