import java.util.*;

class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return 0;
        }

        Map<Integer, Integer> evenMap = new HashMap<>();
        Map<Integer, Integer> oddMap = new HashMap<>();

        // Count frequencies at even and odd indices
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenMap.put(nums[i], evenMap.getOrDefault(nums[i], 0) + 1);
            } else {
                oddMap.put(nums[i], oddMap.getOrDefault(nums[i], 0) + 1);
            }
        }

        // Get top two frequent elements from both maps
        int[] even = getTopTwo(evenMap);
        int[] odd = getTopTwo(oddMap);

        int evenNum = even[0];
        int evenFreq = even[1];
        int evenNum2 = even[2];
        int evenFreq2 = even[3];

        int oddNum = odd[0];
        int oddFreq = odd[1];
        int oddNum2 = odd[2];
        int oddFreq2 = odd[3];

        // If most frequent numbers are different
        if (evenNum != oddNum) {
            return n - evenFreq - oddFreq;
        }

        // Try second best options
        return Math.min(
                n - evenFreq - oddFreq2,
                n - evenFreq2 - oddFreq
        );
    }

    private int[] getTopTwo(Map<Integer, Integer> map) {
        int num1 = -1, freq1 = 0;
        int num2 = -1, freq2 = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (freq > freq1) {
                num2 = num1;
                freq2 = freq1;

                num1 = num;
                freq1 = freq;
            } else if (freq > freq2) {
                num2 = num;
                freq2 = freq;
            }
        }

        return new int[]{num1, freq1, num2, freq2};
    }
}