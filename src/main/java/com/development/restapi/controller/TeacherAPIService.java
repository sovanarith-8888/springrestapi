package com.development.restapi.controller;

import com.development.restapi.model.TeacherVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherAPIService {
    TeacherVendor _teacher = null;
    @RequestMapping
    public String welcome(){
        return "Welcome to every body.";
    }

    @GetMapping("/list")
    public TeacherVendor getTeacher(){
        return  this._teacher;
    }

    @PostMapping("/post")
    public String createTeacherRest(@RequestBody TeacherVendor teacher){
        return "Message 200 k: Created success.";
    }

    @PutMapping("put")
    public String updateTeacherRest(@RequestBody TeacherVendor teacher){
        this._teacher = teacher;
        return "Teacher updated.";
    }

    @DeleteMapping("delete")
    public String deleteTeacher(){
        this._teacher = null;
        return "Delete success.";
    }
}
