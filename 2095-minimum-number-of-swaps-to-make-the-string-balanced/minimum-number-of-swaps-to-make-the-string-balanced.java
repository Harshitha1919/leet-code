class Solution {
    public int minSwaps(String s) {
     Stack<Character> st=new Stack<>();
     char[] arr=s.toCharArray();
     int count=0;
     int left=0;
     int right=s.length()-1;
    while(left<right){
        if(arr[left]==']'){
            if(!st.isEmpty() && st.peek()=='['){
                st.pop();
                left++;
            }
           else{
            while(arr[right]!='['){
                right--;
            }
            arr[right]=']';
            arr[left]='[';
            st.push('[');
            left++;
            count++;
           }
        }
        else{
            st.push('[');
            left++;

        }
    }
    return count;
    }
}