class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s: tokens){
            if(s.matches("-?\\d+")){
                st.push(Integer.parseInt(s));
            } else {
                int a = st.pop();
                int b = st.pop();
                st.push(calc(b,a,s));
            }
        }
        return st.pop();
    }
    int calc(int a, int b, String s){
        switch (s) {
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return a/b;
            }
        return 0;
    }
}