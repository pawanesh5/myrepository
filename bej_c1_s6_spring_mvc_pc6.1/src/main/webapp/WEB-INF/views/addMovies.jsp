<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored = "false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>

<head>
    <title>Add New Movies</title>
</head>
<body>
    <div style="text-align: center">
        <form:form action="addMovies" method="post" modelAttribute="movies">

            Movie Name : <form:input path="movieName" type="text" placeholder="Name" /><br><br>
            Date Played : <form:input type="date" path="datePlayed" /><br>
            Movie Director : <form:input path="directorName" type="text" placeholder="Director Name" /><br><br>

            <br>
            <input type="submit" value="Add Movies" />
        </form:form>
    </div>
</body>

</html>