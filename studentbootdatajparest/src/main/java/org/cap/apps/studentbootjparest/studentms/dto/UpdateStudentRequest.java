package org.cap.apps.studentbootjparest.studentms.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UpdateStudentRequest {
    private Integer id;

    @NotBlank
    @NotBlank @Size(min =2, max = 20)
    private String firstName;

    @Min(1) @Max(100)
    private Integer age;

    @NotBlank
    @NotBlank @Size(min =2, max = 20)
    private String lastName;

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
}
