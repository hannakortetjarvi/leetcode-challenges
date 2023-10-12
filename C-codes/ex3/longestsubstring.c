#include <stdio.h>
#include <string.h>

/*
* Check if char is included in the char array
*/
int includes(char * s, char x) {
    int i;
    for (i = 0; i < strlen(s); ++i) {
        if (s[i] == x) return 1;
    }
    return 0;
}

/*
* Calculate the length of the longest substring that doesn't include repeating letters
*/
int lengthOfLongestSubstring(char * s){
    int i, j, d;
    int longest = 0;
    
    for (i = 0; i < strlen(s); ++i) {
        char current[256] = "";
        for (j = 0; j + i < strlen(s); ++j) {
            d = includes(current, s[j + i]);
            if (d == 0) {
                strncat(current, &s[j + i], 1); 
            }
            else {
                break;
            }
            
        }
        if (strlen(current) > longest) { longest = strlen(current); } 
    }
    return longest;
}

int main(){
    char s1[] = "abcabcbb";
    char s2[] = "bbbbb";
    char s3[] = "pwwkew";
    printf("%d\n", lengthOfLongestSubstring(s1));
    printf("%d\n", lengthOfLongestSubstring(s2));
    printf("%d\n", lengthOfLongestSubstring(s3));
    return 0;
}