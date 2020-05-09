<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
    <title>Home</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="<c:url value="/resources/css/Login.css" />">
    <script src="<c:url value="/resources/javascript/Login.js"/>"></script>
</head>

<body>
    <div class="main">
        <header class="header">Login page</header>
        <form onsubmit="return validation()" action="Main" method="post">
            <div class="container">
                <div class="form-group">
                    <label>UserName</label>
                    <input type="text" class="form-control" id="text1" name="text1" placeholder="Enter UserName"/>
                    <div class="text-danger">
                        <p id="error1"></p>
                    </div>
                </div>
                <div class="form-group">
                    <label>Password</label>
                    <input type="password" class="form-control" id="text2" name="text2" placeholder="Enter Password"/>
                    <div class="text-danger">
                        <p id="error2"></p>
                    </div>
                </div>
                
                <div class="form-group">
                    <button type="submit" class="btn btn-primary" id="btn">Login</button>
                </div>
               <a href="register">Don't have an account?</a>
            </div>
        </form>
    </div>
</body>

</html>