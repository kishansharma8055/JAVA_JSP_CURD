<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Add Employee</title>
</head>
<body>
    <h2>Add Employee</h2>
    <form action="EmployeeController" method="post">
        <input type="hidden" name="action" value="create"/>
        Emp No: <input type="text" name="empNo"/><br><br>
        Name: <input type="text" name="empName"/><br><br>
        Salary: <input type="text" name="salary"/><br><br>
        <input type="submit" value="Save"/>
    </form>
    <br><a href="index.jsp">Back</a>
</body>
</html>
