package com.bootapp.mothersgift.Repository;

import com.bootapp.mothersgift.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
