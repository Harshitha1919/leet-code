class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

        ArrayList<String[]> temp = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {

            if (isActive[i]) {

                if (businessLine[i].equals("electronics") ||
                    businessLine[i].equals("grocery") ||
                    businessLine[i].equals("pharmacy") ||
                    businessLine[i].equals("restaurant")) {

                    if (!code[i].isEmpty()) {

                        String r = code[i];
                        boolean isValid = true;

                        for (int j = 0; j < r.length(); j++) {
                            char ch = r.charAt(j);

                            if (!( (ch >= 'a' && ch <= 'z') ||
                                   (ch >= 'A' && ch <= 'Z') ||
                                   (ch >= '0' && ch <= '9') ||
                                   ch == '_' )) {
                                isValid = false;
                                break;
                            }
                        }

                        if (isValid) {
                            temp.add(new String[]{businessLine[i],code[i]});
                        }
                    }
                }
            }
        }
        Map<String, Integer> order = new HashMap<>();
        order.put("electronics", 0);
        order.put("grocery", 1);
        order.put("pharmacy", 2);
        order.put("restaurant", 3);
    Collections.sort(temp,(a,b)->{
        int cmp=order.get(a[0])-order.get(b[0]);
        if(cmp!=0){
            return cmp;
        }
        else{
           return a[1].compareTo(b[1]);
        }
    });
    ArrayList<String> result = new ArrayList<>();
        for (String[] arr : temp) {
            result.add(arr[1]);
        }


        return result;
    }
}
