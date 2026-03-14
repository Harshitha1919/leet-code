class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int m=commands.size();
        int k=0;
        int ans=0;
        int i=0,j=0;
        while(k<m){
            if(commands.get(k).equals("RIGHT")){
                j++;
                ans=(i*n)+j;
            }
           else if(commands.get(k).equals("LEFT")){
                j--;
                ans=(i*n)+j;
            }
             else if(commands.get(k).equals("UP")){
                i--;
                ans=(i*n)+j;
            }
             else if(commands.get(k).equals("DOWN")){
                i++;
                ans=(i*n)+j;
            }
            k++;
        }
        return ans;
    }
}