package com.sx.cache.Service;

import com.sx.cache.entity.Employee;
import com.sx.cache.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    public Employee getEmpById(Integer id){
        System.out.println("find number " + id + " Employee !");
        Employee empById = employeeMapper.getEmpById(id);
        return empById;
    }
}
