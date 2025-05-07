class Solution {
    public char findTheDifference(String s, String t) {
        if(t.length() != s.length()+1) {
            throw new IllegalArgumentException("Input string 't' must be exactly one character longer than 's'.");
        }
        char c = '\0';
        int[] alphabets = new int[26];
        for(int i=0; i<s.length(); i++) {
            alphabets[s.charAt(i)-'a']++;
        }
        
        for(int i=0; i<t.length(); i++) {
            if(alphabets[t.charAt(i)-'a'] == 0) {
                c = t.charAt(i);
            } else {
                alphabets[t.charAt(i)-'a']--;
            }
        }
        return c;
    }
}