<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Employee Management</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #74ebd5, #ACB6E5);
            margin: 0;
            padding: 0;
        }

        h1 {
            text-align: center;
            color: #333;
            margin-top: 40px;
        }

        .container {
            text-align: center;
            margin-top: 60px;
        }

        a {
            display: inline-block;
            text-decoration: none;
            background-color: #4CAF50;
            color: white;
            padding: 12px 25px;
            margin: 10px;
            border-radius: 8px;
            transition: 0.3s;
            font-size: 16px;
        }

        a:hover {
            background-color: #45a049;
            transform: scale(1.05);
        }

        footer {
            margin-top: 80px;
            text-align: center;
            color: #555;
            font-size: 14px;
        }
    </style>
</head>
<body>
    <h1>Employee Management System</h1>
    <div class="container">
     <h2>Add Employee</h2>
    <form action="EmployeeController" method="post">
        <input type="hidden" name="action" value="create"/>
        Emp_No: <input type="text" name="empNo"/><br><br>
        Name: <input type="text" name="empName"/><br><br>
        Salary: <input type="text" name="salary"/><br><br>
        <input type="submit" value="Save"/>
    </form>
        <a href="EmployeeController?action=list">Fetch </a>
      
    </div>
  
</body>
</html>
