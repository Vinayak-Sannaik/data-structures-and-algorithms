class Solution {
    public int maxDepth(String s){ 

        // two pointer will not work
        // int depth = 0;
        // int left = 0;
        // int right = s.length() - 1;
        // while(left < right){
        //     char lc = s.charAt(left);
        //     char rc = s.charAt(right);
        //     if(lc == '(' && rc == ')'){
        //         depth ++;
        //         left++; right--;
        //     }else if( lc != '('){
        //         left++;
        //     }else{
        //         right--;
        //     }
        // }
        // return depth;


        // USe balcnced approch.

        int length = s.length();
        int depth = 0;
        int maxDepth = 0;

        for(int i = 0; i < length ; i++){
            char c = s.charAt(i);

            if(c == '('){
                depth++;
                maxDepth = Math.max(depth, maxDepth);
            }else if( c == ')'){
                depth--;
                maxDepth = Math.max(depth, maxDepth);
            }
        }

        return maxDepth;
    }
}

// d = 3
// (
// |
// d = 4
