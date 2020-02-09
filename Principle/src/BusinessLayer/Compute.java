package BusinessLayer;

import UserInterface.Display;

public class Compute {
	public void Cal(int a, int b, char s) {
		int result=0;
		switch(s) {
		case '+' : result = (a + b);
		break;
		case '-': result =(a - b);
		break;
		case '*': result =(a * b);
		break;
		case '/': result =(a / b);
		break;
		}
		Display d = new Display();
		d.print(result);
		
	}
}
