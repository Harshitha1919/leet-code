class Solution {
    public String oddString(String[] words) {
        HashMap<ArrayList<Integer>, Integer> hs = new HashMap<>();

        for(int i = 0; i < words.length; i++){
            String s = words[i];
            ArrayList<Integer> arr = new ArrayList<>();

            for(int j = 0; j < s.length() - 1; j++){
                int k = s.charAt(j) - 'a';
                int l = s.charAt(j + 1) - 'a';
                arr.add(l - k);
            }
            hs.put(arr, hs.getOrDefault(arr, 0) + 1);
        }

        ArrayList<Integer> key1 = null;

        for(ArrayList<Integer> a : hs.keySet()){
            if(hs.get(a) == 1){
                key1 = a;
                break;
            }
        }

        String h = "";

        for(int i = 0; i < words.length; i++){
            String s = words[i];
            ArrayList<Integer> arr = new ArrayList<>();

            for(int j = 0; j < s.length() - 1; j++){
                int k = s.charAt(j) - 'a';
                int l = s.charAt(j + 1) - 'a';
                arr.add(l - k);
            }

            if(arr.equals(key1)){
                h = words[i];
            }
        }

        return h;
    }
}