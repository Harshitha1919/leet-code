class Solution {
    public int[] sortByBits(int[] arr) {
        int count=0;
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            String binary=Integer.toBinaryString(arr[i]);
              count=0;
            for(int j=0;j<binary.length();j++){
                if(binary.charAt(j)=='1'){
                    count++;
                }
            }
            hs.put(arr[i],count);
          

        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
            if(hs.get(arr[j])>hs.get(arr[j+1])){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
           else if((hs.get(arr[j]).equals(hs.get(arr[j+1]))) &&  arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
         }
        }
        return arr;
    }
}