// Problem: Container With Most Water
// Pattern: Two Pointer
// Difficulty: Medium

// Approach:
// 1. Start with two pointers: left (i = 0) and right (j = n-1)
// 2. Calculate area = min(height[i], height[j]) * (j - i)
// 3. Update max area
// 4. Move the pointer which has smaller height
//    (because moving larger height won't increase area)
// 5. Repeat until i < j

// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int max = 0;

        while (i < j) {
            int area = Math.min(height[i], height[j]) * (j - i);
            max = Math.max(max, area);

            // Move the smaller height pointer
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}
