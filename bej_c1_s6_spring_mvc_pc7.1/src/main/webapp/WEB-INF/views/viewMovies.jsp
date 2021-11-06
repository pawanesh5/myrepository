<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored = "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<head>
    <title>Add New Movies</title>
</head>
<body>
    <div style="align: center">
    <table border="2px">
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Date</th>
            <th>Director</th>
        </tr>
        <c:forEach items="${allMovies}" var="myMovies">
        <tr>
            <td>${myMovies.movieID}</td>
            <td>${myMovies.movieName}</td>
            <td>${myMovies.datePlayed}</td>
            <td>${myMovies.directorName}</td>
        </tr>
        </c:forEach>
    </table>
    <br><br>
    <h3><a href="home">Home Page</a></h3>
    </div>
</body>
</html>