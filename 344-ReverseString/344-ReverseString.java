// Last updated: 10/26/2025, 10:29:15 PM
class Solution {
    public void reverseString(char[] s) {
     int i=0;
     int end=s.length-1;
     while(i<end){
        char temp=s[i];
        s[i]=s[end];
        s[end]=temp;
        i++;
        end--;
     } 
     return;  
    }
}