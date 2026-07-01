class Solution {
    public boolean isAnagram(String s, String t) {

        int length1 = s.length();
        int length2 = t.length();

        if(length1 != length2) return false;

        int[] c1 = new int[26];
        int[] c2 = new int[26];

        for(int i = 0; i < length1; i++) {
            c1[s.charAt(i) - 'a']++;
            c2[t.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++) {
            if(c1[i] != c2[i]) return false;
        }

        return true;
    }
}
