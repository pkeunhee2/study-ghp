package kr.pe.ghp.study.algorithm;

/**
 * 
 * @author geunhui park
 *
 */
public class MaxinumSubarray {
	public static void main(String[] ar) {
		int[] inputArray = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		int result = solution1(inputArray);
		System.out.println(result);

		int result2 = solution2(inputArray);
		System.out.println(result2);

		maxSubArray(inputArray);
		my1(inputArray);
	}

	public static void my1(int[] array) {
		int maxSum = array[0];
		int[] sum = new int[array.length];

		int start = 0;
		int end = 0;
		for (int i = 1; i < array.length; i++) {
			int newStart = start;
			int newEnd = end;

			if (array[i] > array[i] + sum[i - 1]) {
				sum[i] = array[i];
				newStart = i;
				newEnd = i;
			} else {
				sum[i] = array[i] + sum[i - 1];
				newEnd = i;
			}

			if (maxSum < array[i] + sum[i - 1]) {
				maxSum = array[i] + sum[i - 1];
				start = newStart;
				end = newEnd;
			}
		}

		System.out.println();
		System.out.println("max sum : " + maxSum);
		System.out.println("start : " + start);
		System.out.println("end : " + end);
	}

	/**
	 * slow
	 * 
	 * @param a
	 * @return
	 */
	public static int solution1(int[] a) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			maxSum = Math.max(maxSum, sum);
			if (sum < 0) {
				sum = 0;
			}
		}

		return maxSum;
	}

	/**
	 * dynamic programming solution
	 * We should ignore the sum of the previous n-1 elements if nth element is greater than the sum
	 * @param a
	 * @return
	 */
	public static int solution2(int[] a) {
		int maxSum = a[0];
		int[] sum = new int[a.length];
		sum[0] = a[0];

		for (int i = 1; i < a.length; i++) {
			sum[i] = Math.max(a[i], a[i] + sum[i - 1]);
			maxSum = Math.max(maxSum, sum[i]);
		}

		return maxSum;
	}

	/**
	 * search max subarray
	 * @param array
	 */
	public static void maxSubArray(int[] array) {
		int max = array[0];
		int[] sum = new int[array.length];
		sum[0] = array[0];

		int begin = 0;
		int end = 0;

		for (int i = 1; i < array.length; i++) {
			int newBegin = begin;
			int newEnd = end;

			if (array[i] > array[i] + sum[i - 1]) { //왼쪽 부분합이 음수가 나오면 현재 값 혼자가 더 크다
				sum[i] = array[i];

				//새롭게 시작
				newBegin = i;
				newEnd = i;
			} else { //이전 부분합과 더하는게 좋은 경우
				sum[i] = array[i] + sum[i - 1];
				newEnd = i;
			}

			if (sum[i] > max) { //기존 최대값 보다 큰 경우 찾았으면
				max = sum[i];
				begin = newBegin;
				end = newEnd;
			}
		}

		for (int j = begin; j <= end; j++) {
			boolean isLast = j == end;
			System.out.print(String.valueOf(array[j]) + (!isLast ? ", " : ""));
		}
	}
}
