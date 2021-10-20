package com.mourad.test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;
import org.junit.Test;
import com.mourad.main.model.AC;
import com.mourad.main.services.PriorityFilter;

public class QueueServicesTest {
	
	@Test
	public void testType() {
		AC acQManager1 = new AC("P", "L");
		AC acQManager2 = new AC("C", "L");
		assertEquals(3, acQManager2.getType());
		assertEquals(4, acQManager1.getType());
	}

	@Test
	public void testSize() {
		AC acQManager1 = new AC("P", "S");
		AC acQManager2 = new AC("P", "L");
		assertEquals(1, acQManager1.getSize());
		assertEquals(2, acQManager2.getSize());
	}

	@Test
	public void testSorting() {
		AC acQManager1 = new AC("C", "S");
		AC acQManager2 = new AC("C", "S");
		AC acQManager3 = new AC("P", "S");
		ArrayList<AC> acQManagerList = new ArrayList<AC>();
		acQManagerList.add(acQManager1);
		acQManagerList.add(acQManager2);
		acQManagerList.add(acQManager3);
		Collections.sort(acQManagerList, Collections.reverseOrder(new PriorityFilter()));
		assertEquals(acQManagerList.remove(0).getType(), 3);
	}
}