class Solution {

    void printNos(int N) {  
        
        //base case
        if(N == 0){   
            return;
        }
        
        // Calculation and call
        System.out.print(N + " ");
        
        printNos(N-1);
    }
}