<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <title>Main Page</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="<c:url value="/resources/css/Login.css"/>">
</head>
<script type="text/javascript">
function changepassword()
{
	window.location="change";
}
</script>
<body>
    <div class="main">
        <header class="header">Welcome ${user}!!!</header>
       <div class="class1">
        <button type="submit"class="btn btn-primary btn-large" onclick="changepassword()">Change Password</button>
       </div>
       <div class="class2">
        <a href="delete" class="btn btn-primary btn-large" >Delete My account</a>
       </div>
    </div>
</body>

</html>