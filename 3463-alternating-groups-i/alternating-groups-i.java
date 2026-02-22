class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count=0;
        for(int i=0;i<colors.length;i++){
            int a=colors[i];
            int b=colors[(i+1)%colors.length];
             int c=colors[(i+2)%colors.length];
            if(a!=b && b!=c){
                count++;
            }

        }
        return count;
    }
}