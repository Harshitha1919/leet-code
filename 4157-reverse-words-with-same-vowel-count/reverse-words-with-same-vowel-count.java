class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String ch=arr[0];
        int count=0;
        
        for(int i=0;i<ch.length();i++){
            if("aeiou".indexOf(ch.charAt(i))!=-1){
                count++;
            }
        }
        StringBuilder sb=new StringBuilder(ch);
        if(arr.length>1){
        sb.append(" ");
        }
        for(int i=1;i<arr.length;i++){
            String k=arr[i];
            int count1=0;
            for(int j=0;j<k.length();j++){
            if("aeiou".indexOf(k.charAt(j))!=-1){
                count1++;
            }
            }
        if (count1 == count) {
                sb.append(new StringBuilder(k).reverse());
            } else {
                sb.append(k);
            }
        
              if (i < arr.length - 1) {
                sb.append(" ");
            }
        }
       return  sb.toString();
    }
}