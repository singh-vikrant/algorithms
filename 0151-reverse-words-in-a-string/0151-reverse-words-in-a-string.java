class Solution {
    public String reverseWords(String s) {
        String[] sa = s.split(" ");
    String str="";
    for(int i=sa.length-1;i>0;i--){
        if(sa[i].trim().length()>0){
        str = str+ sa[i].trim() + " ";
        }
    }

    str = str+sa[0];
    return str.trim();

    }
}