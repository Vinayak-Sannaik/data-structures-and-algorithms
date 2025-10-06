class Solution {
    public void reverseString(char[] s) {
        // check is this last elememnt 
        // if yes start returning.

        int lp = 0;
        int rp = s.length - 1;

        while(lp < rp){
            char lch = s[lp];
            char rch = s[rp];

            s[rp] = lch;
            s[lp] = rch;

            lp++;
            rp--;
        }
        
    }
}