import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.*;

public class CitySim9002Test {
	//test if the readseed() method read an int input.
	//input 5
	@Test
	public void testseed() {
		CitySim9002 cs=Mockito.mock(CitySim9002.class);
		cs.readseed();
		int n=cs.seed;
		assertEquals(n,5);
		
		//fail("Not yet implemented");
	}
	
//	@Test
//	public void testDeleteFrontOneItem() {
//
//		LinkedList<Integer> ll = new LinkedList<Integer>(); 
//		ll.addToFront(Mockito.mock(Node.class));
//		ll.deleteFront();
//		assertEquals(ll.getFront(), null);
//		}


	
	
	
//test if the random() method generate an int from 1 to 4
	@Test
	public void testrandom4() {
		CitySim9002 cs=Mockito.mock(CitySim9002.class);
		int n= cs.random4();
		assertFalse(n<1||n>4);
	}
//test if the random() method generate an int from 1 to 4
	@Test
	public void testrandom5() {
		CitySim9002 cs=Mockito.mock(CitySim9002.class);
		int n= cs.random5();
		assertFalse(n<1||n>5);
	}	
//test if the visitors work
	//test if input 1 output a String "a Student"
	@Test
	public void testvisitors1() {
		CitySim9002 cs=Mockito.mock(CitySim9002.class);
		String p= cs.visitors(1);
		assertEquals(p,"a Student");
	}
	//test if the visitors work
	//test if input 2 output a String "a Professor"
	@Test
	public void testvisitors2() {
		CitySim9002 cs=Mockito.mock(CitySim9002.class);
		String p= cs.visitors(2);
		assertEquals(p,"a Professor");
	}
	//test if the visitors work
	//test if input 3 output a String "a Business Person"
	@Test
	public void testvisitors3() {
		CitySim9002 cs=Mockito.mock(CitySim9002.class);
		String p= cs.visitors(3);
		assertEquals(p,"a Business Person");
	}
	//test if the visitors work
	//test if input 4 output a String "a Blogger"
	@Test
	public void testvisitors4() {
		CitySim9002 cs=Mockito.mock(CitySim9002.class);
		String p= cs.visitors(4);
		assertEquals(p,"a Blogger");
	}
	
//test if the locations work
	//test if input 2 output a String "Squirrel Hill"
	@Test
	public void testlocations1() {
		CitySim9002 cs=Mockito.mock(CitySim9002.class);
		String l= cs.locations(1);
		assertEquals(l,"Squirrel Hill");
	}
	//test if the locations work
	//test if input 2 output a String "Downtown"
	@Test
	public void testlocations2() {
		CitySim9002 cs=Mockito.mock(CitySim9002.class);
		String l= cs.locations(2);
		assertEquals(l,"Downtown");
	}
	//test if the locations work
	//test if input 3 output a String "The Point"
	@Test
	public void testlocations3() {
		CitySim9002 cs=Mockito.mock(CitySim9002.class);
		String l= cs.locations(3);
		assertEquals(l,"The Point");
	}
	//test if the locations work
	//test if input 4 output a String "The Cathedral of Learning"
	@Test
	public void testlocations4() {
		CitySim9002 cs=Mockito.mock(CitySim9002.class);
		String l= cs.locations(4);
		assertEquals(l,"The Cathedral of Learning");
	}
	
//test if preference work
	//input "1" student, "4" The Cathedral of Learning output "did not like"
	@Test
	public void testpreference() {
		CitySim9002 cs=Mockito.mock(CitySim9002.class);
		String l= cs.preference(1,4);
		assertEquals(l," did not like ");
	}
	
//test if the testiterationhead() work
	//if visitor number 1 is a professor, and going to "The Point"
	//the professor should like "The Point"
	//check if it shows that 
	//"Visitor 1 is a Professor
	// Visitor 1 is going to The Point
	// Visitor 1 did like The Point"
	@Test
	public void testiteratonhead() {
		CitySim9002 cs=Mockito.mock(CitySim9002.class);
		cs.iterationhead(1, 2, 3);
	}
	
//test if the testiterationbody() work
	//if visitor number Visitor 2 is a "student" going to "The Cathedral of Learning"
	//student did not like The Cathedral of Learning
	//check if it shows that 
	//"Visitor 2 is going to The Cathedral of Learning
	// Visitor 2 did not like The Cathedral of Learning"
	@Test
	public void testiteratonbody() {
		CitySim9002 cs=Mockito.mock(CitySim9002.class);
		cs.iterationbody(2, 1, 4);
	}
//test if the testiterationtail() work
	//for the visitor 5 check if it shows
	//"Visitor 5 has left the city."
	@Test
	public void testiteratontail() {
		CitySim9002 cs=Mockito.mock(CitySim9002.class);
		cs.iterationtail(5);
	}
//test the main iteration part, which is 20% chance to leave the city or 80% chance to go another location
	//use subbing
	@Test
	public void testiterationouterbody() {
		CitySim9002 cs=Mockito.mock(CitySim9002.class);
		cs.iterationouterbody(3, 3);
	}
	@Test
	public void testiterationtail() {
		CitySim9002 cs=Mockito.mock(CitySim9002.class);
		cs.iterationtail(5);
	}
	

}
