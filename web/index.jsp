<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Библиотека</title>
  </head>
  <body>
    <c:forEach var="book" items="${books}">
      <h2>${book.title}</h2>
        <span>Автор: ${book.author}</span>
      <br>
    </c:forEach>
  </body>
</html>
