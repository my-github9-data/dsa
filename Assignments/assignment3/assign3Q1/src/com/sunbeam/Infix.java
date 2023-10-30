package com.sunbeam;

public class Infix {
	public static int priority(String opr) {
		switch (opr) {
		case "$":
			return 10;
		case "*":
			return 9;
		case "/":
			return 9;
		case "%":
			return 9;
		case "+":
			return 8;
		case "-":
			return 8;
		}
		return 0;
	}

	public static String toPostfix(String infix) {
		StringStack st = new StringStack(infix.length());
		StringBuilder postfix = new StringBuilder();
		String[] arr = infix.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String ele = arr[i];
			if (Character.isDigit(ele.charAt(0)))
				postfix.append(ele + " ");
			else if (ele.equals("("))
				st.push(ele);
			else if (ele.equals(")")) {
				while (st.peek() != "(")
					postfix.append(st.pop() + " ");
				st.pop();
			} else {
				while (!st.isEmpty() && priority(st.peek()) >= priority(ele))
					postfix.append(st.pop() + " ");
				st.push(ele);
			}
		}
		while (!st.isEmpty()) {
			postfix.append(st.pop() + " ");
		}
		return postfix.toString();
	}

	public static String toPrefix(String infix) {
		StringStack st = new StringStack(infix.length());
		StringBuilder prefix = new StringBuilder();
		String[] arr = infix.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			String ele = arr[i];
			if (Character.isDigit(ele.charAt(0)))
				prefix.append(ele + " ");
			else if (ele.equals(")"))
				st.push(ele);
			else if (ele.equals("(")) {
				while (st.peek() != ")")
					prefix.append(st.pop() + " ");
				st.pop();
			} else {
				while (!st.isEmpty() && priority(st.peek()) > priority(ele))
					prefix.append(st.pop() + " ");
				st.push(ele);
			}
		}
		while (!st.isEmpty())
			prefix.append(st.pop() + " ");
		String[] rev = prefix.toString().split(" ");
		String prefixStr = "";
		for (int i = rev.length - 1; i >= 0; i--)
			prefixStr += (rev[i] + " ");
		return prefixStr;
	}
}
