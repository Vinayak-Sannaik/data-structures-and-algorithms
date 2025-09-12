class Solution {
    public void sortInWave(int arr[]) {
        // code here
        int length = arr.length - 1;
        for(int i = 0; i < length ; i +=2){
            // check we are considering even or odd pair
            // if((i)%2 == 0){
                //if evrn then check ifnot swap
                if(arr[i] < arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            // }else{
            //     if(arr[i] <= arr[i+1]){
            //         int temp = arr[i];
            //         arr[i] = arr[i+1];
            //         arr[i+1] = temp;
            //     }
            // }
        }
    }
}

//  0     3
// [1, 2, 3, 4, 5]
// odd pair
//     2 , 1 , 3, 4, 5


    