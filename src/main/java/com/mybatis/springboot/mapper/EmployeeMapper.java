package com.mybatis.springboot.mapper;

import com.mybatis.springboot.bean.Employee;

//@Mapper
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
