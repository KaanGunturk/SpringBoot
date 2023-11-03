package com.kagan.cruddemo.dao;

import com.kagan.cruddemo.entity.Student;

public interface StudentDAO {

    void save(Student student);

    Student findById(Integer id);

}
