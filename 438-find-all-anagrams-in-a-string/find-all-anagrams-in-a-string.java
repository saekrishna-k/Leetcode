class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        int sl = s.length(), pl = p.length();
        List<Integer> result = new ArrayList<>();
        if (pl > sl) return result;

        int[] sfreq = new int[26];
        int[] pfreq = new int[26];

        for (int i = 0; i < pl; i++) {
            sfreq[s.charAt(i) - 'a']++;
            pfreq[p.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= sl - pl; i++) {
            if (Arrays.equals(sfreq, pfreq)) {
                result.add(i);
            }
            sfreq[s.charAt(i) - 'a']--;
            if(i + pl != sl){
                sfreq[s.charAt(i + pl) - 'a']++;
            }
        }
        return result;
    }

    private boolean matches(int[] freq1, int[] freq2) {
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) return false;
        }
        return true;
    }
}
