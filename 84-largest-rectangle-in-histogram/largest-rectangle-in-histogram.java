class Solution {
    public int largestRectangleArea(int[] heights) {
     Stack<Integer> st=new Stack<>();
    int max=0;
    int cur=0;
    int area=0;
     for(int i=0;i<=heights.length;i++){
       if (i == heights.length) {
                cur = 0;
            } else {
                cur = heights[i];
            }
       
        while(st.size()>0 && heights[st.peek()]>cur){
            int element=st.pop();
            if(st.size()>0){
            area=heights[element]*(i-st.peek()-1);
            }
            else{
                  area=heights[element]*i;
            }
            max=Math.max(max,area);
        }
       
            st.push(i);
        
     }
     return max;   
    }
}