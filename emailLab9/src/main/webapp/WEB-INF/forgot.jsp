<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reset Password Link</title>
    </head>
    <body>
        <h2>Forgot Password</h2>
        <p>${test}</p>
        <form action="forgot" method="post">
            <label for="email">Email Address: </label>
            <input type="email" name="email" required />
            <br />
            <input type="Submit" value="Submit">
            <a href="login">Back to Login</a>
        </form>
    </body>
</html>
