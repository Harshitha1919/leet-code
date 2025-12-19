class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long vol=(long)length*width*height;
        if(length>=10000 || width>=10000 || height>=10000 || vol >=Math.pow(10,9)){
            if(mass>=100){
                return "Both";
            }
            else{
                return "Bulky";
            }
        }
        if(mass>=100){
            return "Heavy";
        }
        return "Neither";
    }
}