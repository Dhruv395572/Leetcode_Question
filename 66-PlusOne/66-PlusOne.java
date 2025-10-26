// Last updated: 10/26/2025, 10:27:32 PM
class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int[] result=new int[n+1];
        int carry =1;
        for(int i=n-1;i>=0;i--){
            int total=digits[i]+carry;
            result[i+1]=total%10;
            carry=total/10;
        }
        result[0]=carry;
        return carry==0 ? java.util.Arrays.copyOfRange(result, 1, n + 1) : result;
    }
}