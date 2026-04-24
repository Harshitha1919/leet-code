class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int c=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L' || moves.charAt(i)=='_'){
                c++;
            }
            else{
                c--;
            }
        }
        int r=0;
         for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='R' || moves.charAt(i)=='_'){
                r++;
            }
            else{
                r--;
            }
        }
        return Math.max(Math.abs(r),Math.abs(c));
    }
}