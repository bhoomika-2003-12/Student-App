<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Signup Page</title>
  <style>
    body {
      background-color: #f2f2f2;
      font-family: Arial, sans-serif;
    }

    .signup-box {
      margin: 100px auto;
      width: 400px;
      padding: 20px;
      background: #ffffff;
      border-radius: 10px;
      box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }

    table {
      width: 100%;
    }

    td {
      padding: 10px;
    }

    input[type="text"],
    input[type="password"],
    input[type="email"] {
      width: 95%;
      padding: 8px;
      border: 1px solid #ccc;
      border-radius: 5px;
    }

    input[type="submit"] {
      width: 100%;
      padding: 10px;
      background-color: #007BFF;
      color: white;
      border: none;
      border-radius: 5px;
      font-size: 16px;
      cursor: pointer;
    }

    input[type="submit"]:hover {
      background-color: #0056b3;
    }

    .login-link {
      text-align: center;
      margin-top: 15px;
    }

    .login-link a {
      color: #4CAF50;
      text-decoration: none;
    }

    .login-link a:hover {
      text-decoration: underline;
    }

    h2 {
      text-align: center;
    }
  </style>
</head>
<body>

  <div class="signup-box">
    <center><h1>Pentagon Space</h1></center>
    <h2>Signup</h2>
    <form action="signup" method="post">
      <table>
        <tr>
          <td>Enter your Name:</td>
          <td><input type="text" name="name" required></td>
        </tr>
        <tr>
          <td>Enter the Phone Number:</td>
          <td><input type="text" name="phone" required></td>
        </tr>
        <tr>
          <td>Enter the mail_id:</td>
          <td><input type="text" name="mail" required></td>
        </tr>
        <tr>
          <td>Enter the Branch:</td>
          <td><input type="text" name="branch" required></td>
        </tr>
        <tr>
          <td>Enter the Location:</td>
          <td><input type="text" name="loc" required></td>
        </tr>
        <tr>
          <td>Enter the Password:</td>
          <td><input type="text" name="password" required></td>
        </tr>
        <tr>
          <td>Confirm Password:</td>
          <td><input type="text" name="confirm" required></td>
        </tr>
        <tr>
          <td colspan="2" style="text-align: center;">
            <input type="submit" value="Signup">
          </td>
        </tr>
      </table>
    </form>
    <div class="login-link">
      Already have an account? <a href="login.html">Login</a>
    </div>
  </div>

</body>
</html>