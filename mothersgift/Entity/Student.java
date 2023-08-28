package com.bootapp.mothersgift.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name="Student_DB")
@NoArgsConstructor
@AllArgsConstructor
public class Student{

    @Id
    @Column(name="ID")
    @GeneratedValue
    private int id;

    @Column(name="St_Mark")
    private int mark;

    @Column(name="Name")
    private String name;
}
