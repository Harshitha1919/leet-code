import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public List<String> twoEditWords(String[] q, String[] d) {
        List<String> arr = new ArrayList<>();
        int n = q[0].length();
        
        for(int i = 0; i < q.length; i++){
            String s = q[i];
            
            
           
            
            for(int k = 0; k < d.length; k++){
                String s1 = d[k];
                int c = 0;
                
                boolean ans = true;
                
                for(int l = 0; l < s1.length(); l++){
                    if(s.charAt(l) != s1.charAt(l)){
                        c++;
                       
                    }
                     if(c>2){
                        ans = false;
                        break;
                    }
                }
                
                if(ans == true){
                    arr.add(s);
                    break;
                }
            }
        } 
        
        return arr;
    }
}