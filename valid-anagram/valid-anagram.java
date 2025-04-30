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