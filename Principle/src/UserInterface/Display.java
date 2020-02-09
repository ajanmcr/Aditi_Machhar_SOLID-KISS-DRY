package UserInterface;
import Data.Calculator;
public class Display {
	public void print(int res) {
		System.out.println(res);
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.Setvalue();
	}
}
