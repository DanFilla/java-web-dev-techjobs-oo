package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class JobTest {

	Job test_job;
	Job test_job_dup;
	Job test_job2;

    @org.junit.Before
    public void setUp() throws Exception {
		test_job = new Job("Product tester", new Employer("ACME"),
				   new Location("Desert"), new PositionType("Quality control"),
				   new CoreCompetency("Persistence"));

		test_job_dup = new Job("Product tester", new Employer("ACME"),
				   new Location("Desert"), new PositionType("Quality control"),
				   new CoreCompetency("Persistence"));
		
		test_job2 = new Job("Final tester", new Employer("Apple"),
				   new Location("New York"), new PositionType("Manager"),
				   new CoreCompetency("Typing"));
    }

    @Test
    public void testingSettingJobId() {
		assertFalse(test_job.getId() == test_job2.getId());
    }

	@Test
	public void testJobConstructorSetsAllFields() {
		//Testing Employer
		assertTrue(test_job.getEmployer() instanceof Employer);
		assertEquals(test_job.getEmployer().getValue(), "ACME");

		//Testing Location
		assertTrue(test_job.getLocation() instanceof Location);
		assertEquals(test_job.getLocation().getValue(), "Desert");
		
		//Testing PositionType
		assertTrue(test_job.getPositionType() instanceof PositionType);
		assertEquals(test_job.getPositionType().getValue(), "Quality control");

		//Testing CoreCompetency
		assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);
		assertEquals(test_job.getCoreCompetency().getValue(),
					"Persistence");
	}

	@Test
	public void testJobsForEquality() {
		assertFalse(test_job.getId() == test_job_dup.getId());
	}
}
