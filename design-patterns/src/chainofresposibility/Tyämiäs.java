package chainofresposibility;

public class Tyämiäs {
	IEsimies lähiesimies;

	public Tyämiäs(IEsimies lähiEsimies) {
		this.lähiesimies = lähiEsimies;
	}

	public void salaryIncreaseRequest(int percentage) {
		this.lähiesimies.handleSalaryIncreaseRequest(percentage);
	}
}
