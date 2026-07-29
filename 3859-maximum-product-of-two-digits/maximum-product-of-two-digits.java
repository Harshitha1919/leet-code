class Solution {
    public int maxProduct(int n) {
        // int c=0;
         int h=n;
        // while(n>0){
        //    int rem=n%10;
        //     c++;
        //     n=n/10;
        // }
        
        String k=Integer.toString(n);
        int c=k.length();
int a[]=new int[c];
        for(int i=0;i<c;i++){
            a[i]=h%10;
            h=h/10;
        }
        Arrays.sort(a);
        int ans=a[c-1]*a[c-2];
        return ans;
    }
}