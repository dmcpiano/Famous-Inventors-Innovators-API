<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css" />
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div> 
	<class="container">
	<h1>Big Innovators!</h1>

		<table class="table">
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Innovation</th>
				<th>Year</th>
			</tr>
	<c:forEach items="${completeList}" var = "human"> 
					<tr>
				<td>${human.firstName}</td>
				<td>${human.lastName}</td>
				<td>${human.innovation}</td>
				<td>${human.year}</td>
					</tr>
			
		</c:forEach>
		</table>
		</br >
		<p>Mind blown? Take a breather and return back to the <a href ="/">Tiny List</a>!
		</class>
		
</div>
</body>
</html>