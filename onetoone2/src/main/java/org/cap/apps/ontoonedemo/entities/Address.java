package org.cap.apps.ontoonedemo.entities;

import javax.persistence.*;

@Table(name = "addresses")
@Entity
public class Address {
    @GeneratedValue
    @Id
    private Integer id;

    private String city;

    private String lineNumber;

    @OneToOne(mappedBy = "address")
    private Student student;

    public Integer getId() {
        return id;
    }

    public Address(){

    }

    public Address(String city,String lineNumber){
        this.city=city;
        this.lineNumber=lineNumber;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }
}
