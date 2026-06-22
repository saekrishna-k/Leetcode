class Solution {
    public int maxNumberOfBalloons(String text) {
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;

        for (char c : text.toCharArray()) {
            switch (c) {
                case 'b':
                    b++;
                    break;
                case 'a':
                    a++;
                    break;
                case 'l':
                    l++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'n':
                    n++;
                    break;
            }
        }

        l = l / 2;
        o = o / 2;

        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));

    }
}