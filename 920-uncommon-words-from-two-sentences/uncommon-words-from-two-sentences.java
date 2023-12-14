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

        Map<String, Integer> count = new HashMap<>();
        for (String s : (s1 + " " + s2).split("\\s")) {
            count.put(s, count.getOrDefault(s, 0) + 1);
        }
        return count.entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).toArray(String[]::new);
    }
}
