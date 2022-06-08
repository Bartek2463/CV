package com.example.cv.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(name = "JOB_TITLE")
    private String jobTitle;
    @Column(name = "COMPANY_NAME")
    private String companyName;
    @Column(name = "PROJECT_NAME")
    private String projectName;
    @Column(name = "DESCRIPTION_EXP")
    private String descriptionExp;
    @DateTimeFormat(pattern = "yyyy-MM")
    private Date startJob;
    @DateTimeFormat(pattern = "yyyy-MM")
    private Date endJob;

    @ManyToOne
    private About about;

    public Experience() {
    }

    public Experience(Long id, String jobTitle, String companyName, String projectName, String descriptionExp,
                      Date startJob, Date endJob, About about) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.projectName = projectName;
        this.descriptionExp = descriptionExp;
        this.startJob = startJob;
        this.endJob = endJob;
        this.about = about;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDescriptionExp() {
        return descriptionExp;
    }

    public void setDescriptionExp(String descriptionExp) {
        this.descriptionExp = descriptionExp;
    }

    public Date getStartJob() {
        return startJob;
    }

    public void setStartJob(Date startJob) {
        this.startJob = startJob;
    }

    public Date getEndJob() {
        return endJob;
    }

    public void setEndJob(Date endJob) {
        this.endJob = endJob;
    }

    public About getAbout() {
        return about;
    }

    public void setAbout(About about) {
        this.about = about;
    }
}
