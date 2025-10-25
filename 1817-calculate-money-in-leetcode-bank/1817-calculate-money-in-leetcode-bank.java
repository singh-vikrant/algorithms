class Solution {
    public int totalMoney(int n) {
        int d = n/7;
        int r = n%7;
        int sum = fact(r) + (r*d);
        
        int m = 0;
        if(d>0){ 
            m = (d*28) + (fact(d-1)*7);
        }

        return sum+m;
    }

    int fact(int k) {
        return (k*(k+1))/2;
    }
}