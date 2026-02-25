class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        
        int first = convert(firstWord);
        int second = convert(secondWord);
        int target = convert(targetWord);
        
        return first + second == target;
    }
    
    private int convert(String word) {
        String num = "";
        
        for(int i = 0; i < word.length(); i++){
            num += (word.charAt(i) - 'a');
        }
        
        return Integer.parseInt(num);
    }
}