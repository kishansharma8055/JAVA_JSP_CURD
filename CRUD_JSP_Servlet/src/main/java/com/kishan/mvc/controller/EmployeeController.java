package com.kishan.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kishan.mvc.dao.EmployeeDao;
import com.kishan.mvc.dao.EmployeeDaoImpl;
import com.kishan.mvc.model.Employee;

@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
    private EmployeeDao dao = new EmployeeDaoImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        
        if (action == null) {
            action = "list";
        }
        
        try {
            switch (action) {
                case "list":
                    request.setAttribute("employees", dao.findAll());
                    request.getRequestDispatcher("list.jsp").forward(request, response);
                    break;
                case "edit":
                    int empNo = Integer.parseInt(request.getParameter("empNo"));
                    request.setAttribute("employee", dao.findData(empNo));
                    request.getRequestDispatcher("update.jsp").forward(request, response);
                    break;
                case "delete":
                    dao.deleteData(Integer.parseInt(request.getParameter("empNo")));
                    response.sendRedirect("EmployeeController?action=list");
                    break;
                default:
                    response.sendRedirect("index.jsp");
            }
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        Integer empNo = Integer.parseInt(request.getParameter("empNo"));
        String name = request.getParameter("empName");
        Double salary = Double.parseDouble(request.getParameter("salary"));

        Employee emp = new Employee();
        emp.setEmpName(name);
        emp.setEmpNo(empNo);
        emp.setSalary(salary);
        
        

        try {
            if ("create".equals(action)) {
                dao.addData(emp);
            } else if ("update".equals(action)) {
                dao.updateData(emp);
            }
            response.sendRedirect("EmployeeController?action=list");
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}
