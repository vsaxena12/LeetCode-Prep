class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder sb = new StringBuilder();
        int n = word1.length() + word2.length();

        for(int i=0; i<n; i++) {
            if(i < word1.length()) {
                sb = sb.append(word1.charAt(i));
            }
            if(i < word2.length()) {
                sb = sb.append(word2.charAt(i));
            } 

        }
        return sb.toString();
    }
}

// class Solution {
//     public String mergeAlternately(String word1, String word2) {
        
//         StringBuilder sb = new StringBuilder();
//         int i = 0;
//         int j = 0;

//         while(i<word1.length() && j<word2.length()) {
//             if(i<=j) {
//                 sb = sb.append(word1.charAt(i));
//                 i++;
//             } else {
//                 sb = sb.append(word2.charAt(j));
//                 j++;
//             }
//         }

//         while(i<word1.length()) {
//             sb = sb.append(word1.charAt(i));
//             i++;
//         }

//         while(j<word2.length()) {
//             sb = sb.append(word2.charAt(j));
//             j++;
//         }
//         return sb.toString();
//     }
// }
