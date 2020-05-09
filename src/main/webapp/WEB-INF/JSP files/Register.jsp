<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <title>Registeration</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="<c:url value="/resources/css/Register.css" />">
    <script src="<c:url value="/resources/javascript/Register.js" />"></script>
</head>

<body>
    <div class="main">
        <header class="header">Register page</header>
        <form onsubmit="return validation()" action="Login">
            <div class="container">
                <div class="form-group">
                    <label>UserName</label>
                    <input type="text" class="form-control" id="text1" name="text1" placeholder="Enter UserName"/>
                    <div class="text-danger">
                        <p id="error1"></p>
                    </div>
                </div>
                <div class="form-group">
                    <label>Phone number</label>
                    <input type="text" class="form-control" id="text2" name="text2" placeholder="Enter Phone Number" />
                    <div class="text-danger">
                        <p id="error2"></p>
                    </div>
                </div>
                <div class="form-group">
                    <label>Password</label>
                    <input type="password" class="form-control" id="text3" name="text3" placeholder="Enter Password" />
                    <div class="text-danger">
                        <p id="error3"></p>
                    </div>
                </div>
                <div class="form-group">
                    <label>Confirm Password</label>
                    <input type="password" class="form-control" id="text4" name="text4" placeholder="Enter Confirm Password" />
                    <div class="text-danger">
                        <p id="error4"></p>
                    </div>
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-primary " id="btn">Register</button>
                </div>
            </div>
        </form>
    </div>
</body>

</html>