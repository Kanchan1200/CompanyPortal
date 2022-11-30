
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qt.companyportal.controller;

import com.qt.companyportal.model.EmployeeModel;
import com.qt.companyportal.service.EmplyeeService;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author QaswaTech_1
 */
@WebServlet(name = "EmployeeController", urlPatterns = {"/EmployeeController"})
public class EmployeeController extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        
        switch(action){
            case "insert":
                insertEmployee(request, response);
                break;
            case "update":
                updateEmployee(request, response);
                break;
            
        }
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
// to insert employee records
    private void insertEmployee(HttpServletRequest request, HttpServletResponse response) throws IOException {
    
        EmployeeModel  em = new EmployeeModel();
      
        em.setName(request.getParameter("empname")); 
        em.setEmail(request.getParameter("email"));  
        em.setPhone(request.getParameter("phone"));
        em.setExperience(Integer.parseInt(request.getParameter("experience")));
        em.setDesignation(request.getParameter("designation"));
        em.setCompany(request.getParameter("company"));
        em.setCity(request.getParameter("city"));
        em.setState(request.getParameter("state"));
        
        // creating service object
        EmplyeeService es = new EmplyeeService();
        
        String message = es.insert(em);
        
        response.sendRedirect("employeeRegistration.jsp?msg="+message);
    
    }
    
    
    // method for select all Employees
  public  ArrayList<EmployeeModel> selectAll(){
      
      EmplyeeService es = new EmplyeeService();  
      
      return es.selectAll(); 
  }
  
  
  public EmployeeModel selectById(int id){
     
      EmplyeeService es = new EmplyeeService(); 
      return es.selectById(id);
      
  }

    private void updateEmployee(HttpServletRequest request, HttpServletResponse response) throws IOException {
   
        EmployeeModel  em = new EmployeeModel();
        em.setId(Integer.parseInt(request.getParameter("id")));
        em.setName(request.getParameter("empname")); 
        em.setEmail(request.getParameter("email"));  
        em.setPhone(request.getParameter("phone"));
        em.setExperience(Integer.parseInt(request.getParameter("experience")));
        em.setDesignation(request.getParameter("designation"));
        em.setCompany(request.getParameter("company"));
        em.setCity(request.getParameter("city"));
        em.setState(request.getParameter("state"));
        
        // creating service object
        EmplyeeService es = new EmplyeeService();
        
        String message = es.update(em);
        
        response.sendRedirect("showEmployee.jsp?msg="+message);
    
    }
}