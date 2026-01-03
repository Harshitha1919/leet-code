class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int k=0;
        int l=0;
        int spam[][]=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            l=0;
            for(int j=image[0].length-1;j>=0;j--){
                if(image[i][j]==1){
                    spam[k][l]=0;;
                    l++;
              }
              else{
                spam[k][l]=1;
                l++;
              }
            }
              k++;
        }
        return spam;
    }
}