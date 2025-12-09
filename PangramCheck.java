public class PangramCheck {
    public static void main(String[] args) {

        String sentence = "The quick brown fox jumps over the lazy Dog";
        boolean[] seen = new boolean[26];

        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                seen[ch - 'a'] = true;
            }
        }

        int flag=0;
        for (int i = 0; i < 26; i++) {
            if (!seen[i]) {
                flag=1;
                break;
            }
        }

        if (flag==0)
            System.out.println(1);
        else
            System.out.println(-1);
    }
}
