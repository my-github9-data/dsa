package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		System.out.println("Q1:");
		String postfix = "45 67 * 13 / 98 + 87 -";
		System.out.println("Postfix : \t" + postfix);
		int result = Postfix.postfixEvaluation(postfix);
		System.out.println("Result : \t" + result);
		System.out.println();
		System.out.println("Q2");
		String prefix = "- + / * 45 67 13 98 87";
		// String prefix = "- + + 43 / * 25 76 83 99 77"; // 87
		System.out.println("Prefix : \t" + prefix);
		int res = Prefix.prefixEvaluation(prefix);
		System.out.println("Result : \t" + res);
		System.out.println();

		String infix = "45 * 67 / 13 + 98 - 87";
		System.out.println("Infix : \t" + infix);
		System.out.println("Q3");
		String postfixStr = Infix.toPostfix(infix);
		System.out.println("Postfix : \t" + postfixStr);
		System.out.println("Result : \t" + Postfix.postfixEvaluation(postfixStr));
		System.out.println();

		System.out.println("Q4");
		String prefixStr = Infix.toPrefix(infix);
		System.out.println("Prefix : \t" + prefixStr);
		System.out.println("Result : \t" + Prefix.prefixEvaluation(prefixStr));

	}

}
