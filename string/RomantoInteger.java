class Solution {
    public String intToRoman(int num) {
        // Roman numeral equivalents for each place value
        // I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000

        // Thousands place
        String M[] = {"", "M", "MM", "MMM"};

        // Hundreds place
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

        // Tens place
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};

        // Ones place
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        // Obtain the Roman numeral representation by concatenating the corresponding numerals from each place value
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
    }
}