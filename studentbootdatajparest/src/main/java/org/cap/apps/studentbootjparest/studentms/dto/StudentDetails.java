package org.cap.apps.studentbootjparest.studentms.dto;

import org.cap.apps.studentbootjparest.bookms.dto.BookDetails;

import java.util.List;

public class StudentDetails {
    private Integer id;

    private String firstName;

    private String lastName;

    private Integer age;

    private List<BookDetails>books;

    public StudentDetails(){

    }

    public StudentDetails(Integer id, String firstName, String lastName, Integer age,List<BookDetails>books){
        this.id=id;
        this.firstName =firstName;
        this.lastName=lastName;
        this.age=age;
        this.books=books;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<BookDetails> getBooks() {
        return books;
    }

    public void setBooks(List<BookDetails> books) {
        this.books = books;
    }
}
