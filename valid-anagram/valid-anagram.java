// s:"anagram"
// t:"nagaram"
// map:{97:3,114:1,103:1,109:1,110:0}
// a = 97; r = 114; g = 103; m = 109; n = 110
// element:110

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
            
        Map<Integer, Integer> map = new HashMap<>();

        for(int num_s: s.codePoints().toArray()) {
            map.put(num_s, map.getOrDefault(num_s, 0) + 1);
        }

        for(int num_t: t.codePoints().toArray()) {
            map.put(num_t, map.getOrDefault(num_t, 0) - 1 );
            if(map.get(num_t) < 0) {
                return false;
            }
        }
        return true;
    }
}

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length() != t.length()) {
//             return false;
//         }
//         int[] num = new int[26];

//         for(int i=0; i<s.length(); i++) {
//             num[s.charAt(i)-'a']++;
//         }

//         for(int i=0; i<t.length(); i++) {
//             int element = num[t.charAt(i)-'a']--;
//         }

//         for(int i: num) {
//             if(i != 0)
//                 return false;
//         }

//         return true;
//     }
// }
