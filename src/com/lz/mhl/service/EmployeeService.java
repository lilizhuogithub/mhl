package com.lz.mhl.service;

import com.lz.mhl.dao.EmployeeDAO;
import com.lz.mhl.domain.Employee;

/**
 *该类完成对employ表的各种操作(通过调用EmployeeDAO对象完成)
 */
public class EmployeeService {
    //定义一个EmployeeDAO 属性
    private EmployeeDAO employeeDAO = new EmployeeDAO();

    //根据empId 和 pwd 返回一个Employee对象
    //如果查不到就返回null
    public Employee getEmployeeByIdAndPwd(String empId, String pwd) {
        return employeeDAO.querySingle("select * from employee where empId=? and pwd=md5(?)", Employee.class, empId, pwd);

    }


}
