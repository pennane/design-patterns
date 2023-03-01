package templatemethod;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TicTacToe extends Game {
	public static final int[][] EMPTY_GRID = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
	public static final String[] ROW_TITLES = { "A", "B", "C" };

	private static final Map<String, Integer> INDEX_MAP;
	static {
		Map<String, Integer> temp = new HashMap<>();
		temp.put("a", 0);
		temp.put("b", 1);
		temp.put("c", 2);
		temp.put("1", 0);
		temp.put("2", 1);
		temp.put("3", 2);
		INDEX_MAP = Collections.unmodifiableMap(temp);
	}

	private int[][] grid;

	private int winner;

	String getPlayerSymbol(int player) {
		if (player == 1)
			return "X";
		if (player == 2)
			return "O";
		return " ";
	}

	void clearScreen() {
		for (int i = 0; i < 50; ++i)
			System.out.println();
	}

	void drawGrid() {
		clearScreen();
		for (int x = 0; x < grid.length; x++) {
			int[] row = grid[x];
			System.out.print("\n" + ROW_TITLES[x] + " ");
			for (int y = 0; y < row.length; y++) {
				System.out.print("[" + getPlayerSymbol(grid[x][y]) + "]");
			}
		}
		System.out.println("\n   1  2  3");
	}

	int[] readSelection() {
		Scanner scanner = new Scanner(System.in);
		String[] tokens = scanner.nextLine().split("");
		int x = INDEX_MAP.getOrDefault(tokens[0].toLowerCase(), -1);
		int y = INDEX_MAP.getOrDefault(tokens[1].toLowerCase(), -1);
		int[] point = { x, y };
		return point;
	}

	int checkRows() {
		int winner = -1;
		for (int x = 0; x < grid.length; x++) {
			int prev = -1;
			for (int y = 0; y < grid[x].length; y++) {
				winner = grid[x][y];
				if (prev == -1) {
					prev = winner;
					continue;
				}
				if (winner != prev) {
					winner = -1;
					break;
				}
				if (y == grid[x].length - 1) {
					return winner;
				}
			}
		}
		return winner;

	}

	int checkCols() {
		int winner = -1;
		for (int y = 0; y < grid[0].length; y++) {
			int prev = -1;
			for (int x = 0; x < grid.length; x++) {
				winner = grid[x][y];
				if (prev == -1) {
					prev = winner;
					continue;
				}
				if (winner != prev) {
					winner = -1;
					break;
				}
				if (x == grid.length - 1) {
					return winner;
				}
			}
		}
		return winner;
	}

	int checkDiags() {
		int winner = grid[1][1];
		if (winner <= 0) {
			return -1;
		}

		if (grid[0][0] == winner && grid[2][2] == winner) {
			this.winner = winner;
			return winner;
		}
		if (grid[0][2] == winner && grid[2][0] == winner) {
			this.winner = winner;
			return winner;
		}
		return -1;
	}

	@Override
	void initializeGame() {
		grid = EMPTY_GRID;
		drawGrid();
	}

	@Override
	void makePlay(int p, Boolean retry) {
		int player = p + 1;
		drawGrid();
		System.out.println(
				"\nPlayer " + player + " (" + getPlayerSymbol(player) + ") turn.\nSelect a cell. (example \"a1\")");

		if (retry) {
			System.out.println("FAILURE, please retry.");
		}

		int[] point = readSelection();

		if (point[0] == -1 || point[1] == -1) {
			makePlay(p, true);
			return;
		}

		if (grid[point[0]][point[1]] != 0) {
			makePlay(p, true);
			return;
		}

		grid[point[0]][point[1]] = player;
	}

	@Override
	boolean endOfGame() {
		if (checkRows() > 0)
			return true;

		if (checkCols() > 0)
			return true;

		if (checkDiags() > 0)
			return true;

		return false;
	}

	@Override
	void printWinner() {

		System.out.println("\nPlayer " + winner + " won the game :D. gg");
	}

}
