import java.io.*;
import java.util.*;

public class ScavengerHunt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			Scanner inChoice = new Scanner(System.in);
			File items = new File("Items.txt");
			System.out.print("ArrayList(1) or LinkedList(2)");
			int choice = inChoice.nextInt();
			while(choice != 1 && choice != 2)
			{
				System.out.print("\nEnter in 1 or 2");
				choice = inChoice.nextInt();
			}
			if(choice == 1)
			{
				Date today = new Date();
				long time1, time2;
							
				ArrayList<String> arr = new ArrayList<String>();
				Scanner in = new Scanner(items);
				while (in.hasNextLine()) {
				    Scanner in2 = new Scanner(in.nextLine());
				    while(in2.hasNext())
				    {
				    	String s = in2.next();
				    	arr.add(s);
				    	
				    }
				}
				
				
				time1=System.nanoTime();
				////////////////////////////////////////////////////////////
				//iterating through twice
				ListIterator<String> iter = arr.listIterator();
				while(iter.hasNext())
				{
					//iter.next();
					System.out.print(iter.next() + " | ");
				}
				iter = arr.listIterator(arr.size());
				System.out.print("\n");
				while(iter.hasPrevious())
				{
					//iter.previous();
					System.out.print(iter.previous() + " | ");
				}
				
				////////////////////////////////////////////////////////////
				time2=System.nanoTime();
				System.out.println("\nTime for iterating front to end and end to front in an ArrayList is: " + (time2-time1));
				
				
				System.out.println("How many teams are competing?");
				
				Scanner input = new Scanner(System.in);
				int teamSize = input.nextInt();
				List<List<String>> teams = new ArrayList<List<String>>();
				for(int i = 0; i < teamSize; i++)
				{
					List<String> list = new ArrayList<String>();
					teams.add(list);
				}
				
				time1=System.nanoTime();
				////////////////////////////////////////////////////////////
				//adding into teams
				for(int i = 0; i <teams.size(); i++)
				{
					ArrayList<String> arr2 = new ArrayList<String>(arr);
					
					while(arr2.size()>0)
					{
						teams.get(i).add(arr2.remove(0));
						Collections.shuffle(arr2);
						//System.out.println(arr2);
					}
					
				}
				////////////////////////////////////////////////////////////
				System.out.println(teams);
				time2=System.nanoTime();
				System.out.println("Time for adding into " + teamSize + " teams:  " + (time2-time1));
				
				
				System.out.println("What Index do you want to view? (1-100)");
				int spot = input.nextInt();
				while(spot<1 && spot >100)
				{
					System.out.println("Enter a number between (1-100)");
					spot = input.nextInt();
				}
				time1=System.nanoTime();
				////////////////////////////////////////////////////////////
				//retrieving an item at in a team's certain slot
				for(int i = 0; i <teams.size(); i++)
				{
					System.out.println("Team " + (i+1) + ": " + teams.get(i).get(spot-1));
				}
				////////////////////////////////////////////////////////////
				time2=System.nanoTime();
				System.out.println("Time for retrieving an item at location "+ spot + " in an ArrayList is:  " + (time2-time1));
				
				
				
				time1=System.nanoTime();
				////////////////////////////////////////////////////////////
				//adding an item at in a team's certain slot
				for(int i = 0; i <teams.size(); i++)
				{
					//System.out.println("Team " + i + ": " + teams.get(i).get(spot));
					teams.get(i).add(spot, "newItem");
				}
				////////////////////////////////////////////////////////////
				time2=System.nanoTime();
				System.out.println("Time for adding a new item at location "+ spot + " in an ArrayList is:  " + (time2-time1));
				
				
				time1=System.nanoTime();
				////////////////////////////////////////////////////////////
				//adding an item at in a team's random slot
				Random rand = new Random();
				int randNum = rand.nextInt((99-0) + 1) + 0;
				
				for(int i = 0; i <teams.size(); i++)
				{
					System.out.println("Team " + (i+1) + ": " + teams.get(i).get(randNum));
				}
				////////////////////////////////////////////////////////////
				time2=System.nanoTime();
				System.out.println("Time for retreiving a random item at location "+ randNum + " in an ArrayList is:  " + (time2-time1));
				
			}
			else if(choice ==2)
			{
				Date today = new Date();
				long time1, time2;
				
				LinkedList<String> link = new LinkedList<String>();
				Scanner in = new Scanner(items);
				while (in.hasNextLine()) {
				    Scanner in2 = new Scanner(in.nextLine());
				    while(in2.hasNext())
				    {
				    	String s = in2.next();
				    	link.add(s);
				    	
				    }
				}
				
				

				time1=System.nanoTime();
				////////////////////////////////////////////////////////////
				//iterating through twice
				ListIterator<String> iter = link.listIterator();
				while(iter.hasNext())
				{
					//iter.next();
					System.out.print(iter.next() + " | ");
				}
				iter = link.listIterator(link.size());
				System.out.print("\n");
				while(iter.hasPrevious())
				{
					//iter.previous();
					System.out.print(iter.previous() + " | ");
				}
				
				////////////////////////////////////////////////////////////
				time2=System.nanoTime();
				System.out.println("\nTime for iterating front to end and end to front in a LinkedList is: " + (time2-time1));
				
				
				System.out.println("How many teams are competing?");
				
				Scanner input = new Scanner(System.in);
				int teamSize = input.nextInt();
				List<List<String>> teams = new LinkedList<List<String>>();
				for(int i = 0; i < teamSize; i++)
				{
					List<String> list = new LinkedList<String>();
					teams.add(list);
				}
				
				time1=System.nanoTime();
				////////////////////////////////////////////////////////////
				//adding into teams
				for(int i = 0; i <teams.size(); i++)
				{
					LinkedList<String> arr2 = new LinkedList<String>(link);
					
					while(arr2.size()>0)
					{
						teams.get(i).add(arr2.remove(0));
						Collections.shuffle(arr2);
						//System.out.println(arr2);
					}
					
				}
				////////////////////////////////////////////////////////////
				System.out.println(teams);
				time2=System.nanoTime();
				System.out.println("Time for adding into " + teamSize + " teams:  " + (time2-time1));
				
				
				System.out.println("What Index do you want to view? (1-100)");
				int spot = input.nextInt();
				while(spot<1 && spot >100)
				{
					System.out.println("Enter a number between (1-100)");
					spot = input.nextInt();
				}
				time1=System.nanoTime();
				////////////////////////////////////////////////////////////
				//retrieving an item at in a team's certain slot
				for(int i = 0; i <teams.size(); i++)
				{
					System.out.println("Team " + (i+1) + ": " + teams.get(i).get(spot-1));
				}
				////////////////////////////////////////////////////////////
				time2=System.nanoTime();
				System.out.println("Time for retrieving an item at location "+ spot + " in a LinkedList is:  " + (time2-time1));
				
				
				
				time1=System.nanoTime();
				////////////////////////////////////////////////////////////
				//adding an item at in a team's certain slot
				for(int i = 0; i <teams.size(); i++)
				{
					//System.out.println("Team " + i + ": " + teams.get(i).get(spot));
					teams.get(i).add(spot, "newItem");
				}
				////////////////////////////////////////////////////////////
				time2=System.nanoTime();
				System.out.println("Time for adding a new item at location "+ spot + " in a LinkedList is:  " + (time2-time1));
				
				
				time1=System.nanoTime();
				////////////////////////////////////////////////////////////
				//adding an item at in a team's random slot
				Random rand = new Random();
				int randNum = rand.nextInt((99-0) + 1) + 0;
				
				for(int i = 0; i <teams.size(); i++)
				{
					System.out.println("Team " + (i+1) + ": " + teams.get(i).get(randNum));
				}
				////////////////////////////////////////////////////////////
				time2=System.nanoTime();
				System.out.println("Time for retreiving a random item at location "+ randNum + " in a LinkedList is:  " + (time2-time1));
				}
	}

}
