package chainofresposibility;

public class Toimitusjohtaja implements IEsimies {
	IEsimies next;

	@Override
	public void setNext(IEsimies next) {
		this.next = next;
	}

	@Override
	public void handleSalaryIncreaseRequest(int percentage) {
		if (percentage > 9000) {
			System.out.println("Ai yli 9000?? ei mitää chäänssii t: toimari");
			return;
		}
		System.out.println("ok bro saat " + percentage + " % lisää palkkaa t: toimari");

	}

}
