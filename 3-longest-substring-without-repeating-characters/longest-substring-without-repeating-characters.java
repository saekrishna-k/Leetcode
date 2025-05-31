class Solution {

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Set<Character> visited = new HashSet<>();
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            while (visited.contains(s.charAt(right))) {
                visited.remove(s.charAt(left));
                left++;
            }
            visited.add(s.charAt(right));
            maxLength = Math.max((right - left) + 1, maxLength);
        }
        return maxLength;
    }
}
