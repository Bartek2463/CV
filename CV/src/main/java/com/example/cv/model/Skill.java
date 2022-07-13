package com.example.cv.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "SKILLS")
    private String skills;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "SCALE")
    private Integer scale;

    @ManyToOne
    private About about;

}
