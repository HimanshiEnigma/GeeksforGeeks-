class Solution {
    public int minJumps(int[] arr) {
        // code here
        int n = arr.length;
        if (n <= 1) return 0; // No jump needed
        if (arr[0] == 0) return -1; // Can't move anywhere

        int jumps = 1; // At least one jump will be needed
        int farthest = arr[0]; // Farthest index reachable
        int currentEnd = arr[0]; // Current jump's end index

        for (int i = 1; i < n; i++) {
            if (i == n - 1) return jumps; // Reached last index

            farthest = Math.max(farthest, i + arr[i]);

            if (i == currentEnd) { // End of current jump range
                jumps++;
                currentEnd = farthest;

                if (currentEnd <= i) return -1; // Can't move forward
            }
        }
        return -1; // End not reachable
    }
}
