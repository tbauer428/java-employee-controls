package io.qdivision.qtp.java.model;

public class PerformanceLevel {
    private int year;
    private int level;

    public PerformanceLevel(int year,int level) {
        this.year=year;
        this.level=level;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

}
