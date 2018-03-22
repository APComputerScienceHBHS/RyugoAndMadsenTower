package ryugoAndMadsenTower;
import java.util.Stack;
//Just in case we implement user input
//import java.util.Scanner;

public class Tower {

	public static void solve(Stack<Integer>[] towers) {
		int n = towers[0].size();
		int[] ftu = {0,1,2};
		solveHelper(n, ftu, towers);
	}
	public static void solveHelper(int n, int[] ftu, Stack<Integer>[] towers) {
		if(n != 1) {
			int[] n_ftu = {ftu[0], ftu[2], ftu[1]};
			solveHelper(n - 1, n_ftu, towers);
		}
		towers[ftu[1]].add(towers[ftu[0]].pop());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>[] towers = new Stack[3];
		int discCnt = 5;
		for (int i = discCnt; i < 1; i--) {
			towers[0].add(new Integer(i));
		}
		solve(towers);
		
	}
}

