class Solution {

    public String[] findWords(String[] words) {
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";
        List<String> res = new ArrayList<String>();
        boolean isFirstRow = false, isSecondRow = false, isThirdRow = false;
        for (int i = 0; i < words.length; i++) {
            isFirstRow = false;
            isSecondRow = false;
            isThirdRow = false;
            for (int j = 0; j < words[i].length(); j++) {
                Character c = Character.toLowerCase(words[i].charAt(j));
                if (firstRow.indexOf(c) != -1) {
                    isFirstRow = true;
                }
                if (secondRow.indexOf(c) != -1) {
                    isSecondRow = true;
                }
                if (thirdRow.indexOf(c) != -1) {
                    isThirdRow = true;
                }
                if (isFirstRow && isSecondRow && isThirdRow) {
                    break;
                }
            }

            if ((isFirstRow && !isSecondRow && !isThirdRow) || (!isFirstRow && isSecondRow && !isThirdRow) || (!isFirstRow && !isSecondRow && isThirdRow)) {
                res.add(words[i]);
            }
        }

        return res.toArray(new String[res.size()]);
    }
}
