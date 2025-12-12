class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<candyType.length;i++){
              hs.add(candyType[i]);
        }
        int n=candyType.length/2;
        if(n>hs.size()){
            return hs.size();
        }
        return n;
    }
}