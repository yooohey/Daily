package sample1_2;

public class Sample {

	public static void main(String[] args) {
		int i;
		Calc[] calc = new Calc[3];
		calc[0] = new SubCalc1();
		calc[1] = new SubCalc2();
		calc[2] = new SubCalc3();

		for(i = 0; i < 3; i++){
			System.out.println(calc[i].sum(5));
		}
	}

}
