package basic;

public class Fibonacci {

//	private int fibonacci(int position) {
//		if (position <= 1) {
//			return position;
//		}
//		return getFibonacci(position - 1) + getFibonacci(position - 2);
//	}

	private int getFibonacci(int position) {
		if (position <= 1) {
			return position;
		}

		int second = 0;
		int first = 1;

		for (int index = 2; index < position; index++) {
			int current = second + first;
			second = first;
			first = current;
		}

		return first;
	}

	public static void main(String[] args) {

		int position = 5;

		Fibonacci obj = new Fibonacci();

		int result = obj.getFibonacci(position);

		System.out.println(result);

	}
}
