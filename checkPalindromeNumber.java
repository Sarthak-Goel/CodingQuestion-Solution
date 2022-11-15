// WAP to check if the number entered is Palindrome
// x is the test number, which is passed into the check isPalindrome function
//---------------------------------

class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int len = str.length();
        for(int i = 0; i < len / 2; i++)
            if (str.charAt(i) != str.charAt(len - i - 1))
                return false;
        return true;
    }
}

//--------------------------------

// Algorithm-
// 1. Convert number to String
// 2. Use a 'for' Loop to traverse string from both ends and check for equality of characters encountered
// 3. Return True False, depending on that



// In Python3

// b=str(x)
// return b == b[::-1]
