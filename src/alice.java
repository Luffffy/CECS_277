import java.util.Scanner;
import java.util.TreeSet;
import java.util.HashSet;

public class alice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("TreeSet(1) or HashSet(2)");
		int choice = in.nextInt();
		while(choice != 1 || choice != 2)
		{
			System.out.print("\nEnter in 1 or 2");
			choice = in.nextInt();
		}
		if(choice == 1)
		{
			TreeSet<String> tree = new TreeSet<String>();
		}
		else if(choice ==2)
		{
			HashSet<String> hash = new HashSet<String>();
		}
	}

}
