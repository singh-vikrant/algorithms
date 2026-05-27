class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int n: nums){pq.offer(n);}
        int m = 0;
        for(int i=0; i<k;i++){
            m = pq.poll();
        }
        return m;
    }
}