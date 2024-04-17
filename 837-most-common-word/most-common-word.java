class Solution {

    public String mostCommonWord(String paragraph, String[] banned) {
        // Set<String> bannedString = new HashSet<>(Arrays.asList(banned));
        // Map<String, Integer> count = new HashMap<>();
        // String[] words = paragraph.replaceAll("\\W+", " ").toLowerCase().split("\\s+");
        // for (String w : words) if (!bannedString.contains(w)) count.put(w, count.getOrDefault(w, 0) + 1);
        // return Collections.max(count.entrySet(), Map.Entry.comparingByValue()).getKey();

        String[] words = paragraph.toLowerCase().split("[ !?',;.]+");
        HashMap<String, Integer> map = new HashMap<>();

        for (String element : words) map.put(element, map.getOrDefault(element, 0) + 1);

        for (String word : banned) if (map.containsKey(word)) map.remove(word);

        String result = null;
        for (String word : map.keySet()) {
            if (result == null || map.get(word) > map.get(result)) result = word;
        }
        return result;
    }
}
