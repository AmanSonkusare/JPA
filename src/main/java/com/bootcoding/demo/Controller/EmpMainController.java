package com.bootcoding.demo.Controller;

import com.bootcoding.demo.Service.EmpImplements;
import com.bootcoding.demo.model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
class EmpMainController {
    @Autowired
    EmpImplements emp;



    @PostMapping("/saveemp")
    public void addEmp(@RequestBody Emp e)
    {
       emp.addEmp(e);
    }
    @GetMapping("/allemp")
    public List<Emp> employee()
    {
 return emp.allEmp();
    }

    @GetMapping("/empbyid/{id}")
    public Optional<Emp> emp(@PathVariable int id)
    {
        return emp.emp(id);
    }

    @DeleteMapping("/delete/{id}")
    public void empDelete( @PathVariable int id)
    {
         emp.deleteEmp(id);
    }

    /*@PutMapping("/update/{id}")
    public void empUpdate(@RequestBody int id)
    {
        emp.updatEmp();
    }*/
}
