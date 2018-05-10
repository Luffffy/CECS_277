import java.io.*;
import java.util.*;
//ok this is daf but sets can't contain duplicates so when you find a word it's going to return 1 
public class alice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner inChoice = new Scanner(System.in);
		File Alice = new File("Alice.txt");
		FileReader fr = new FileReader(Alice);
		BufferedReader br = new BufferedReader(fr);
		String line;
		System.out.print("TreeSet(1) or HashSet(2)");
		int choice = inChoice.nextInt();
		while(choice != 1 && choice != 2)
		{
			System.out.print("\nEnter in 1 or 2");
			choice = inChoice.nextInt();
		}
		if(choice == 1)/////////////////////////////////////////////////////////////////////
		{
			Date today = new Date();
			long time1, time2;
			time1=System.currentTimeMillis();
			////////////////////////////////////////////////////////////
			//insert code here
			Set<String> tree = new TreeSet<String>();
			Scanner in = new Scanner(Alice);
			while (in.hasNextLine()) {
			    Scanner in2 = new Scanner(in.nextLine());
			    while(in2.hasNext())
			    {
			    	String s = in2.next();
			    	tree.add(s);
			    	
			    }
			}
						
			////////////////////////////////////////////////////////////
			time2=System.currentTimeMillis();
			System.out.println("Time for the adding into a TreeSet is: " + (time2-time1));
			
			Scanner inWord = new Scanner(System.in);
			System.out.println("Enter a word to find: ");
			String word = inWord.next();
			time1=System.nanoTime();
			////////////////////////////////////////////////////////////
			//insert code here
			
			int wordCount = 0;
			Iterator<String> iterTree = tree.iterator();
			while(iterTree.hasNext())
			{
				//System.out.print(iterTree.next() + " ");
				
				if(iterTree.next().equals(word))
				{
					wordCount++;
				}
				
			}
			
			////////////////////////////////////////////////////////////
			time2=System.nanoTime();
			System.out.println("Word Count for \"" + word + "\" is: " + wordCount);
			System.out.println("Time for finding this word is: " + (time2-time1));
		}
		else if(choice ==2)///////////////////////////////////////////////////////////////////
		{
			Date today = new Date();
			long time1, time2;
			time1=System.currentTimeMillis();
			////////////////////////////////////////////////////////////
			//insert code here
			Set<String> hash = new HashSet<String>();
			Scanner in = new Scanner(Alice);
			while (in.hasNextLine()) {
			    Scanner in2 = new Scanner(in.nextLine());
			    while(in2.hasNext())
			    {
			    	String s = in2.next();
			    	hash.add(s);
			    	
			    }
			}
						
			////////////////////////////////////////////////////////////
			time2=System.currentTimeMillis();
			System.out.println("Time for the adding into a HashSet is: " + (time2-time1));
			
			Scanner inWord = new Scanner(System.in);
			System.out.println("Enter a word to find: ");
			String word = inWord.next();
			time1=System.nanoTime();
			////////////////////////////////////////////////////////////
			//insert code here
			
			int wordCount = 0;
			Iterator<String> iterHash = hash.iterator();
			while(iterHash.hasNext())
			{
				if(iterHash.next().equals(word))
				{
					wordCount++;
				}
			}
			
			////////////////////////////////////////////////////////////
			time2=System.nanoTime();
			System.out.println("Word Count for \"" + word + "\" is: " + wordCount);
			System.out.println("Time for finding this word is: " + (time2-time1));
		}
		
	}

}
