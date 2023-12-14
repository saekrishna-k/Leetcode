class Solution {

    public String[] uncommonFromSentences(String s1, String s2) {
        // Map<String, Integer> m = new HashMap<>();
        // for (String s : s1.split(" ")) {
        //     if (m.containsKey(s)) {
        //         m.put(s, m.get(s) + 1);
        //     } else {
        //         m.put(s, 1);
        //     }
        // }

        // for (String s : s2.split(" ")) {
        //     if (m.containsKey(s)) {
        //         m.put(s, m.get(s) + 1);
        //     } else {
        //         m.put(s, 1);
        //     }
        // }
        // int i = 0;
        // for (Map.Entry<String, Integer> e : m.entrySet()) {
        //     if (e.getValue() == 1) {
        //         i++;
        //     }
        // }
        // String[] r = new String[i];
        // int j = 0;
        // for (Map.Entry<String, Integer> e : m.entrySet()) {
        //     if (e.getValue() == 1) {
        //         r[j++] = e.getKey();
        //     }
        // }
        // return r;

        // Map<String, Integer> count = new HashMap<>();
        // for (String w : (s1 + " " + s2).split(" ")) count.put(w, count.getOrDefault(w, 0) + 1);
        // ArrayList<String> res = new ArrayList<>();
        // for (String w : count.keySet()) if (count.get(w) == 1) res.add(w);
        // return res.toArray(new String[0]);

        // Map<String, Integer> count = new HashMap<>();
        // for (String s : (s1 + " " + s2).split("\\s")) {
        //     count.put(s, count.getOrDefault(s, 0) + 1);
        // }
        // return count.entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).toArray(String[]::new);

        // Set<String> unique = new HashSet<>();
        // Set<String> words = new HashSet<>();

        // for (String s : (s1 + " " + s2).split(" ")) {
        //     if (words.contains(s)) {
        //         unique.remove(s);
        //     } else {
        //         words.add(s);
        //         unique.add(s);
        //     }
        // }
        // String[] r = new String[unique.size()];
        // int c = 0;
        // for (String s : unique) {
        //     r[c++] = s;
        // }
        // return r;

        String[] splitS1 = s1.split(" ");
        String[] splitS2 = s2.split(" ");
        Set<String> words = new HashSet<>();
        Set<String> unique = new HashSet<>();
        for (String word : splitS1) {
            if (words.contains(word)) {
                unique.remove(word);
            } else {
                words.add(word);
                unique.add(word);
            }
        }
        for (String word : splitS2) {
            if (words.contains(word)) {
                unique.remove(word);
            } else {
                words.add(word);
                unique.add(word);
            }
        }
        String[] res = new String[unique.size()];
        int count = 0;
        for (String word : unique) {
            res[count++] = word;
        }
        return res;
    }
}
