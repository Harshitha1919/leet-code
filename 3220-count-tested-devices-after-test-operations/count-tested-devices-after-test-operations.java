class Solution {
    public int countTestedDevices(int[] bp) {
        int c=0;
        for(int i=0;i<bp.length;i++){
            if(bp[i]>0){
                c++;
                for(int j=i+1;j<bp.length;j++){
                    if(bp[j]>0){
                        bp[j]=bp[j]-1;
                    }
                }
            }
        }
        return c;

    }
}