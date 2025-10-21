class Solution {
    public String convert(String s, int numRows) {
        if(numRows <2) return s;
        int n =s.length();
        int[] arr = new int[n];
        int count =1;
        int k =1;
        for(int i=0;i<n;i++){
                arr[i]=count;
                if(k==1){
                    
                    if(count==numRows) {
                        k=-1; 
                        count--;
                    } else {count++;}
                } else {
                    
                    if(count==1){
                    k=1;
                    count++;
                    } else {
                        count--;
                    }
                }
            System.out.print(arr[i]);
        }
        String str="";
        for(int i=1;i<=numRows;i++){
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    str = str + s.charAt(j);
                }
            }
        }

        return str;
    }
}