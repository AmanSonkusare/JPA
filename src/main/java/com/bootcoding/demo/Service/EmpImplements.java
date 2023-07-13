package com.bootcoding.demo.Service;

import com.bootcoding.demo.Repositary.EmpRepo;
import com.bootcoding.demo.model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpImplements  {
@Autowired
    EmpRepo repo;

public void addEmp(Emp e)
{
    repo.save(e);
}

public List<Emp> allEmp()
{
    return repo.findAll();
}

public Optional<Emp> emp(int id)
{
    return repo.findById(id);
}

public void deleteEmp( int id)
{
   repo.deleteById(id);
}


}
