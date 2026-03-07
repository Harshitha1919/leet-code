import java.util.*;

class Solution {
    public int[] minDistinctFreqPair(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        // count frequencies
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        // distinct values
        ArrayList<Integer> arr = new ArrayList<>(map.keySet());

        // sort values
        Collections.sort(arr);

        // find smallest x and smallest y
        for(int i = 0; i < arr.size(); i++){
            for(int j = i + 1; j < arr.size(); j++){

                int x = arr.get(i);
                int y = arr.get(j);

                if(map.get(x) != map.get(y)){
                    return new int[]{x,y};
                }
            }
        }

        return new int[]{-1,-1};
    }
}