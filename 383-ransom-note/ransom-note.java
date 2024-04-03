class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        // if (magazine.indexOf(ransomNote) != -1) {
        //     return true;
        // } else {
        //     return false;
        // }

        int[] count = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (count[ransomNote.charAt(i) - 'a'] == 0) return false;
            count[ransomNote.charAt(i) - 'a']--;
        }
        return true;
    }
}
