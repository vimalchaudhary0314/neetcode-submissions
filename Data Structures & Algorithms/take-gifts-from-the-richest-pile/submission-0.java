class Solution {
    public long pickGifts(int[] gifts, int k) {
        int sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        for(int n : gifts){
            pq.offer(n);
        }
        while(k > 0){
            int largest = pq.poll();
            int sqr = (int) Math.sqrt(largest);
            pq.offer(sqr);
            k--;
        }
        while(!pq.isEmpty()){
            sum += pq.poll();
        }
        return (long) sum;
    }
}