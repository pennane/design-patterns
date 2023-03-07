package chainofresposibility;

public interface IEsimies {
	void setNext(IEsimies next);

	void handleSalaryIncreaseRequest(int percentage);
}
