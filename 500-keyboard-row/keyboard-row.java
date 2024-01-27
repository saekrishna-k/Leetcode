class Solution {

    public String[] findWords(String[] words) {
        List<String> a = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            boolean flag = false;
            if (words[i].toLowerCase().matches("[qwertyuiop]+")) {
                flag = true;
            }
            if (words[i].toLowerCase().matches("[asdfghjkl]+")) {
                flag = true;
            }
            if (words[i].toLowerCase().matches("[zxcvbnm]+")) {
                flag = true;
            }
            if (flag) a.add(words[i]);
        }
        return a.toArray(new String[a.size()]);
    }
}
