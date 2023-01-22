package abstractfactory;


public class Main {

	public static void main(String[] args) {
		Jasper jasper = new Jasper();
		IApparelFactory apparelFactory = jasper.createApparelFactory();
		jasper.dressUp(apparelFactory);

		System.out.println(jasper);

	}

}
