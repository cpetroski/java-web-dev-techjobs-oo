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
        Job test_job_partial= new Job("",new Employer(""),new Location(""),new PositionType(""),new CoreCompetency(""));
        Job test_job_partial1=new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job_partial2= new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job_partial3= new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job_partial4= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        Job test_job_partial5= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));
        Job test_job_partial6= new Job("Product tester", new Employer(""), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(test_job_partial.toString().equals("OOPS! This job does not seem to exist."));

        assertTrue(test_job_partial1.toString().contains("Name: Data not available."));
        assertTrue(test_job_partial2.toString().contains("Employer: Data not available."));
        assertTrue(test_job_partial3.toString().contains("Location: Data not available."));
        assertTrue(test_job_partial4.toString().contains("Position Type: Data not available."));
        assertTrue(test_job_partial5.toString().contains("Core Competency: Data not available."));
        assertTrue(test_job_partial6.toString().contains("Employer: Data not available."));
        assertTrue(test_job_partial6.toString().contains("Location: Data not available."));

        assertTrue(test_job_full.toString().contains("ID: "+ test_job_full.getId()));
        assertTrue(test_job_full.toString().contains("Name: "+ test_job_full.getName()));
        assertTrue(test_job_full.toString().contains("Employer: "+ test_job_full.getEmployer()));
        assertTrue(test_job_full.toString().contains("Location: "+test_job_full.getLocation()));
        assertTrue(test_job_full.toString().contains("Position Type: "+test_job_full.getPositionType()));
        assertTrue(test_job_full.toString().contains("Core Competency: "+test_job_full.getCoreCompetency()));

    }

}
