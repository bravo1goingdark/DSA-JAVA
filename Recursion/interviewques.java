// 1 --> https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
// 2 --> https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/

public class interviewques {
    public static void main(String[] args) {
        int ans = numRollsToTarget(1, 6, 3);
        System.out.println(ans);
    }
    static int numRollsToTarget(int n, int k, int target) { // third case failed (30,30,500)
        int start = n - 1;
        if (start == 0) {
            start = 1;
        }
        int end = k;
        int count = 0;
        while (start != k && end != start) {
            int res = start + end;
            if( res == target){
                count += 1;
            }
            start++;
            end--;   
        }
        return count + 1;

    }
}

