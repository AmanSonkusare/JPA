package com.bootcoding.demo.Repositary;

import com.bootcoding.demo.Service.EmpImplements;
import com.bootcoding.demo.model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<Emp,Integer> {

}
