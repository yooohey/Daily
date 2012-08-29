
public class Calc {
	static double rate;

	Calc(double x){
		rate = x;
	}
	private int weight = 100;
	private int calc(int x){
		return (int)(x * rate) - weight;
	}
	void printCalc(int x){
		System.out.println(x + "→" + calc(x));
	}
}
