package com.bootapp.mothersgift.Service;

import com.bootapp.mothersgift.Entity.Student;
import com.bootapp.mothersgift.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public Student saveDetails(Student student){
        return studentRepo.save(student);
    }
}
