public class RecursionFun {
	// Precondition: m and n are not both 0 (either or both may be negative)
	public int factorial(int n) {
		if (n < 2) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	// Precondition: m and n are not both 0 (either or both may be negative)
	public int GCD(int m, int n) {
		if (m == 0 && n == 0) {
			return 0;
		}
		if (n == 0) {
			return Math.abs(m);
		} else {
			return GCD(n, Math.abs(m % n));
		}
	}

	// Precondition: n >= 1
	public double addReciprocals(int n) {
		if (n == 1) {
			return 1.0;
		} else {
			double m = n;
			return 1 / m + addReciprocals(n - 1);
		}
	}

	// Precondition: n > 0 && n <= 40 (takes a long time when n > 40)
	public int fibonacci(int n) {
		if (n <= 2) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public String pairStar(String str) {
		if (str.length() == 0) {
			return "";
		} else if (str.length() == 1) {
			return str;
		} else {
			int l = str.length();
			if (str.substring(l - 1, l).equals(str.substring(l - 2, l - 1))) {
				return pairStar(str.substring(0, l - 1)) + "*"
						+ str.substring(l - 1, l);
			} else {
				return pairStar(str.substring(0, l - 1))
						+ str.substring(l - 1, l);
			}
		}
	}

	public boolean nestParen(String str) {
		int i = 0;
		if (str.length() == 0) {
			return i == 0;
		} else if (str.length() == 1) {
			i++;
			return i == 0;
		} else {
			int l = str.length();
			if ((str.substring(l - 1, l)).equals(")")
					&& str.substring(0, 1).equals("(")) {

				return (i == 0) == (nestParen(str.substring(1, l - 1)));
			} else {
				i++;
				return (i == 0) == (nestParen(str.substring(1, l - 1)));
			}
		}
	}

	// Preconditions: x.length >= 1, beginIndex<x.length && endIndex<x.length
	public int sumArray(int[] nums, int beginIndex, int endIndex) {
		int b = beginIndex;
		int e = endIndex;
		if (b > e) {
			return 0;
		}
		if (b == e) {
			return nums[b];
		} else {
			return nums[e] + sumArray(nums, b, e - 1);
		}

	}

	// Preconditions: beginIndex == 0 and rightIndex == x.length-1
	public void reverseArray(int[] nums) {
		reverse(nums, 0, nums.length - 1);
	}

	private void reverse(int[] num, int a, int b) {
		if (a < b) {
			int temp = num[a];
			num[a] = num[b];
			num[b] = temp;
			reverse(num, ++a, --b);
		}
	}

	// Precondition: a.length >= 1
	public int arrayRange(int[] nums) {
		return max(nums, 0) - min(nums, 0);
	}

	private int max(int[] nums, int from) {
		if (from == nums.length - 1) {
			return nums[from];
		}
		return Math.max(nums[from], max(nums, from + 1));
	}

	private int min(int[] nums, int from) {
		if (from == nums.length - 1) {
			return nums[from];
		}
		return Math.min(nums[from], min(nums, from + 1));
	}

	// Precondition: strings.length > 0 (no empty arrays)
	public int binarySearch(String searchValue, String[] strs) {

		return Search(strs, searchValue, 0, strs.length - 1);
	}

	private int Search(String[] a, String x, int i, int k) {
		if (i > k) {
			return -1;
		}
		int j = (i + k) / 2;
		if (a[j] == x) {
			return j;
		} else if (a[j].compareToIgnoreCase(x) < 0) {
			return Search(a, x, j + 1, k);
		} else {
			return Search(a, x, i, j - 1);
		}
	}

	// Precondition: n >= 0
	public String intWithCommas(int n) {
		if (n / 1000 == 0) {
			return String.valueOf(n);
		} else {
			if (n % 1000 < 10) {
				return intWithCommas(n / 1000) + "," + "0" + "0"
						+ String.valueOf(n % 1000);
			} else if (n % 1000 < 100 && n % 1000 >= 10) {
				return intWithCommas(n / 1000) + "," + "0"
						+ String.valueOf(n % 1000);
			} else {
				return intWithCommas(n / 1000) + "," + String.valueOf(n % 1000);
			}
		}
	}

}
