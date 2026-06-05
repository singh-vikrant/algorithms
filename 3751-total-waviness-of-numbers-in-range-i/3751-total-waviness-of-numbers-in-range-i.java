class Solution {
    public int totalWaviness(int num1, int num2) {
        int sum = 0;
        for(int i=num1;i<=num2;i++){
            sum+= count(i);
        }
        return sum;
    }

    int count(int wavy){
        int n = String.valueOf(wavy).length();
        if(n<3) return 0;
        int k =0;
        char[] c = String.valueOf(wavy).toCharArray();
        for(int i=1; i<n-1;i++){
            if((c[i-1]<c[i] && c[i+1] < c[i]) || (c[i-1]>c[i] && c[i+1] > c[i])){
                k++;
            }
        }
        return k;
    }
}