package facade;

public class HDD {
	public static final int TOTAL_BYTE_COUNT = 65536;
	public static final int BOOT_SECTOR = 0x1;
	public static final int SECTOR_SIZE = 512;

	private static final String BOOT_SECTOR_CONTENT = "this string is stored in boot sector";
	private static final byte[] BOOT_SECTOR_BYTES = BOOT_SECTOR_CONTENT.getBytes();

	private byte[] bytes;

	public HDD() {
		bytes = new byte[TOTAL_BYTE_COUNT];
		System.arraycopy(BOOT_SECTOR_BYTES, 0, bytes, BOOT_SECTOR, BOOT_SECTOR_BYTES.length);
	}

	public byte[] read(int logicalBlockAddress, int size) {
		byte[] data = new byte[size];
		System.arraycopy(bytes, logicalBlockAddress, data, 0, size);
		return data;
	}
}