class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int[][] mat = new int[n][n];
        char[] c1= s.toCharArray();
        int a=0,b=0;
        int max=0;
        for(int i=0; i<n;i++){
            mat[i][i]=1;
            if(i<n-1){
                if(c1[i]==c1[i+1]){
                mat[i][i+1] = 1;
                max=1;
                                 a=i;
                                  b=i+max;
                                 }
            else mat[i][i+1]= 0;
            }
        }
        
        for(int k=2;k<n;k++){
            for(int i=0; i<n-k;i++)
            { 
                if(c1[i] == c1[k+i]){
                    if(mat[i+1][k+i-1] == 1){
                        mat[i][k+i]=1;
                        if(k>max){max=k;
                                 a=i;
                                  b=i+max;
                                 }
                    }
                }
            }
        }
        return s.substring(a,b+1);
    }
}

/*class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<2)
            return s;
        char[] car = s.toCharArray();
        int n = s.length();
        String max="";
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++)
            {   String sub=s.substring(i,j+1);
                if(isPalindrome(sub)){
                    if(max.length()<sub.length()){
                        max=sub;
                    }
                }
            }
        }
        return max;
    }
    boolean isPalindrome(String s){
        StringBuffer sb =new StringBuffer(s).reverse();
        return sb.toString().equals(s);
    }
}*/