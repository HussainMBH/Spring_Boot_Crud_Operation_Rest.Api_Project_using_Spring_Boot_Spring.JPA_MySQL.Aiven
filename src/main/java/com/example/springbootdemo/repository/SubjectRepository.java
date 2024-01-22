package com.example.springbootdemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springbootdemo.bean.Subject;

public interface SubjectRepository extends CrudRepository<Subject, String> {

}
  