package chainofresposibility;

public class Yksikönpäällikkö implements IEsimies {
	IEsimies next;

	@Override
	public void setNext(IEsimies next) {
		this.next = next;
	}

	@Override
	public void handleSalaryIncreaseRequest(int percentage) {
		if (percentage > 5) {
			next.handleSalaryIncreaseRequest(percentage);
			return;
		}
		System.out.println("ok saat " + percentage + " % lisää palkkaa t: yksikönpäällikkö");
	}

}
