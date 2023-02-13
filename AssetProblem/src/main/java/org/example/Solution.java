package org.example;

public class Solution {

    public int solution(String s, int[] c){
        int sum = 0, mx = 0, cost = 0;
        for (int i=0;i<s.length();i++){
            if (i>0 && s.charAt(i) != s.charAt(i-1)){
                cost+= sum-mx;
                sum = 0;
                mx = 0;
            }
            sum+= c[i];
            mx = Math.max(c[i], mx);
        }
        cost += sum - mx;
        return cost;
    }
}
