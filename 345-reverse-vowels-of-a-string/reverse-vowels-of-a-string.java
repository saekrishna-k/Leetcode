class Solution {

    public String reverseVowels(String s) {
        // Map<Character, Integer> m = new HashMap<>();
        // m.put('a', 0);
        // m.put('e', 0);
        // m.put('i', 0);
        // m.put('o', 0);
        // m.put('u', 0);
        // m.put('A', 0);
        // m.put('E', 0);
        // m.put('I', 0);
        // m.put('O', 0);
        // m.put('U', 0);
        // int low = 0, high = s.length() - 1;
        // char[] str = s.toCharArray();

        // while (low < high) {
        //     if (!m.containsKey(str[low])) {
        //         low++;
        //     } else if (!m.containsKey(str[high])) {
        //         high--;
        //     } else if (m.containsKey(str[low]) && m.containsKey(str[high])) {
        //         char c = str[low];
        //         str[low] = str[high];
        //         str[high] = c;
        //         high--;
        //         low++;
        //     }
        // }
        // return String.valueOf(str);

        

        String vowels = "aeiouAEIOU";
        char[] str = s.toCharArray();
        int low = 0, high = s.length() - 1;
        while (low < high) {
            while (low < high && vowels.indexOf(str[low]) == -1) {
                low++;
            }

            while (low < high && vowels.indexOf(str[high]) == -1) {
                high--;
            }

            char c = str[low];
            str[low] = str[high];
            str[high] = c;

            low++;
            high--;
        }
        return String.valueOf(str);
    }
}
