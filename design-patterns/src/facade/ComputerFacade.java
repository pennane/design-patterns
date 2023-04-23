package facade;

public class ComputerFacade {
	private static final int BOOT_ADDRESS = 0x800;

	private final CPU cpu;
	private final RAM memory;
	private final HDD drive;

	public ComputerFacade() {
		memory = new RAM();
		cpu = new CPU(memory);
		drive = new HDD();
	}

	public void start() {
		cpu.freeze();
		memory.load(BOOT_ADDRESS, drive.read(HDD.BOOT_SECTOR, HDD.SECTOR_SIZE));
		cpu.jump(BOOT_ADDRESS);
		cpu.execute();
		System.out.println("Computer: BOOTED UP");
	}
}