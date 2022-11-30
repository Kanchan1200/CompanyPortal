
package com.qt.companyportal.service;

import com.qt.companyportal.dao.EmployeeDao;
import com.qt.companyportal.model.EmployeeModel;
import java.util.ArrayList;




public class EmplyeeService {

    public String insert(EmployeeModel em) {
        EmployeeDao ed = new EmployeeDao();
        String message = ed.insert(em);
        
        return message;
    }

    public ArrayList<EmployeeModel> selectAll() {
       EmployeeDao ed = new EmployeeDao(); 
      return ed.selectAll();
    }

    public EmployeeModel selectById(int id) {
   
    EmployeeDao ed = new EmployeeDao();
    return ed.selectById(id);
    }

    public String update(EmployeeModel em) {
        
        EmployeeDao ed = new EmployeeDao();
        return ed.update(em);
    }

   

   
    
} //end class service
