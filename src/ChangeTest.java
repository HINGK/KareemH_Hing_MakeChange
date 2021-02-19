/*
 * Name: Kareem Hing 
 * Student Id: 991485091
 * SYST 38634 ICE 03
 * 
 * The purpose of this program is to take a certain amount of cents 
 * and output the quarters,dimes and nickel equivalent of those cents
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChangeTest {

	@Test
	void testCorrect_Change() throws BadChangeException {
		String test01 = Change.correct_Change(54);
		assertEquals(test01, "54 cents requires 2 quarters,  1 nickel" );
	}

	

	
}
