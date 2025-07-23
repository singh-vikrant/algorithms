class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n = t.length;
        int result[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.empty() && t[i]>t[st.peek()]) {
                int a = st.pop();
                result[a]=i-a;
            }
            st.push(i);
        }
        return result;
    }
}