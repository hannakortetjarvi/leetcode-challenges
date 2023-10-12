using System;

class Program
{
    static void Main()
    {
        string s1 = LongestPalindrome("babad");
        Console.WriteLine(s1);

        string s2 = LongestPalindrome("cbbd");
        Console.WriteLine(s2);
    }

    // Given a string s, return the longest palindromic substring in s.
    static string LongestPalindrome(string s) {
        string longest = "";
        for (int i = 0; i < s.Length; i++) {
            string tmp = "";
            for (int j = 0; j + i < s.Length; j++) {
                tmp += s[j + i];
                if (isPalindrome(tmp) && tmp.Length > longest.Length) longest = tmp;
            }
        }
        return longest;
    }

    // Check if string is palindrome
    static bool isPalindrome(string s) {
        for (int i = 0; i <= s.Length / 2; i++) {
            if (s[i] != s[s.Length - 1 - i]) return false;
        }
        return true;
    }
}



