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

    // TODO: Add two constructors - one to initialize a unique ID and a second
	// to initialize the other five fields. The second constructor should also
	// call the first in order to initialize the 'id' field.
	public Job() {
		this.id = nextId;
		nextId++;
	}

	public Job(String aName, Employer aEmployer, Location aLocation,
			PositionType aPositionType, CoreCompetency aCoreCompetency) {
		this();
		this.name = aName;
		this.employer = aEmployer;
		this.location = aLocation;
		this.positionType = aPositionType;
		this.coreCompetency = aCoreCompetency;
	}

    // TODO: Add custom equals and hashCode methods. Consider two Job objects
	// "equal" when their id fields match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job that = (Job) o;
        return id == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

	@Override
	public String toString() {
		if (this.getName().length() < 1 &&
			this.getEmployer().getValue().length() < 1 &&
			this.getLocation().getValue().length() < 1 &&
			this.getPositionType().getValue().length() < 1 &&
			this.getCoreCompetency().getValue().length() < 1) {
				return "OOPS! This job does not seem to exist.";
		}

		return "\nID: " + this.getId() + "\n" +
                "Name: " + this.getName() + "\n" +
                "Employer: " + this.getEmployer() + "\n" +
                "Location: " + this.getLocation() + "\n" +
                "Position Type: " + this.getPositionType() + "\n" +
                "Core Competency: " + this.getCoreCompetency() + "\n";
	}

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each
	// field EXCEPT nextID and id.
	public String getName() {
		return this.name;
	}

	public Employer getEmployer() {
		return this.employer;
	}

	public Location getLocation() {
		return this.location;
	}

	public PositionType getPositionType() {
		return this.positionType;
	}
	
	public CoreCompetency getCoreCompetency() {
		return this.coreCompetency;
	}

	public int getId() {
		return this.id;
	}

	public void setName(String aname) {
		this.name = aname;
	}

	public void setEmployer(Employer aemployer) {
		this.employer = aemployer;
	}

	public void setLocation(Location alocation) {
		this.location = alocation;
	}

	public void setPositionType(PositionType apositionType) {
		this.positionType = apositionType;
	}

	public void setCoreCompetency(CoreCompetency acoreCompetency) {
		this.coreCompetency = acoreCompetency;
	}
}
