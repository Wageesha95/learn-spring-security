package com.example.demo.student;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "management/api/v1/students")
public class StudentManagementController {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1,"James Bond"),
            new Student(2, "Maria Jones"),
            new Student(3,"Anna Smith")
    );

    @GetMapping
    public List<Student> getAllStudents(){
        System.out.println("get all students");
        return STUDENTS;
    }
    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        System.out.println("register new student");
        System.out.println(student);
    }
    @DeleteMapping(path="{studentId}")
    public void deleteStudent(@PathVariable Integer studentId){
        System.out.println("delete student");
        System.out.println(studentId);
    }
    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable Integer studentId,@RequestBody Student student){
        System.out.println("update student");
        System.out.println(String.format("%s %s",studentId,student));
    }

}
