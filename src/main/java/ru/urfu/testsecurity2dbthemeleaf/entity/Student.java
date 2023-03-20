package ru.urfu.testsecurity2dbthemeleaf.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "STUDENTS")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private long name;

    @Column(name = "surname")
    private long surname;

    @Column(name = "faculty")
    private long faculty;

    @Column(name = "age")
    private long age;



}
