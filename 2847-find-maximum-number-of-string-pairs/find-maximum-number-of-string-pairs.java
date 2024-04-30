class Solution {

    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0, l = words.length;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                StringBuilder sb = new StringBuilder(words[j]);
                sb.reverse();
                System.out.println(sb);
                if (words[i].equals(sb.toString())) {
                    count++;
                }
            }
        }
        return count;
    }
}
