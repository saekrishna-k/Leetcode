class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        // int[] count = new int[26];

        // for (int i = 0; i < magazine.length(); i++) {
        //     count[magazine.charAt(i) - 'a']++;
        // }

        // for (int i = 0; i < ransomNote.length(); i++) {
        //     if (count[ransomNote.charAt(i) - 'a'] == 0) return false;
        //     count[ransomNote.charAt(i) - 'a']--;
        // }
        // return true;

        int index = 0;
        int[] count = new int[26];

        for (char c : ransomNote.toCharArray()) {
            index = magazine.indexOf(c, count[c % 26]);
            if (index == -1) return false;
            count[c % 26] = index + 1;
        }
        return true;
    }
}
