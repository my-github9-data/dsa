package com.sunbeam;

public class Postfix {

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

	public static int postfixEvaluation(String postfix) {
		IntStack st = new IntStack(postfix.length());

		String[] arr = postfix.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String ele = arr[i];
			if (Character.isDigit(ele.charAt(0))) {
				int ele1 = Integer.parseInt(ele);
				st.push(ele1);
			} else {
				int op2 = st.pop();
				int op1 = st.pop();
				int res = calculate(op1, ele, op2);
				st.push(res);
			}
		}
		if (!st.isEmpty())
			return st.pop();
		return 0;
	}
}
