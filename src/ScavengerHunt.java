import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
public class ScavengerHunt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			System.out.print("ArrayList(1) or LinkedList(2)");
			int choice = in.nextInt();
			while(choice != 1 || choice != 2)
			{
				System.out.print("\nEnter in 1 or 2");
				choice = in.nextInt();
			}
			if(choice == 1)
			{
				ArrayList<String> arr = new ArrayList<String>();
				
			}
			else if(choice ==2)
			{
				LinkedList<String> link = new LinkedList<String>();
			}
	}

}
