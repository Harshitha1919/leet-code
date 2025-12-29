class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> arr=new ArrayList<>();
             ArrayList<Integer> arr1=new ArrayList<>();
       
      
        for(int i=0;i<matrix.length;i++){
             int min1=Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++){
                min1=Math.min(min1,matrix[i][j]);
            }
            arr.add(min1);
           
        }
         for(int i=0;i<matrix[0].length;i++){
              int max1=Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++){
                max1=Math.max(max1,matrix[j][i]);
            }
            arr1.add(max1);
           
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int x : arr) {
            if (arr1.contains(x)) {
                result.add(x);
            }
        }

        return result;
    }
}