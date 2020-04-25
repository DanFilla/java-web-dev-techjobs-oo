package org.launchcode.techjobs_oo;

import java.util.Objects;


public abstract class JobField {
	private String value;

	private int id;
	private static int nextId = 1;

	public JobField() {
		id = nextId;
		nextId++;
	}

	public JobField(String avalue) {
		this();
		this.value = avalue;
	}

	@Override
	public String toString() {
		if (this.value.length() > 0) {return this.value;}
		return "Data not available.";
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jf = (JobField) o;
        return getId() == jf.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public String getValue() {
        return value;
    }

    public int getId() {
        return this.id;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
