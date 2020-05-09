<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <title>Change Password</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="<c:url value="/resources/css/Login.css" />">
    <script src="<c:url value="/resources/javascript/change.js" />"></script>
</head>

<body>
    <div class="main">
        <header class="header">Change Password</header>
        <form onsubmit="return validation()" action="Update">
            <div class="container">
                <div class="form-group">
                    <label>Enter new Password</label>
                    <input type="password" class="form-control" id="text1" name="text1" placeholder="Enter New Password" />
                    <div class="text-danger">
                        <p id="error1"></p>
                    </div>
                </div>
                <div class="form-group">
                    <label>Confirm Password</label>
                    <input type="password" class="form-control" id="text2" name="text2" placeholder="Enter Confirm Password" />
                    <div class="text-danger">
                        <p id="error2"></p>
                    </div>
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-primary" id="btn">Change Password</button>
                </div>
            </div>
        </form>
    </div>
</body>

</html>