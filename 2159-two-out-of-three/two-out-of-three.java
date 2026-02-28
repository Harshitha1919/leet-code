class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        ArrayList<Integer> arr=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
         HashSet<Integer> hs1=new HashSet<>();
          HashSet<Integer> hs2=new HashSet<>();
            HashSet<Integer> hs3=new HashSet<>();
           for (int num : nums1) {
            hs.add(num);
        }
         for (int num : nums2) {
            hs1.add(num);
        }
         for (int num : nums3) {
            hs2.add(num);
        }
        for(int key:hs){
            if(hs1.contains(key)){
                hs3.add(key);
            }
        }
         for(int key:hs1){
            if(hs2.contains(key)){
                hs3.add(key);
            }
        }
         for(int key:hs2){
            if(hs.contains(key)){
                hs3.add(key);
            }
        }
         for(int key:hs3){
           arr.add(key);
        }
        Collections.sort(arr);
        return arr;
    }
}