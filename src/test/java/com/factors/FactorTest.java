package com.factors;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class FactorTest {

	@Test
	public void getFactors_of_1_is_empty_list() {
		assertEquals(Arrays.asList(), Factor.getFactors(1));
	}
}