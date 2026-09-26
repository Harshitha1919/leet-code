class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1=rec1[0];
        int y1=rec1[1];
        int x2=rec1[2];
        int y2=rec1[3];
         int x11=rec2[0];
        int y11=rec2[1];
        int x21=rec2[2];
        int y22=rec2[3];
        if((x11<x2&& y11<y2 && x1<x21 && y1<y22) ){
            return true;
        }
       
        else{
            return false;
        }


    }
}