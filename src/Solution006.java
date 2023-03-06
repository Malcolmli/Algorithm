public class Solution006 {
    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        char[] newS = new char[s.length()];
        int index = 0;
        for (int i = 1; i <= numRows; i++) {
            int x = i - 1;
            while (x < s.length()) {
                newS[index++] = s.charAt(x);
                if (i == numRows || i == 1) {
                    x += (numRows - 1) * 2;
                } else {
                    x += (numRows - i) * 2;
                    if (x < s.length()) {
                        newS[index++] = s.charAt(x);
                        x += (i - 1) * 2;
                    }
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        for (char ch : newS) {
            if (ch != 0) {
                ans.append(ch);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.printf(convert("PAYPALISHIRING", 4));
        //PINALSIGYAIHRNPI
        //PINALSIGYAIHRNPI
        //PINALSIGYAHRPI
    }
}
