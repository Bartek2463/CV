package com.example.cv.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;
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
    @NotEmpty
    @Min(2)
    @Max(30)
    @Column(name = "FISRT_NAME")
    private String firstName;
    @NotEmpty
    @Min(2)
    @Max(30)
    @Column(name = "LAST_NAME")
    private String lastName;
    @NotEmpty
    @Min(2)
    @Max(40)
    @Column(name = "ADRES")
    private String adres;
    @Column(name = "ZIP_CODE")
    private Integer zipCode;
    @NotEmpty
    @Min(2)
    @Max(40)
    @Column(name = "POST_OFFICE")
    private String postOffice;
    @Column(name = "NUMBER_PHONE")
    private Integer numberPhone;
    @Email
    private String adresEmail;
    @NotEmpty
    @Column(name = "ABOUT_PERSON")
    private String aboutPerson;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH, mappedBy = "about")
    private Set<Experience> experiences = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH, mappedBy = "about")
    private Set<Education> educations = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH, mappedBy = "about")
    private Set<Skill> skills = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH, mappedBy = "about")
    private Set<Interests> interests = new HashSet<>();


}
