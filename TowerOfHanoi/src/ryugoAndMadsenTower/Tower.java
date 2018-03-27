package ryugoAndMadsenTower;
import java.util.Stack;
import java.util.Scanner;
//Nick Madsen and Ryugo Okada
//
public class Tower {

	public static void main(String[] args) {
		Stack[] towers = {			//Uses Stack to match restrictions set by problem
				new Stack<Integer>(),
				new Stack<Integer>(), 
				new Stack<Integer>()
		};
		int discCnt = 6; //checkInput(scan);
		for (int i = discCnt; i > 0; i--) {
			towers[0].add(new Integer(i));
		}
		towersDraw(towers);
		solve(towers);
	}
	/*private static int checkInput() {
		Scanner scan = new Scanner(System.in);
		boolean is_safe = false;
		int out = 0;
		while (!is_safe) {
			try {
				out = scan.nextInt();
			}
			catch(Exception e) {
				System.out.println("Please input an integer!");
				is_safe = false;
			}
		}
			return out;
		}*/
		private static void solve(Stack<Integer>[] towers) {
			int n = towers[0].size();
			int[] ftu = {0,1,2};
			solveHelper(n, ftu, towers);
			//calls solveHelper method to solve towers
		}
		private static void solveHelper(int n, int[] ftu, Stack<Integer>[] towers) {
			if(n > 1) {
				int[] fut = {ftu[0], ftu[2], ftu[1]};
				solveHelper(n - 1, fut, towers);
			}
			towers[ftu[1]].add(towers[ftu[0]].pop());
			towersDraw(towers);
			if(n>1) {
				int[] utf = {ftu[2], ftu[1], ftu[0]};
				solveHelper(n - 1, utf, towers);
			}
			/*
			Recursive method that checks how many discs in a stack and if more than one,
			it moves the top disc to the next Stack. It then draws the tower using
			the method towersDraw. 
			*/
		}
		private static void towerDraw(Stack<Integer> tower, String name) {
			Integer[] a = new Integer[tower.size()];
			System.out.print(name + ": ");
			tower.toArray(a);
			for(Integer n : a) {
				System.out.print(n);
			}
			System.out.println();
		}
		private static void towersDraw(Stack<Integer>[] towers) {
			System.out.println();
			towerDraw(towers[0], "A");
			towerDraw(towers[2], "B");
			towerDraw(towers[1], "C");
			System.out.println();
		}
	}