package facade;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class CPU {
	private int cursor;
	private RAM memory;

	public CPU(RAM memory) {
		this.memory = memory;
	}

	public void freeze() {
		System.out.println("CPU: freezing...");
	}

	public void jump(int position) {
		System.out.println("CPU: jumping to '" + position + "'");
		cursor = position;
	}

	public void execute() {
		System.out.println("CPU: executing from '" + cursor + "'");
		byte[] bytes = memory.getBytes();
		String str = new String(Arrays.copyOfRange(bytes, cursor, bytes.length), StandardCharsets.US_ASCII);
		System.out.println("CPU: '" + str + "'");
	}
}
