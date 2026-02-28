class Solution {
    public int countGoodRectangles(int[][] rectangles) {
      
        int min1 = 0;
        int max1 = 0;
        int c=0;

        for (int i = 0; i < rectangles.length; i++) {
            min1 = Math.min(rectangles[i][0], rectangles[i][1]);
            if(max1<min1){
                max1=min1;
                c=1;
            }
          else if(min1==max1){
            c++;
          }
        }

      

       

        return c;
    }
}