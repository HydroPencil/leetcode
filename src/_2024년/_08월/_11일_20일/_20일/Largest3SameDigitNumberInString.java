class Largest3SameNumberInString {
    public String largestGoodInteger(String num) {
        if (num.length() < 3) {
            return "";
        }

        int i = 0;
        int j = 2;
        String ans = null;

        while (j < num.length()) {
            if (num.charAt(i) != num.charAt(j)) {
                i++;
                j++;
            } else {
                if (num.charAt(i) == num.charAt(i + 1)) {
                    if (ans == null || ans.compareTo(num.substring(i, j + 1)) < 0) {
                        ans = num.substring(i, j + 1);
                    }
                }
                i++;
                j++;
            }
        }

        if(ans == null) return "";

        return ans;
    }
}