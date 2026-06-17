class Solution {
    public boolean isPalindrome(String x) {
        String s = x.replace(" ", "").toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        System.out.println(s);
        while (left <= right) {
            while (left < s.length() - 1
                && (!Character.isLetterOrDigit(s.charAt(left)))) {
                left++;
            }

            while (right > -1
                && (!Character.isLetterOrDigit(s.charAt(right)))) {
                right--;
            }
            
            if ((left < s.length() - 1 && right > -1) && (s.charAt(left) != s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
