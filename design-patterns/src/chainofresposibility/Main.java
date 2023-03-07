package chainofresposibility;

public class Main {
	public static void main(String[] args) {
		IEsimies lähiesimies = new Lähiesimies();
		IEsimies yksikönPäällikkö = new Yksikönpäällikkö();
		IEsimies toimitusjohtaja = new Toimitusjohtaja();

		lähiesimies.setNext(yksikönPäällikkö);
		yksikönPäällikkö.setNext(toimitusjohtaja);

		Tyämiäs tyämies = new Tyämiäs(lähiesimies);

		tyämies.salaryIncreaseRequest(2);
		tyämies.salaryIncreaseRequest(4);
		tyämies.salaryIncreaseRequest(10);
		tyämies.salaryIncreaseRequest(9001);
	}
}
