package com.example.cv.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.HashSet;
import java.util.Set;

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

    public About() {
    }

    public About(Long id, String firstName, String lastName, String adres, Integer zipCode, String postOffice,
                 Integer numberPhone, String adresEmail, String aboutPerson, Set<Experience> experiences) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.adres = adres;
        this.zipCode = zipCode;
        this.postOffice = postOffice;
        this.numberPhone = numberPhone;
        this.adresEmail = adresEmail;
        this.aboutPerson = aboutPerson;
        this.experiences = experiences;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getPostOffice() {
        return postOffice;
    }

    public void setPostOffice(String postOffice) {
        this.postOffice = postOffice;
    }

    public Integer getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(Integer numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAdresEmail() {
        return adresEmail;
    }

    public void setAdresEmail(String adresEmail) {
        this.adresEmail = adresEmail;
    }

    public String getAboutPerson() {
        return aboutPerson;
    }

    public void setAboutPerson(String aboutPerson) {
        this.aboutPerson = aboutPerson;
    }

    public Set<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(Set<Experience> experiences) {
        this.experiences = experiences;
    }
}
