package com.example.demo.service;

import com.example.demo.model.EmployeeDao;
import com.example.demo.model.EmployeeDto;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeDto createUser(EmployeeDto employeeDto){
        EmployeeDao dao = new EmployeeDao();
        dao.setName(employeeDto.getName());
        dao.setEmail(employeeDto.getEmail());
        dao.setStatus(employeeDto.getStatus());

        dao = employeeRepository.save(dao);
        employeeDto.setId(dao.getId());
        employeeDto.setName(dao.getName());
        employeeDto.setEmail(dao.getEmail());
        employeeDto.setStatus(dao.getStatus());

        return employeeDto;
    }

}
