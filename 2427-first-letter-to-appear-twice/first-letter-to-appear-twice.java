class Solution {
    public char repeatedCharacter(String s) {
        List<Character> ls = new ArrayList<>();
        for(int i = 0; i < s.length() ; i++){
            if(ls.contains(s.charAt(i))){
                return s.charAt(i);
            }
            ls.add(s.charAt(i));
        }
        return 'a';

        //  HashSet<Character> set = new HashSet<>();//Create a set of characters
        // for(int i = 0 ; i < s.length() ; i++){
        //     if(set.contains(s.charAt(i))) return s.charAt(i);//If the set already contains the current character, then it is the required ans
        //     set.add(s.charAt(i));
        // }
        // return 'a';

        //   boolean[] letters = new boolean[26]; // Represents each letter of the alphabet
    
        // for (int i = 0; i < s.length(); i++) {
        //     int index = s.charAt(i) - 'a'; // Calculate the index of the current character
            
        //     if (letters[index]) {
        //         return s.charAt(i); // Found the first repeated letter
        //     } else {
        //         letters[index] = true; // Mark the letter as seen
        //     }
        // }

        // return ' '; // No repeated letter found
    }
}