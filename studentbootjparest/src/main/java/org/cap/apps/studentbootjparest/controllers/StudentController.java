package org.cap.apps.studentbootjparest.controllers;

import org.cap.apps.studentbootjparest.dto.CreateStudentRequest;
import org.cap.apps.studentbootjparest.dto.StudentDetails;
import org.cap.apps.studentbootjparest.dto.UpdateStudentRequest;
import org.cap.apps.studentbootjparest.entities.Student;
import org.cap.apps.studentbootjparest.exceptions.StudentNotFoundException;
import org.cap.apps.studentbootjparest.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/students")
@RestController
public class StudentController {

    @Autowired
    private IStudentService service;

    /**
     * effective url will be http://localhost:8585/students/add
     */
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/add")
    public StudentDetails add(@RequestBody CreateStudentRequest requestData) {
        Student student = new Student(requestData.getName(), requestData.getAge());
        student = service.save(student);
        StudentDetails details = toDetails(student);
        return details;
    }

    @PutMapping("/update")
    public StudentDetails update(@RequestBody UpdateStudentRequest requestData) {
        Student student = new Student(requestData.getName(), requestData.getAge());
        student.setId(requestData.getId());
        student = service.update(student);
        StudentDetails details = toDetails(student);
        return details;
    }


    @GetMapping("/get/{id}")
    public StudentDetails fetchStudent(@PathVariable("id") Integer id) {
        Student student = service.findById(id);
        StudentDetails details = toDetails(student);
        return details;
    }

    @GetMapping
    public List<StudentDetails> fetchAll() {
        List<Student> students = service.findAll();
        // List<StudentDetails>response= students.stream().map(student->toDetails(student)).collect(Collectors.toList());
        List<StudentDetails> response = toDetails(students);
        return response;
    }


    @DeleteMapping("/remove/{id}")
    public String removeStudent(@PathVariable("id") Integer id) {
        service.deleteById(id);
        String response = "removed student with id=" + id;
        return response;
    }


    public List<StudentDetails> toDetails(Collection<Student> students) {
        List<StudentDetails> desired = new ArrayList<>();
        for (Student student : students) {
            StudentDetails details = toDetails(student);
            desired.add(details);
        }
        return desired;
    }

    public StudentDetails toDetails(Student student) {
        StudentDetails details = new StudentDetails(student.getId(), student.getName(), student.getAge());
        return details;

    }


}
