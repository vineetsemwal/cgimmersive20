package org.cap.apps.studentbootjparest.bookms.dto;

public class BookDetails {
    private Long id;

    private String bookName;

    private Integer studentId;

    private String firstName,lastName;

    private Integer studentAge;

    public BookDetails(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
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

    public Integer getAge() {
        return studentAge;
    }

    public void setAge(Integer age) {
        this.studentAge = age;
    }
}
