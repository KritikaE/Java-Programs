public class MergeStrings {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "pqrs";

        String merged = "";
        int i = 0, j = 0;

        while (i < s1.length() && j < s2.length()) {
            merged += s1.charAt(i++);
            merged += s2.charAt(j++);
        }

        if (i < s1.length()) {
            merged += s1.substring(i);
        }

        if (j < s2.length()) {
            merged += s2.substring(j);
        }

        System.out.println("Merged String = " + merged);
    }
}
