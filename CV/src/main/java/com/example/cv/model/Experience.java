package com.example.cv.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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
    @DateTimeFormat(pattern = "yyyy-MM-dd",iso = DateTimeFormat.ISO.DATE)
    private Date startJob;
    @DateTimeFormat(pattern = "yyyy-MM-dd",iso = DateTimeFormat.ISO.DATE)
    private Date endJob;
    @ManyToOne
    private About about;


}
