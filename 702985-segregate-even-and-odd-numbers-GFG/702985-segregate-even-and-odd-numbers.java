

class Solution {
    void segregateEvenOdd(int arr[]) {
    
        List<Integer>evenList = new ArrayList();
        List<Integer>oddList = new ArrayList();
        
        for(int num: arr){
            if(num%2 == 0){
                evenList.add(num);
            }else{
                oddList.add(num);
            }
        }
        
        Collections.sort(evenList);
        Collections.sort(oddList);
        
        int index = 0;
        for (int num : evenList) {
            arr[index++] = num;
        }
        for (int num : oddList) {
            arr[index++] = num;
        }
    }
}

// 12 34 45 9 8 90 3
//     |        |



