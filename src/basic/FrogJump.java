package basic;

public class FrogJump {

//	private int countEnergy(int step, int[] heights, int[] dp) {
//		if (step == 0)
//			return 0;
//
//		if (dp[step] != -1)
//			return dp[step];
//
//		int oneJump = Math.abs(heights[step] - heights[step - 1]) + countEnergy(step - 1, heights, dp);
//		int twoJumps = Integer.MAX_VALUE;
//		if (step > 1) {
//			twoJumps = Math.abs(heights[step] - heights[step - 2]) + countEnergy(step - 2, heights, dp);
//		}
//
//		dp[step] = Math.min(oneJump, twoJumps);
//		return dp[step];
//	}

	private int countEnergy(int step, int[] heights) {
		int[] energy = new int[step + 1];
		energy[0] = 0;

		for (int index = 1; index <= step; index++) {
			int oneJump = Math.abs(heights[index] - heights[index - 1]) + energy[index - 1];
			int twoJumps = Integer.MAX_VALUE;
			if (index > 1) {
				twoJumps = Math.abs(heights[index] - heights[index - 2]) + energy[index - 2];
			}
			energy[index] = Math.min(oneJump, twoJumps);
		}

		return energy[step];
	}

	public static void main(String[] args) {

//      int[] dp = new int[n];
//      Arrays.fill(dp, -1);
//      return countEnergy(n-1, heights, dp);

		FrogJump obj = new FrogJump();

		int[] heights = { 10, 20, 30, 10 };
		int result = obj.countEnergy(heights.length - 1, heights);
		System.out.println(result);

	}
}
