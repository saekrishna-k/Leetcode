class Solution {

    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0, l = words.length;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                // StringBuilder sb = new StringBuilder(words[j]);
                // sb.reverse();
                // System.out.println(sb);
                // if (words[i].equals(sb.toString())) {
                //     count++;
                // }

                if (words[i].charAt(0) == words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0)) {
                    count++;
                }
            }
        }
        return count;
    }
}
