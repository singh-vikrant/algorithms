class Solution {
    public int maxProfit(int[] p) {
        int max = 0;
        for(int i=1; i<p.length; i++) {
            max=p[i]-p[i-1]>0?max+p[i]-p[i-1]:max;
        }
        return max;
    }
}