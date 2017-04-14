/**@Program to build any collection containing duplicates.
 *Create its copy with all duplicates removed.*/

/**@Import util package*/
import java.util.*;

/** @Creat a copy class */
public class Copy {
	/** @Main mehtod */
	public static void main(String[] args) {
		/** @Creating an array list of student */
		ArrayList<String> n = new ArrayList<String>();
		System.out.println("The names of student in class:\t");
		/** @Adding the nammes with duplicate value */
		n.add("Osama");
		n.add("Saquib");
		n.add("Huzaifa");
		n.add("Tarique");
		n.add("Sharique");
		n.add("Al Badar");
		/** @Iterator for keeping the pointer on array */
		Iterator it = n.iterator();
		/** @Checking next element */
		while (it.hasNext()) {
			// printing the next element
			System.out.println(it.next());
		}
		System.out.println("");

		/** @Hashset removes duplicate value */
		HashSet<String> m = new HashSet<String>();
		System.out.println("Removing duplicate names:");
		/** @Adding multiple value having duplicate value */
		m.add("Osama");
		m.add("Saquib");
		m.add("Huzaifa");
		m.add("Tarique");
		m.add("Sharique");
		m.add("Al Badar");
		/** @Maintaing the reference */
		Iterator its = m.iterator();
		while (its.hasNext()) {
			/** @Printing the next element in HashSet */
			System.out.println(its.next());
		}
	}
}