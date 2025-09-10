import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            Integer[] arr = new Integer[N]; // NOTE: Integer[] (not int[]) for Arrays.sort with Comparator
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            sortByFrequency(arr);
        }
    }

    static void sortByFrequency(Integer[] arr) {
        // Step 1: Build frequency map
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Sort directly on array
        Arrays.sort(arr, (a, b) -> {
            int freqCompare = freqMap.get(b).compareTo(freqMap.get(a)); // sort by frequency desc
            if (freqCompare == 0) {
                return a - b; // if freq equal, sort by value asc
            }
            return freqCompare;
        });

        // Step 3: Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
