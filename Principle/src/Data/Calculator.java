package Data;

import BusinessLayer.Compute;
public class Calculator {
	public void Setvalue() {
		int a, b;
		char op;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the First operand: ");
		a = sc.nextInt();
		System.out.println("Enter the Second operand: ");
		b = sc.nextInt();
		System.out.println("Enter the operator: ");
		op = sc.next().charAt(0);
		Compute c = new Compute();
		c.Cal(a, b, op);
	}
}
