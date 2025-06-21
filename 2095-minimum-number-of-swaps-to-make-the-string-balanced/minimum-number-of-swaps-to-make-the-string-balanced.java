class Solution {

    public int minSwaps(String s) {
        // Stack<Character> stack = new Stack<>();
        // int count = 0;
        // for (int i = 0; i < s.length(); i++) {
        //     char c = s.charAt(i);
        //     if (c == '[') {
        //         stack.push(c);
        //     } else {
        //         if (stack.isEmpty()) {
        //             count++;
        //         } else {
        //             stack.pop();
        //         }
        //     }
        // }

        // return (count + 1) / 2;


        

        int stackSize = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '[') stackSize++; else {
                if (stackSize > 0) stackSize--;
            }
        }
        return (stackSize + 1) / 2;
    }
}
