package org.launchcode.techjobs_oo.Tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.launchcode.techjobs_oo.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class JobTest {

    @Test
    public void testSettingJobId(){
        Job test_job1 = new Job();
        Job test_job2 = new Job();

        assertEquals(test_job2.getId(), (test_job1.getId()+1), .001);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job test_job_full= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));assertTrue(test_job_full.getName()=="Product tester");
    assertTrue(test_job_full.getEmployer() instanceof Employer);
    assertTrue(test_job_full.getLocation() instanceof Location);
    assertTrue(test_job_full.getPositionType() instanceof PositionType);
    assertTrue(test_job_full.getCoreCompetency() instanceof CoreCompetency);
    assertTrue(test_job_full.getEmployer().getValue()== "ACME");
    assertTrue(test_job_full.getLocation().getValue()== "Desert");
    assertTrue(test_job_full.getPositionType().getValue()== "Quality control");
    assertTrue(test_job_full.getCoreCompetency().getValue()=="Persistence");

    }

    @Test
    public void testJobsForEquality(){
        Job test_job_full= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job_full2= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertFalse(test_job_full.getId()==test_job_full2.getId());
    }

    @Test
    public void testToStringForJobs(){
        Job test_job_full= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job_partial= new Job();
        String retval= new String;

        assertTrue(if{(((test_job_partial.getId() ) && (test_job_partial.getEmployer() == ("" || null)) && (test_job_partial.getLocation() == ("" || null)) && (test_job_partial.getPositionType() == ("" || null)) && (test_job_partial.getCoreCompetency() == ("" || null))));
        } retval=="OOPS! This job does not seem to exist");

        assertTrue(test_job_full.getId().toString().contains("ID:_"+ test_job_full.getId()+"_"));
        assertTrue(test_job_full.getName().toString().contains("Name:_Product tester_"));
        assertTrue(test_job_full.getEmployer().toString().contains("Employer:_"+ test_job_full.getEmployer()+"_"));
        assertTrue(test_job_full.getLocation().toString().contains("Location:_"+test_job_full.getLocation()+"_"));
        assertTrue(test_job_full.getPositionType().toString().contains("Position Type:_"+test_job_full.getPositionType()+"_"));
        assertTrue(test_job_full.getCoreCompetency().toString().contains("Core Competency:_"+test_job_full.getPositionType()+"_"));

    }

}
