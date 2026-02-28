class Solution {
    public List<Integer> findPeaks(int[] m) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<m.length-1;i++){
            if(m[i]>m[i-1] && m[i]>m[i+1]){
                arr.add(i);
            }
        }
        return arr;
    }
}