import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;


public class QU {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("TreeMap(1) or HashMap(2)");
		int choice = in.nextInt();
		while(choice != 1 || choice != 2)
		{
			System.out.print("\nEnter in 1 or 2");
			choice = in.nextInt();
		}
		if(choice == 1)
		{
			TreeMap<String,Integer> tree = new TreeMap<String,Integer>();
		}
		else if(choice ==2)
		{
			HashMap<String,Intger> hash = new HashMap<String, Integer>();
		}
	}

}
