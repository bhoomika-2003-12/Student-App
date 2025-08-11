<%@page import="in.pentagon.studentapp.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
        .header {
            background-color: black;
            color:white;
            padding: 15px 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            font-size:19px;
        }
        .header .user-info {
            font-size: 15px;
            color: white;
        }
        .main{
        	text-align:center;
        	font-size:20px
        }
        .main-content {
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 2px 4px rgba(0,0,0,0.1);
        }
        .data-table, .search-results {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        .data-table th, .data-table td,
        .search-results th, .search-results td {
            border: 1px solid #ddd;
            padding: 8px;
        }
         .data-table th, .search-results th {
            background-color: #f2f2f2;
        }
        .btn{
        	margin-top: 20px;
        	padding: 8px 15px;
            background-color: green;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        l1{
        	color:red;
        }
    </style>
</head>
<body>
	<%
	if(request.getAttribute("student")!=null){
	%>
	<%
	Student s=(Student)request.getAttribute("student");
	%>
	
    <div class="header">
        <div class="welcome">
        	<b>Welcome <%=s.getName()%></b>
        </div>
        <div class="user-info">
        	View User || ResetPassword || Update Data || <a href="Forgot.html">Logout</a></div>
        </div>
    </div>
    <div class="main">
    	<h2>dashboard</h2>
    </div>
    <div class="main-content">
    <h3>View Your Data</h3>
        <table class="data-table">
          	<thead>
        		<tr>
            		<th>Id</th>
               		<th>Name</th>
                	<th>Phone</th>
                	<th>Mail ID</th>
                	<th>Branch</th>
                	<th>Location</th>
            	</tr>
          	</thead>
          	<tbody>
          		<tr>
          			<td><%=s.getId()%></td>
          			<td><%=s.getName()%></td>
          			<td><%=s.getPhone()%></td>
          			<td><%=s.getMail()%></td>
          			<td><%=s.getBranch()%></td>
          			<td><%=s.getLoc()%></td>
          		</tr>
          	</tbody>
        </table>
        <div class="search-section">
        	<h3>Search User</h3>
            <label>Enter the name of the student here</label>
            <input type="text" id="studentName" placeholder="Search by name">
        </div>
        <div>
        	<input class="btn" type="submit" value="Search">
        </div>
        <table class="search-results">
        	<tr>
            	<th>Id</th>
               	<th>Name</th>
                <th>Branch</th>
                <th>Location</th>
            </tr>
        	<tr>
            	<td colspan="4" style="text-align: center;">Search for users!</td>
            </tr>
        </table>
    </div>
    <%}
    else
    {
    	request.setAttribute("error", "Session closed");
		RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
    }
    %>
</body>
</html>