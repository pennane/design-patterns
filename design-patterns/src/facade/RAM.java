package facade;

public class RAM {
	public static final int TOTAL_BYTE_COUNT = 8192;

	private byte[] bytes;

	public RAM() {
		bytes = new byte[TOTAL_BYTE_COUNT];
	}

	public void load(int position, byte[] data) {
		System.out.println("RAM: loading '" + data + "' to position '" + position + "'");
		System.arraycopy(data, 0, bytes, position, data.length);
	}

	public byte[] getBytes() {
		return bytes;
	};
}
