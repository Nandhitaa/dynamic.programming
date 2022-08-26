package basic;

public class ClimbingStairs {

//	private int countWay(int step, int[] dp) {
//		if (step == 0)
//			return 1;
//		if (step < 0)
//			return 0;
//
//		if (dp[step] != -1)
//			return dp[step];
//
//		int oneStep = countWay(step - 1, dp);
//		int twoSteps = countWay(step - 2, dp);
//
//		dp[step] = oneStep + twoSteps;
//
//		return dp[step];
//	}

	private int countWays(int last) {
		int[] steps = new int[last + 1];
		steps[0] = 1;
		steps[1] = 1;
		for (int index = 2; index < last + 1; index++) {
			steps[index] = steps[index - 1] + steps[index - 2];
		}
		return steps[last];
	}

	public static void main(String[] args) {
		int steps = 5;
		ClimbingStairs obj = new ClimbingStairs();
//		 int[] dp = new int[n+1];
//		 Arrays.fill(dp, -1);
//		 countWay(n, n, dp);
//		 return dp[n];
		int result = obj.countWays(steps);
		System.out.println(result);
	}
}
