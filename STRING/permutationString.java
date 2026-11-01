import java.util.Arrays;

public class permutationString {
    public static boolean permutation(String str1, String str2){
        int freq [] = new int[26];

        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            int index = ch - 'a';
            freq[index] = freq[index] + 1;
        }

        int windSize = str1.length();
        
        for(int i=0;i<str2.length();i++){
            int windIdx = 0, idx =i;
            int windfreq [] = new int[26];

            while(windIdx < windSize && idx < str2.length()){
                char ch = str2.charAt(idx);
                int index = ch - 'a';
                windfreq[index] = windfreq[index] + 1;

                windIdx++;
                idx++;
            } 
            if(Arrays.equals(freq, windfreq)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "aba";
        String str2 = "abcxbaba";
        System.out.println(permutation(str1, str2));
    }
}
