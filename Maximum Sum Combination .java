class Solution {
    public ArrayList<Integer> topKSumPairs(int[] a, int[] b, int k) {
        // code here
    ArrayList<Integer> result = new ArrayList<>();

        int n = a.length;
        int m = b.length;

        // Sort both arrays in descending order
        Arrays.sort(a);
        Arrays.sort(b);
        
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (x, y) -> Integer.compare(y[0], x[0])  // Max-Heap based on sum
        );

        Set<String> visited = new HashSet<>();

        // Start with the largest elements
        int i = n - 1, j = m - 1;
        maxHeap.add(new int[]{a[i] + b[j], i, j});
        visited.add(i + "," + j);

        while (k > 0 && !maxHeap.isEmpty()) {
            int[] current = maxHeap.poll();
            int sum = current[0];
            i = current[1];
            j = current[2];
            result.add(sum);
            k--;

            // Move to (i-1, j)
            if (i - 1 >= 0 && !visited.contains((i - 1) + "," + j)) {
                maxHeap.add(new int[]{a[i - 1] + b[j], i - 1, j});
                visited.add((i - 1) + "," + j);
            }

            // Move to (i, j-1)
            if (j - 1 >= 0 && !visited.contains(i + "," + (j - 1))) {
                maxHeap.add(new int[]{a[i] + b[j - 1], i, j - 1});
                visited.add(i + "," + (j - 1));
            }
        }

        return result;
    }

}
