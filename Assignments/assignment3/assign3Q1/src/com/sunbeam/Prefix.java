package com.sunbeam;

public class Prefix {
	public static int calculate(int op1, String opr, int op2) {
		switch (opr) {
		case "*":
			return op1 * op2;
		case "/":
			return op1 / op2;
		case "%":
			return op1 % op2;
		case "+":
			return op1 + op2;
		case "-":
			return op1 - op2;
		}
		return 0;
	}

	public static int prefixEvaluation(String prefix) {
		IntStack st = new IntStack(prefix.length());
		String[] arr = prefix.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			String ele = arr[i];
			if (Character.isDigit(ele.charAt(0))) {
				int ele1 = Integer.parseInt(ele);
				st.push(ele1);
			} else {
				int op1 = st.pop();
				int op2 = st.pop();
				int result = calculate(op1, ele, op2);
				st.push(result);
			}
		}
		if (!st.isEmpty())
			return st.pop();
		return 0;
	}
}
