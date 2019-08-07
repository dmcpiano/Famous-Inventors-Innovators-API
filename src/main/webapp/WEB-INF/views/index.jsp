<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css" />
<title>Insert title here</title>
</head>
<body>

	<div> 
	<class="container">
	<h1>Tiny Inventors</h1>

		<table class="table">
			<tr>
				<th>Name</th>
				<th>Inventions</th>
				<th>Year</th>
			</tr>
	<c:forEach items="${list}" var = "person"> 
					<tr>
				<td>${person.name}</td>
				<td>${person.invention}</td>
				<td>${person.year}</td>
					</tr>
			
		</c:forEach>
		</table>
		</br >
		<a href ="/complete">Visit Larger List</a>
		</class>
		
</div>

</body>
</html>