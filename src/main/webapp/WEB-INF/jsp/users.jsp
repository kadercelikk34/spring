<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>

<body>
<h2>Submitted User Information</h2>
<table>
    <tr>
        <td>UserName</td>
        <td>${username}</td>
    </tr>
    <tr>
        <td>Password</td>
        <td>${password}</td>
    </tr>
    <tr>
        <td>Address</td>
        <td>${address}</td>
    </tr>
    <tr>
        <td>receivePaper</td>
        <td>${receivePaper}</td>
    </tr>
    <tr>
        <td>Favorite Web Frameworks</td>
        <td> <% String[] favoriteFrameworks = (String[])request.getAttribute("favoriteFrameworks");
            for(String framework: favoriteFrameworks) {
                out.println(framework);
            }
        %></td>
    </tr>
    <tr>
        <td>Gender</td>
        <td>${gender}</td>
    </tr>
    <tr>
        <td>Favourite Number</td>
        <td>${favoriteNumber}</td>
    </tr>
    <tr>
        <td>Country</td>
        <td>${country}</td>
    </tr>
</table>
</body>

</html>