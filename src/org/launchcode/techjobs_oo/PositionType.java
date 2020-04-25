package org.launchcode.techjobs_oo;

import java.util.Objects;

public class PositionType {
    private int id;
    private static int nextId = 1;
    private String value;

    public PositionType() {
        this.id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        this();
        this.value = value;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
	@Override
	public String toString() {
		if (this.value.length() > 0) {return this.value;}
		return "Data not available.";
	}

    // TODO: Add custom equals and hashCode methods. Consider two PositionType
	// objects "equal" when their id fields match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionType that = (PositionType) o;
        return Objects.equals(getValue(), that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }


    // Getters and Setters:

    public int getId() {
        return this.id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
