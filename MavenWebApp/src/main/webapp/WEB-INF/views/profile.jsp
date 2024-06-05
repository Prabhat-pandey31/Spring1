<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h3> Welcome : User</h3>
 <h3> Name : ${user.getName()}</h3>
 <h3> Email : ${user.getEmail()}</h3>
 <h3> Phone no : ${user.getPhoneno()}</h3>
</body>
</html>