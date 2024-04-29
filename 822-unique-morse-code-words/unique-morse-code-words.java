class Solution {

    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = new String[] {
            ".-",
            "-...",
            "-.-.",
            "-..",
            ".",
            "..-.",
            "--.",
            "....",
            "..",
            ".---",
            "-.-",
            ".-..",
            "--",
            "-.",
            "---",
            ".--.",
            "--.-",
            ".-.",
            "...",
            "-",
            "..-",
            "...-",
            ".--",
            "-..-",
            "-.--",
            "--.."
        };
        Set<String> result = new HashSet<String>();
        for (String word : words) {
            // StringBuilder morseCodedString = new StringBuilder();
            // for (int j = 0; j < word.length(); j++) {
            //     morseCodedString.append(codes[word.charAt(j) - 'a']);
            // }
            // result.add(morseCodedString.toString());

            result.add(convertTOMorseCode(word, codes));
        }
        return result.size();
    }

    private static String convertTOMorseCode(String word, String[] codes) {
        StringBuilder morseCodedString = new StringBuilder();
        for (int j = 0; j < word.length(); j++) {
            morseCodedString.append(codes[word.charAt(j) - 'a']);
        }
        return morseCodedString.toString();
    }
}
