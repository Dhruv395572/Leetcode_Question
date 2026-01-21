// Last updated: 1/21/2026, 10:11:49 PM
1class Solution {
2    public int romanToInt(String s) {
3        HashMap<Character,Integer> roman=new HashMap();
4            roman.put('I',1);
5            roman.put('V',5);
6            roman.put('X',10);
7            roman.put('L',50);
8            roman.put('C',100);
9            roman.put('D',500);
10            roman.put('M',1000);
11            int result=0;
12            for(int i=0;i<s.length();i++){
13                int cur=roman.get(s.charAt(i));
14                if(i<s.length()-1 && roman.get(s.charAt(i+1))>cur){
15                    result-=cur;
16                }
17                else{
18                    result+=cur;
19                }
20            }
21        return result;
22        
23        }
24}