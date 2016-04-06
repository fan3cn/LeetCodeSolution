import java.util.*; 

/**
 *
 * @author Eric Fan
 * @created 2016/04/06
 *
 */
public class Solution{
	
	/**
	 * enterance
	 */
	public static void main(String[] args){
		Solution s = new Solution();
		//call one method

	}

	/**
	*@description "You are climbing a stair case. It takes n steps to reach to the top.
	*Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?"
	*@refer https://leetcode.com/problems/climbing-stairs/
	*'cause it only climbs 1 or 2 steps one time so distinct ways of step n is the sum of ( n -1 ) and (n - 2)
    */
    public int climbStairs(int n) {
        if(n <= 0){
            return 0;
        }
        if(n <= 2){
            return n;
        }
        int sum = 0;
        int pre = 1;
        int cur = 2;
        for(int i=2; i<n; i++){
            sum = pre + cur;
            pre = cur;
            cur = sum;
        }
        return sum;
    }

	/**
	*@description "Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.
	*For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, return 2 because 13 = 4 + 9."
	*@refer https://leetcode.com/problems/perfect-squares/
    */
    public int numSquares(int n) {
        int []min = new int[n+1];
        min[0] = 0;
        for(int i=1;i<=n;i++){
            min[i] =n;
            for(int j=1;j<=Math.sqrt(n);j++){
                if(i >= j*j && min[i - j*j] + 1 < min[i]){
                    min[i] = min[i -j*j] +1;
                }
            }
        }
        return min[n];
    }    



} 
