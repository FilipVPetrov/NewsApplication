<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ page import="News.controllers.Article" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Top News</title>
</head>
<body>
<table>
    <%
        List<Article> myList = (List<Article>) request.getAttribute("Item");
        if (myList != null) {
            for (int i = 0; i < myList.size(); i++) {
                Article b = (Article) myList.get(i);
                out.println("<tr>");
                out.println("<td>" + b.getTitle() + "</td>");
                out.println("<td> Author: " + b.getAuthor() + "</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>" + b.getDescription() + "</td>");
                out.println("<td> + <img src=\"<c:url value=\"" + b.getUrlToImage() + "/>/> + </td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td> Read More at:" + b.getUrl() + "</td>");
                out.println("</tr>");
            }
        }
    %>
</table>
</body>
</html>