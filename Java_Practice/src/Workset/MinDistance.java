package Workset;

import java.util.Arrays;

public class MinDistance {
    public static int[] minDistanceSum(int N, int[] A) {
        int[] result = new int[N];
        int left = 0, right = N - 3; // two pointers
        
        while (right < N - 1) {
            int leftDist = A[right] - A[left]; // distance from left friend to current friend
            int rightDist = A[right + 1] - A[right]; // distance from current friend to right friend
            
            // Update result for left and right pointers
            result[left] += leftDist;
            result[right + 1] += rightDist;
            
            // Move pointers
            left++;
            right++;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int N = 5;
        int[] A = {1, 2, 3, 4, 5};
        
        int[] result = minDistanceSum(N, A);
        System.out.println(Arrays.toString(result));
    }
}

