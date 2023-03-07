package chainofresposibility;

public class Lähiesimies implements IEsimies {
	IEsimies next;

	@Override
	public void setNext(IEsimies next) {
		this.next = next;
	}

	@Override
	public void handleSalaryIncreaseRequest(int percentage) {
		if (percentage > 2) {
			next.handleSalaryIncreaseRequest(percentage);
			return;
		}
		System.out.println("ok bro saat " + percentage + " % lisää palkkaa t: lähiesimies");
	}

}