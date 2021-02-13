package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name=name;
        this.employer=employer;
        this.location=location;
        this.positionType=positionType;
        this.coreCompetency=coreCompetency;


    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String retval =new String();

        if (this.name.equals("") && this.employer.toString().equals("") && this.location.toString().equals("") && this.positionType.toString().equals("") && this.coreCompetency.toString().equals("")) {
            return "OOPS! This job does not seem to exist.";
        }


        retval = "ID: "+id+"\n";

        if (this.name != null && this.name.equals("")) {
            retval += "Name: Data not available.\n";
        }else {
            retval += "Name: " + name + "\n";
        }

        if (this.employer != null && this.employer.toString().equals("")){
            retval += "Employer: Data not available.\n";
        }else {
            retval += "Employer: " + employer + "\n";
        }

        if (this.location != null && this.location.toString().equals("")){
            retval += "Location: Data not available.";
        }else {
            retval += "Location: " + location +"\n";
        }

        if (this.positionType != null && this.positionType.toString().equals("")){
            retval += "Position Type: Data not available.\n";
        }else{
            retval += "Position Type: " + positionType +"\n";
        }

        if (this.coreCompetency != null && this.coreCompetency.toString().equals("")){
                retval += "Core Competency: Data not available.\n";
        }else{
                retval += "Core Competency: " + coreCompetency +"\n";
        }
        return retval;
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
