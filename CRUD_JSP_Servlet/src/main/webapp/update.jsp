<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Update Employee</title>
</head>
<body>
    <h2>Update Employee</h2>
    <form action="EmployeeController" method="post">
        <input type="hidden" name="action" value="update"/>
        <input type="hidden" name="empNo" value="${employee.empNo}"/>
         Name: <input type="text" name="empName" value="${employee.empName}"/><br><br>
         Salary: <input type="text" name="salary" value="${employee.salary}"/><br><br>
        <input type="submit" value="Update"/>
    </form>
    <br><a href="EmployeeController?action=list">Back to List</a>
</body>
</html>
