package com.example.cv.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String schoolName;
    private String direction;
    private String specialization;
    @DateTimeFormat(pattern = "yyyy-MM-dd", iso = DateTimeFormat.ISO.DATE)
    private Date startSience;
    @DateTimeFormat(pattern = "yyyy-MM-dd", iso = DateTimeFormat.ISO.DATE)
    private Date endSience;

    public Education() {
    }

    public Education(Long id, String schoolName, String direction, String specialization, Date startSience, Date endSience) {
        this.id = id;
        this.schoolName = schoolName;
        this.direction = direction;
        this.specialization = specialization;
        this.startSience = startSience;
        this.endSience = endSience;
    }

    public Long getId() {
        return id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getDirection() {
        return direction;
    }

    public String getSpecialization() {
        return specialization;
    }

    public Date getStartSience() {
        return startSience;
    }

    public Date getEndSience() {
        return endSience;
    }
}
