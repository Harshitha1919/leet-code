// class Solution {
//     public int canBeTypedWords(String text, String brokenLetters) {
        
//         int count1=0;
       
//         for(int i=0;i<text.length();i++){
//             int j=i;
//              boolean flag=true;
//          while (j < text.length() && text.charAt(j) != ' ') {
//                 if(brokenLetters.indexOf(text.charAt(j))!=-1){
//                     flag=false;
                   
//                 }
//                 j++;
//             }
//             if(flag){
//                 count1++;
//             }
//             i=j;
//         }
//         return count1;
//     }
// }
import java.util.*;

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        // Step 1: put broken letters into a HashSet for O(1) lookup
        Set<Character> brokenSet = new HashSet<>();
        for (char c : brokenLetters.toCharArray()) {
            brokenSet.add(c);
        }

        int count = 0;
        int n = text.length();

        for (int i = 0; i < n; i++) {
            int j = i;
            boolean flag = true;

            // Step 2: check this word
            while (j < n && text.charAt(j) != ' ') {
                if (brokenSet.contains(text.charAt(j))) {
                    flag = false;  // word has broken char
                }
                j++;
            }

            if (flag) {
                count++;  // this word is typable
            }

            i = j; // move i to next word
        }

        return count;
    }
}
