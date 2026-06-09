class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int j=1;
        for(int i=0;i<target.length;i++){
            if(target[i]==j) 
            {   System.out.print(1);
                res.add("Push");
            } else{
                System.out.print(j+" ");
                while(j!=target[i]){
                        res.add("Push");
                        res.add("Pop");
                        j++;
                }
                res.add("Push");
            }

                j++;
        }
        return res;
    }
}