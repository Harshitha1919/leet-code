class Solution {
    public int minOperations(int[][] grid, int x) {
        int a[]=new int[grid.length*grid[0].length];
        int k=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                a[k]=grid[i][j];
                k++;
            }
        }
         Arrays.sort(a);
         int mid=a.length/2;
         
         int ans=0;
         for(int i=0;i<=mid;i++){
            int n=a[i];
            int c=0;
            while(n!=a[mid] && n<a[mid]){
                n=n+x;
                c++;
            }
            if(n==a[mid]){
                ans=ans+c;
            }
            else{
                return -1;
            }
         }

         for(int i=mid+1;i<a.length;i++){
            int n=a[i];
            int c=0;
            while(n!=a[mid] && n>a[mid]){
                n=n-x;
                c++;
            }
            if(n==a[mid]){
                ans=ans+c;
            }
            else{
                return -1;
            }
         }
       return ans;
    }
}