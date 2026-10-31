//IN-PLACE STRING COMPRESSION - Two Pointer Approach

public class stringCompressed1 {
    public static int comppressed(char chars[]) {
        Integer j = 0;
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            Integer count = 0;
            while (i < chars.length && chars[i] == ch) {
                count++;
                i++;
            }
            if (count == 1) {
                chars[j] = ch;
                j++;
            } else {
                chars[j] = ch;
                j++;

                String str = Integer.toString(count);
                for (int k = 0; k < str.length(); k++) {
                    chars[j] = str.charAt(k);
                    j++;
                }
            }
            i--;
        }

        return j;
    }

    public static void main(String[] args) {
        char chars[] = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        System.out.println(comppressed(chars));
    }
}
