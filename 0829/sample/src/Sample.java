
public class Sample {

	public static void main(String[] args) {
		Calc money = new Calc(1.05);
		Calc money2 = new Calc(1.15);
		money.printCalc(20000);
		System.out.println("利率は" + Calc.rate);
		money2.printCalc(20000);
		System.out.println("利率は" + Calc.rate);
	}

}
