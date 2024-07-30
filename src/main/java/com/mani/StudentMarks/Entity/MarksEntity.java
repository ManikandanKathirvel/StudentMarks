package com.mani.StudentMarks.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="marks")
public class MarksEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int rollNo;
    private int sem1Theory,sem1Practicals,sem2Theory,sem2Practicals,sem1Total,sem2Total;

    public MarksEntity(long id, int rollNo, int sem1Theory, int sem1Practicals, int sem2Theory, int sem2Practicals, int sem1Total, int sem2Total) {
        this.id = id;
        this.rollNo = rollNo;
        this.sem1Theory = sem1Theory;
        this.sem1Practicals = sem1Practicals;
        this.sem2Theory = sem2Theory;
        this.sem2Practicals = sem2Practicals;
        this.sem1Total = sem1Total;
        this.sem2Total = sem2Total;
    }
    public MarksEntity(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getSem1Theory() {
        return sem1Theory;
    }

    public void setSem1Theory(int sem1Theory) {
        this.sem1Theory = sem1Theory;
    }

    public int getSem1Practicals() {
        return sem1Practicals;
    }

    public void setSem1Practicals(int sem1Practicals) {
        this.sem1Practicals = sem1Practicals;
    }

    public int getSem2Theory() {
        return sem2Theory;
    }

    public void setSem2Theory(int sem2Theory) {
        this.sem2Theory = sem2Theory;
    }

    public int getSem2Practicals() {
        return sem2Practicals;
    }

    public void setSem2Practicals(int sem2Practicals) {
        this.sem2Practicals = sem2Practicals;
    }

    public int getSem1Total() {
        return sem1Total;
    }

    public void setSem1Total(int sem1Total) {
        this.sem1Total = sem1Total;
    }

    public int getSem2Total() {
        return sem2Total;
    }

    public void setSem2Total(int sem2Total) {
        this.sem2Total = sem2Total;
    }
}
