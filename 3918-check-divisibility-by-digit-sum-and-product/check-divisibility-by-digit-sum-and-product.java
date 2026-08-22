class Solution {
    public boolean checkDivisibility(int n) {
        int k=n;
        int sum=0;
        while(k>0){
            sum=sum+(k%10);
            k=k/10;
        }
        k=n;
        int mul=1;
        while(k>0){
            mul=mul*(k%10);
            k=k/10;
        }
        if(n%(sum+mul)==0){
            return true;
        }
        return false;
    }
}