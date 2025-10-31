class Solution {
    public int findComplement(int num) {
        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            binary.insert(0, (num % 2 == 0) ? '1' : '0');
            num /= 2;
        }
        return Integer.parseInt(binary.toString(), 2);
    }
}
