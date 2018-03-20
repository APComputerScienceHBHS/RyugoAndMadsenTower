package ryugoAndMadsenTower;
import java.util.Scanner;

public class Tower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String f = new String("From");
		String t = new String("To");
		String u = new String("Using");
		int n = 5;
		
		
		if(n == 1) {
			f = t;
		}
		else if(n > 1) {
			
		}
		
		}
	private int hanoi(int n, String f, String t, String u)
    {
        if(n == 1)
        {
            return f = t;
        }
        return hanoi(n-1, f, t, u);
    }
	}


