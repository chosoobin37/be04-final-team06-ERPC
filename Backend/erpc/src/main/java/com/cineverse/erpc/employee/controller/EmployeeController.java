package com.cineverse.erpc.employee.controller;

import com.cineverse.erpc.employee.dto.EmployeeDTO;
import com.cineverse.erpc.employee.dto.RequestRegistDTO;
import com.cineverse.erpc.employee.dto.ResponseRegistDTO;
import com.cineverse.erpc.employee.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class EmployeeController {
    private Environment env;
    private ModelMapper modelMapper;
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(Environment env,
                              ModelMapper modelMapper,
                              EmployeeService employeeService) {
        this.env = env;
        this.modelMapper = modelMapper;
        this.employeeService = employeeService;
    }

    @GetMapping("/health_check")
    public String status() {
        return "I'm OK";
    }

    @PostMapping("/regist")
    public ResponseEntity<ResponseRegistDTO> registEmployee(@RequestBody RequestRegistDTO employee) {
        EmployeeDTO employeeDTO = modelMapper.map(employee, EmployeeDTO.class);

        employeeService.registEmployee(employeeDTO);

        ResponseRegistDTO responseRegistDTO = new ResponseRegistDTO();
        return ResponseEntity.status(HttpStatus.CREATED).body(responseRegistDTO);
    }
}