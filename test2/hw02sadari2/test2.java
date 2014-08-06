package hw02sadari2;

import junit.framework.TestCase;

public class test2 extends TestCase {
	public void testRunWhenNoLine() throws Exception {
		Ladder ladder= new Ladder(3,3);
		int target = ladder.run(0);
		assertEquals(0, target);
		
		target = ladder.run(2);
		assertEquals(2, target);
		
		
	}

	public void testRunWhenLineLeft() throws Exception {
		//0 1 1
		Ladder ladder= new Ladder(3,3);
		
		ladder.drawLine(1,1);
		
		
		int target=ladder.run(2);
		assertEquals(1,target);
		
		//1 1 0

		ladder= new Ladder(3,3);
		ladder.drawLine(0,0);
		
		target=ladder.run(0);
		assertEquals(1,target);
	}
	public void testRunWhenLineRight() throws Exception {
		//0 1 1
		Ladder ladder= new Ladder(3,3);
		ladder.drawLine(1,1);
		
		int target=ladder.run(1);
		assertEquals(2,target);
		
		//0 1 1
		ladder= new Ladder(3,3);
		ladder.drawLine(1,1);
		
		target=ladder.run(2);
		assertEquals(1,target);
		
	}
	public void testRunWhenMultiRows() throws Exception {
		// 1 1 0 0
		// 0 1 1 0
		// 0 0 1 1
		Ladder ladder= new Ladder(3,4);
		ladder.drawLine(0,0);
		ladder.drawLine(1,1);
		ladder.drawLine(2,2);
		
		assertEquals(3, ladder.run(0));
		assertEquals(0, ladder.run(1));
		assertEquals(1, ladder.run(2));
		assertEquals(2, ladder.run(3));
		
	}
}
