package com.example.cv.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class About {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "FISRT_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "ADRES")
    private String adres;
    @Column(name = "ZIP_CODE")
    private Integer zipCode;
    @Column(name = "POST_OFFICE")
    private String postOffice;
    @Column(name = "NUMBER_PHONE")
    private Integer numberPhone;
    @Email
    private String adresEmail;
    @Column(name = "ABOUT_PERSON")
    private String aboutPerson;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.REFRESH,mappedBy = "about")
    private Set<Experience> experiences = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.REFRESH,mappedBy = "about")
    private Set<Education> educations = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.REFRESH,mappedBy = "about")
    private Set<Skill> skills = new HashSet<>();




}
