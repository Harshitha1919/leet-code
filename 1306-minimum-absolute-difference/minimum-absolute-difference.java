class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        int i=0;
       int mindiff = Integer.MAX_VALUE;
        for (int j = 0; j < arr.length - 1; j++) {
            mindiff = Math.min(mindiff, arr[j + 1] - arr[j]);
        }

        List<List<Integer>> big=new ArrayList<>();
        while(i<arr.length-1){
             List<Integer> ar=new ArrayList<>();
           if(mindiff==arr[i+1]-arr[i]){

            ar.add(arr[i]);
            ar.add(arr[i+1]);
            big.add(ar);


           }
           
           i++;
        }
        return big;
    }
}