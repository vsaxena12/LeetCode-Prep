class Solution {    

    private String build(String str) {
        Stack<Character> stack = new Stack();

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) != '#' ) {
                stack.push(str.charAt(i));
            } else if(!stack.isEmpty()) {
                stack.pop();
            }
        }
        //String s = String.valueOf(stack);
        return String.valueOf(stack);
    }

    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
}