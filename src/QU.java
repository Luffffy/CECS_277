import java.io.*;
import java.util.*;


public class QU {

	public static void main(String[] args) throws IOException {
		Scanner inChoice = new Scanner(System.in);
		File QU = new File("QnotfollowedbyU.txt");
		////////////////////////////putting points into a map
		File points = new File("Scrabble_Values.txt");
		Map <Character, Integer> SP = new HashMap<Character, Integer>();
		Scanner inPoint = new Scanner(points);
		while (inPoint.hasNextLine()) {
		    Scanner in2 = new Scanner(inPoint.nextLine());
		    while(in2.hasNext())
		    {
		    	char c = in2.next().charAt(0);
		    	int n = in2.nextInt();
		    	SP.put(c,n);
		    }
		}
		//System.out.print(SP);
		//////////////////////////////////////////////////////////
		System.out.print("TreeMap(1) or HashMap(2)");
		int choice = inChoice.nextInt();
		while(choice != 1 && choice != 2)
		{
			System.out.print("\nEnter in 1 or 2");
			choice = inChoice.nextInt();
		}
		if(choice == 1)///////////////////////////////////////////////////////////////////////////////////////
		{
			Date today = new Date();
			long time1, time2;
			time1=System.nanoTime();
			////////////////////////////////////////////////////////////
			//adding into tree map
			TreeMap<String,Integer> tree = new TreeMap<String,Integer>();
			Scanner in = new Scanner(QU);
			while (in.hasNextLine()) {
			    Scanner in2 = new Scanner(in.nextLine());
			    while(in2.hasNext())
			    {
			    	String s = in2.next();
			    	tree.put(s,0);
			    }
			}
			
			////////////////////////////////////////////////////////////
			System.out.println(tree);
			time2=System.nanoTime();
			System.out.println("Time for the adding into a TreeMap is: " + (time2-time1));
			
			time1=System.nanoTime();
			////////////////////////////////////////////////////////////
			//scrabble point finding
			for(String key : tree.keySet())
			{
				String s = key; 
				//System.out.println(s);
				int total = 0;
				for(int i = 0; i < s.length(); i++)
				{
					char c = s.charAt(i);
					int p = SP.get(c);
					//System.out.println(p);
					total += p;
				}
				tree.put(key, total);
			}
			
			
			////////////////////////////////////////////////////////////
			System.out.println(tree);
			time2=System.nanoTime();
			System.out.println("Time for assigning point values is: " + (time2-time1));
		}
		else if(choice ==2)///////////////////////////////////////////////////////////////////////////////////////
		{
			Date today = new Date();
			long time1, time2;
			time1=System.nanoTime();
			////////////////////////////////////////////////////////////
			//adding into hash map
			HashMap<String,Integer> hash = new HashMap<String, Integer>();
			Scanner in = new Scanner(QU);
			while (in.hasNextLine()) {
			    Scanner in2 = new Scanner(in.nextLine());
			    while(in2.hasNext())
			    {
			    	String s = in2.next();
			    	hash.put(s,0);
			    }
			}
			////////////////////////////////////////////////////////////
			System.out.println(hash);
			time2=System.nanoTime();
			System.out.println("Time for the adding into a HashMap is: " + (time2-time1));
			
			time1=System.nanoTime();
			////////////////////////////////////////////////////////////
			//scrabble point finding
			for(String key : hash.keySet())
			{
				String s = key; 
				//System.out.println(s);
				int total = 0;
				for(int i = 0; i < s.length(); i++)
				{
					char c = s.charAt(i);
					int p = SP.get(c);
					//System.out.println(p);
					total += p;
				}
				hash.put(key, total);
			}
			////////////////////////////////////////////////////////////
			System.out.println(hash);
			time2=System.nanoTime();
			System.out.println("Time for assigning point values is: " + (time2-time1));
		}
	}

}
