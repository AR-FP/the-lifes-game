package theLifesGame;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class presents a program that emulates 
 * "The Life's Game".
 * 
 * @author Alexis Nikolás Rodríguez de Aysa
 */

public class Main {

	/**
	 * pre:---
	 * post: This method allocates the cells 
	 * 		 randomly.
	 */
	public static int ranNum() {
		double random = Math.random();
		if (random > 0.2) {
			return 0;
		} else {
			return 1;
		}
	}

	/**
	 * pre:---
	 * post: Here is presented 
	 * 		 the options's menu and 
	 * 		 the first generation's board.
	 */

	public static void menu() {
		System.out.println
		("· o o · o · · · "
				+ "· · · · ·");
		System.out.println
		("o · · · · o · · "
				+ "· o · · ·");
		System.out.println
		("· o//=== ====== "
				+ "====\\\\· ·");
		System.out.println
		("· o||THE LIFE'S "
				+ "GAME||o ·");
		System.out.println
		("· ·\\\\=== ====== "
				+ "====//· ·");
		System.out.println
		("· o · o o · · · · "
				+ "· o · ·");
		System.out.println
		("· · · o o · · · o "
				+ "· · · ·");
		System.out.println();
		System.out.println();
		System.out.println
		("//¨¨¨¨¨¨¨¨¨¨¨¨¨ "
				+ "¨¨¨¨¨¨¨¨¨ "
				+ "¨¨¨¨\\\\");
		System.out.println
		("||Configuration "
				+ "options's "
				+ "menu||");
		System.out.println
		("||------------- "
				+ "--------- "
				+ "----||");
		System.out.println
		("\\\\_____________ "
				+ "_________ "
				+ "____//");
		System.out.println();
		System.out.println();
		System.out.println
		("//====== === "
				+ "====== ==== "
				+ "========== === == === "
				+ "======= ========= == "
				+ "=== === ==== ===== === "
				+ "== === ====\\\\");
		System.out.println
		("||Insert the option that "
				+ "introduces you at the "
				+ "''Pilot Project'' "
				+ "or the one that leads you "
				+ "to the game||");
		System.out.println
		("\\\\====== === "
				+ "====== ==== "
				+ "========== === == === "
				+ "======= ========= == "
				+ "=== === ==== ===== === "
				+ "== === ====//");
		System.out.println();
		System.out.println
		("Enter the desired option "
				+ "selected by the user: "
				+ "\nFirst option ==)> "
				+ "Enter all data "
				+ "previously needed "
				+ "\nto start: "
				+ "\nSecond option ==)> "
				+ "Enter all data "
				+ "previously needed "
				+ "\nfor testing with the "
				+ "Pilot Project: ");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		if (option == 1) {
			System.out.println();
			System.out.println
			("//====== === "
					+ "=== ======== "
					+ "==== ==== ======= ==== "
					+ "=========\\\\");
			System.out.println
			("||Select the row quantity "
					+ "that will compose your "
					+ "gameboard||");
			System.out.println
			("\\\\====== === "
					+ "=== ======== "
					+ "==== ==== ======= ==== "
					+ "=========//");
			System.out.println();
			System.out.print
			("Enter the quantity of rows "
					+ "that have to be filled "
					+ "(at the most) "
					+ "\nat the gameboard "
					+ "==)> ");
			int rowNum = sc.nextInt();
			while (rowNum < 0) {
				System.out.println();
				System.out.println
				("//====== "
						+ "=== === "
						+ "======== ==== ==== "
						+ "======= ==== "
						+ "=========\\\\");
				System.out.println
				("||Select the row "
						+ "quantity that "
						+ "will compose "
						+ "your gameboard||");
				System.out.println
				("\\\\====== "
						+ "=== === "
						+ "======== ==== ==== "
						+ "======= ==== "
						+ "=========//");
				System.out.println();
				System.out.print
				("Enter the quantity of "
						+ "rows that have "
						+ "to be filled "
						+ "(at the most) "
						+ "\nat the gameboard "
						+ "==)> ");
				rowNum = sc.nextInt();
			}
			System.out.println();
			System.out.println
			("//====== "
					+ "=== ====== "
					+ "======== ==== ==== "
					+ "======= ==== "
					+ "=========\\\\");
			System.out.println
			("||Select the column "
					+ "quantity "
					+ "that will compose your "
					+ "gameboard||");
			System.out.println("\\\\====== "
					+ "=== ====== "
					+ "======== ==== ==== "
					+ "======= ==== "
					+ "=========//");
			System.out.println();
			System.out.print
			("Enter the quantity of "
					+ "columns that "
					+ "have to be filled "
					+ "(at the most) "
					+ "\nat the gameboard "
					+ "==)> ");
			int columnNum = sc.nextInt();
			while (columnNum < 0) {
				System.out.println();
				System.out.println
				("//====== "
						+ "=== ====== "
						+ "======== ==== ==== "
						+ "======= ==== "
						+ "=========\\\\");
				System.out.println
				("||Select the column "
						+ "quantity that "
						+ "will compose your "
						+ "gameboard||");
				System.out.println
				("\\\\====== "
						+ "=== ====== "
						+ "======== ==== ==== "
						+ "======= ==== "
						+ "=========//");
				System.out.println();
				System.out.print
				("Enter the quantity of "
						+ "columns that "
						+ "have to be filled "
						+ "(at the most) "
						+ "\nat the gameboard "
						+ "==)> ");
				columnNum = sc.nextInt();
			}
			System.out.println();
			System.out.println
			("//====== === "
					+ "============= "
					+ "======== ==== ==== "
					+ "== ==== ====== "
					+ "=== ====== =====\\\\");
			System.out.println
			("||Select the generations's "
					+ "quantity that need "
					+ "to pass untill "
					+ "the game's pause||");
			System.out.println
			("\\\\====== === "
					+ "============="
					+ " ======== ==== ==== "
					+ "== ==== ====== "
					+ "=== ====== =====//");
			System.out.println();
			System.out.print
			("Insert the quantity of "
					+ "generations "
					+ "that will contain the "
					+ "game ==)> ");
			// Quantity of generations.
			int genNum = sc.nextInt();
			while (genNum <= 0) {
				System.out.println();
				System.out.println
				("//====== === "
						+ "============= "
						+ "======== ==== ==== "
						+ "== ==== ====== "
						+ "=== ====== ====="
						+ "\\\\");
				System.out.println
				("||Select the "
						+ "generations's "
						+ "quantity that need "
						+ "to pass untill "
						+ "the game's pause"
						+ "||");
				System.out.println
				("\\\\====== === "
						+ "============= "
						+ "======== ==== ==== "
						+ "== ==== ====== "
						+ "=== ====== ====="
						+ "//");
				System.out.println();
				System.out.print
				("Insert the quantity of "
						+ "generations that "
						+ "will contain "
						+ "the game ==)> ");
				genNum = sc.nextInt();
			}
			// Game board.
			int[][] gen = new int[rowNum]
					[columnNum];
			// Quantity of alive cells.
			int lifeCell = 0;
			for (int i = 0; i < 
					gen.length; i++) {
				for (int j = 0; j < 
						gen[i].length; j++) {
					gen[i][j] = ranNum();
					if (gen[i][j] == 0) {
						System.out.print
						("· ");
					} else {
						System.out.print
						("o ");
						lifeCell++;
					}
				}
				System.out.println();
			}
			System.out.println
			("The generation shown in console "
					+ "belongs to ==)> "
					+ "the first of them.");
			System.out.println
			("--- ---------- ----- "
					+ "-- ------- ------- "
					+ "--      "
					+ "=== ===== == =====");
			System.out.println
			("The living cells that "
					+ "remain in the first "
					+ "generation are ==)> " 
					+ lifeCell);
			System.out.println
			("--- ------ ----- ---- ------ -- "
					+ "--- ----- ---------- "
					+ "---      ===");
			System.out.println
			("================="
					+ "====================="
					+ "=====================");
			System.out.println
			("================"
					+ "======================"
					+ "=====================");
			nextGen(gen, genNum, lifeCell, 
					rowNum, columnNum);
		} else if (option == 2) {
			System.out.println();
			System.out.println();
			System.out.println
			("//  ¨¨¨¨¨ ¨¨¨¨¨¨¨"
					+ "   ¨¨¨¨¨¨¨¨¨\\\\");
			System.out.println
			("||''Pilot Project"
					+ "'' Selection||");
			System.out.println
			("||  ----- -------"
					+ "   ---------||");
			System.out.println
			("\\\\  ____  _______"
					+ "   ________//");
			System.out.println();
			System.out.println();
			System.out.println
			("Type the pertaining cypher "
					+ "to the testing program "
					+ "you wish to analize: "
					+ "\nPilot Project "
					+ "Number 1 ==)> "
					+ "\nPilot Project "
					+ "Number 2 ==)> "
					+ "\nPilot Project "
					+ "Number 3 ==)> ");
			int opcion2 = sc.nextInt();
			pilotProg(opcion2);
		} else {
			menu();
		} sc.close();
	}

	/**
	 * pre: We send the previous variables 
	 * 		for upgrading them.
	 * post: This method creates 
	 * 		 the next generations.
	 */
	public static void nextGen
	(int gen[][], int genNum, int lifeCell, 
			int rowNum, int columnNum) {
		/*
		 * numGen: 
		 * The next generations's boards.
		 */
		for (int numGen = 1; numGen 
				< genNum; numGen++) {
			// nextGen: The next generations.
			int[][] nextGen = 
					new int[rowNum]
							[columnNum];
			for (int i = 1; i < 
					rowNum - 1; i++) {
				for (int j = 1; j < 
						columnNum - 1; j++) {
					/*
					 * The cells beside any 
					 * other.
					 */
					int neighbours = 0;
					for (int k = -1; k <=
							1; k++) {
						for (int x = -1; x <=
								1; x++) {
							neighbours += 
									gen[i + k]
									[j + x];
						}
					}
					neighbours -= gen[i][j];
					if ((gen[i][j] == 1) 
							&& 
							neighbours < 2) {
						nextGen[i][j] = 0;
					} else if ((gen[i][j] == 1)
							&& 
							neighbours > 3) {
						nextGen[i][j] = 0;
					} else if ((gen[i][j] == 0)
							&& 
							neighbours == 3) {
						nextGen[i][j] = 1;
					} else {
						nextGen[i][j] = 
								gen[i][j];
					}
				}
			}
			ArrayList<Threesome> data = 
					new ArrayList<>();
			/*
			 * The living cells 
			 * on each generation.
			 */
			int life = 0;
			for (int i = 0; i < 
					rowNum; i++) {
				for (int j = 0; j < 
						columnNum; j++) {
					if (nextGen[i][j] == 1) {
						life++;
					}
				}
			}
			int newCell = 0;
			if (life - lifeCell > 0) {
				newCell = life - lifeCell;
			} else {
				newCell = 0;
			}
			Threesome tri = new Threesome
					(numGen + 1, 
							life, newCell);
			data.add(tri);
			if (lifeCell == 0) {
				System.out.println
				("The remaining cell colony "
						+ "has vanished.");
				menu();
			} System.out.println
			("Next Generation: ");
			for (int i = 0; i < 
					rowNum; i++) {
				for (int j = 0; j < 
						columnNum; j++) {
					if (nextGen[i][j] == 1) {
						System.out.print
						("o ");
					} else {
						System.out.print
						("· ");
					}
				} System.out.println();
			} System.out.println
			(tri.toString());
			System.out.println
			("========================"
					+ "==================="
					+ "==================="
					+ "=============="
					+ "========");
			lifeCell = life;
			gen = nextGen;
		} menu();
	}

	/**
	 * pre: We send the option number 
	 * 		as parameter.
	 * post: This method creates 
	 * 		 the option's menu 
	 * 		 for the testing programs.
	 */
	public static void pilotProg
	(int option) {
		int lifeCell = 0;
		if (option == 1) {
			System.out.println();
			System.out.println();
			System.out.println
			("//  ¨¨¨¨¨¨¨¨¨¨¨¨¨"
					+ "   ¨¨¨¨¨¨ ¨\\\\");
			System.out.println
			("||''Pilot Project"
					+ "'' Number 1||");
			System.out.println
			("||  ----- -------"
					+ "   ------ =||");
			System.out.println
			("\\\\  _____ _______"
					+ "   ______ _//");
			System.out.println();
			System.out.println();
			int[][] gen = new int[4][4];
			int genNum = 30;
			for (int i = 0; i < 
					gen.length; i++) {
				for (int j = 0; j < 
						gen[i].length; j++) {
					gen[i][j] = 0;
				}
			} gen[1][1] = 1;
			gen[1][2] = 1;
			gen[2][1] = 1;
			gen[2][2] = 1;

			/*
			 * Another useful sentence for 
			 * allocating the cells 
			 * on the game board:
			 */

			//gen[0][0] = 0;
			//gen[0][1] = 0;
			//gen[0][2] = 0;
			//gen[0][3] = 0;
			//
			//gen[1][0] = 0;
			//gen[1][1] = 1;
			//gen[1][2] = 1;
			//gen[1][3] = 0;
			//
			//gen[2][0] = 0;
			//gen[2][1] = 1;
			//gen[2][2] = 1;
			//gen[2][3] = 0;
			//
			//gen[3][0] = 0;
			//gen[3][1] = 0;
			//gen[3][2] = 0;
			//gen[3][3] = 0;

			for (int k = 0; k < 
					gen.length; k++) {
				for (int x = 0; x < 
						gen[k].length; x++) {
					if (gen[k][x] == 0) {
						System.out.print
						("· ");
					} else {
						System.out.print
						("o ");
						lifeCell++;
					}
				} System.out.println();
			} nextGen(gen, genNum, 
					lifeCell, 4, 4);
			menu();
		} else if (option == 2) {
			System.out.println();
			System.out.println();
			System.out.println
			("//  ¨¨¨¨¨¨¨¨¨¨¨¨¨"
					+ "   ¨¨¨¨¨¨ ¨\\\\");
			System.out.println
			("||''Pilot Project"
					+ "'' Number 2||");
			System.out.println
			("||  ----- -------"
					+ "   ------ =||");
			System.out.println
			("\\\\  _____ _______"
					+ "   ______ _//");
			System.out.println();
			System.out.println();
			int[][] gen = new int[5][5];
			int genNum = 30;
			for (int i = 0; i < 
					gen.length; i++) {
				for (int j = 0; j < 
						gen[i].length; j++) {
					gen[i][j] = 0;
				}
			} gen[2][1] = 1;
			gen[2][2] = 1;
			gen[2][3] = 1;

			/*
			 * Another useful sentence 
			 * for allocating the cells 
			 * on the game board:
			 */
			
			//gen[0][0] = 0;
			//gen[0][1] = 0;
			//gen[0][2] = 0;
			//gen[0][3] = 0;
			//gen[0][4] = 0;
			//
			//gen[1][0] = 0;
			//gen[1][1] = 0;
			//gen[1][2] = 0;
			//gen[1][3] = 0;
			//gen[1][4] = 0;
			//
			//gen[2][0] = 0;
			//gen[2][1] = 1;
			//gen[2][2] = 1;
			//gen[2][3] = 1;
			//gen[2][4] = 0;
			//
			//gen[3][0] = 0;
			//gen[3][1] = 0;
			//gen[3][2] = 0;
			//gen[3][3] = 0;
			//gen[3][4] = 0;
			//
			//gen[4][0] = 0;
			//gen[4][1] = 0;
			//gen[4][2] = 0;
			//gen[4][3] = 0;
			//gen[4][4] = 0;

			for (int k = 0; k < 
					gen.length; k++) {
				for (int x = 0; x < 
						gen[k].length; x++) {
					if (gen[k][x] == 0) {
						System.out.print
						("· ");
					} else {
						System.out.print
						("o ");
						lifeCell++;
					}
				} System.out.println();
			} nextGen(gen, genNum, 
					lifeCell, 5, 5);
			menu();
		} else if (option == 3) {
			System.out.println();
			System.out.println();
			System.out.println
			("//  ¨¨¨¨¨ ¨¨¨¨¨¨¨"
					+ "   ¨¨¨¨¨¨ ¨\\\\");
			System.out.println
			("||''Pilot Project"
					+ "'' Number 3||");
			System.out.println
			("||  ----- -------"
					+ "   ------ =||");
			System.out.println
			("\\\\  _____ _______"
					+ "   ______ _//");
			System.out.println();
			System.out.println();
			int[][] gen = new int[6][6];
			int genNum = 30;
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					gen[i][j] = 0;
				}
			} gen[1][1] = 1;
			gen[1][2] = 1;
			gen[2][1] = 1;
			gen[2][2] = 1;
			gen[3][3] = 1;
			gen[3][4] = 1;
			gen[4][3] = 1;
			gen[4][4] = 1;

			/*
			 * Another useful sentence 
			 * for allocating the cells 
			 * on the game board:
			 */
			
			//gen[0][0] = 0;
			//gen[0][1] = 0;
			//gen[0][2] = 0;
			//gen[0][3] = 0;
			//gen[0][4] = 0;
			//gen[0][5] = 0;
			//
			//gen[1][0] = 0;
			//gen[1][1] = 1;
			//gen[1][2] = 1;
			//gen[1][3] = 0;
			//gen[1][4] = 0;
			//gen[1][5] = 0;
			//
			//gen[2][0] = 0;
			//gen[2][1] = 1;
			//gen[2][2] = 1;
			//gen[2][3] = 0;
			//gen[2][4] = 0;
			//gen[2][5] = 0;
			//
			//gen[3][0] = 0;
			//gen[3][1] = 0;
			//gen[3][2] = 0;
			//gen[3][3] = 1;
			//gen[3][4] = 1;
			//gen[3][5] = 0;
			//
			//gen[4][0] = 0;
			//gen[4][1] = 0;
			//gen[4][2] = 0;
			//gen[4][3] = 1;
			//gen[4][4] = 1;
			//gen[4][5] = 0;
			//
			//gen[5][0] = 0;
			//gen[5][1] = 0;
			//gen[5][2] = 0;
			//gen[5][3] = 0;
			//gen[5][4] = 0;
			//gen[5][5] = 0;

			for (int k = 0; k < 6; k++) {
				for (int x = 0; x < 6; x++) {
					if (gen[k][x] == 0) {
						System.out.print
						("· ");
					} else {
						System.out.print
						("o ");
						lifeCell++;
					}
				} System.out.println();
			} nextGen(gen, genNum, 
					lifeCell, 6, 6);
			menu();
		} else {
			menu();
		}
	}

	/**
	 * pre:---
	 * post: We call the "menu" method.
	 */
	public static void main(String[] args) {
		menu();
	}
}