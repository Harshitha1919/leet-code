class Solution {
    public int compareVersion(String version1, String version2) {
        int n=version1.length();
        int n1=version2.length();
        int i=0;
        int j=0;
       
        while(i<n|| j<n1){
            String s="";
            String s1="";
            while(i<n && version1.charAt(i)!='.'){
                s=s+version1.charAt(i);
                i++;
            }
             while(j<n1 && version2.charAt(j)!='.'){
                s1=s1+version2.charAt(j);
                j++;
            }
          int num1 = s.isEmpty() ? 0 : Integer.parseInt(s);
int num2 = s1.isEmpty() ? 0 : Integer.parseInt(s1);

            if(num1<num2)return -1;
            else if(num1>num2)return 1;
            i++;
            j++;
        }
        return 0;
    }
}