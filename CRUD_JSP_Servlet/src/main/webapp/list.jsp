<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Employee List</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #ece9e6, #ffffff);
            margin: 0;
            padding: 20px;
        }

        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 20px;
        }

        table {
            border-collapse: collapse;
            width: 80%;
            margin: 0 auto;
            background: white;
            box-shadow: 0px 4px 10px rgba(0,0,0,0.1);
            border-radius: 8px;
            overflow: hidden;
        }

        th {
            background-color: #4CAF50;
            color: white;
            padding: 12px;
            text-align: center;
        }

        td {
            padding: 12px;
            text-align: center;
            color: #333;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        tr:hover {
            background-color: #e6ffe6;
        }

        a.action-btn {
            display: inline-block;
            text-decoration: none;
            padding: 6px 12px;
            margin: 0 4px;
            border-radius: 5px;
            font-size: 14px;
            transition: 0.3s;
        }

        a.update-btn {
            background-color: #2196F3;
            color: white;
        }

        a.update-btn:hover {
            background-color: #0b7dda;
        }

        a.delete-btn {
            background-color: #f44336;
            color: white;
        }

        a.delete-btn:hover {
            background-color: #da190b;
        }

        .back-link {
            display: block;
            text-align: center;
            margin-top: 20px;
            text-decoration: none;
            padding: 10px 18px;
            background-color: #555;
            color: white;
            border-radius: 6px;
            transition: 0.3s;
            width: 100px;
            margin-left: auto;
            margin-right: auto;
        }

        .back-link:hover {
            background-color: #333;
        }
    </style>
</head>
<body>
 <div style='text-align:center;'><a  href='index.jsp'> Add New Employee</a></div>
    <h2>Employees</h2>
    <table>
        <tr>
            <th>Emp No</th>
            <th>Name</th>
            <th>Salary</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="emp" items="${employees}">
            <tr>
                <td>${emp.empNo}</td>
                <td>${emp.empName}</td>
                <td>${emp.salary}</td>
                <td>
                    <a class="action-btn update-btn" href="EmployeeController?action=edit&empNo=${emp.empNo}">Update</a>
                    <a class="action-btn delete-btn" href="EmployeeController?action=delete&empNo=${emp.empNo}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>

    <a href="index.jsp" class="back-link">⬅ Back</a>
</body>
</html>
