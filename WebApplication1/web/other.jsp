<%@page import="view.OtherView"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" import="view.WebUserView" %>
<%@page language="java" import="dbUtils.DbConn" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Application Freelancing</title>
        <link id="styleSheetID" href="style.css" rel="stylesheet" type="text/css" />
        <script src="myscript.js" type="text/javascript"></script>
        <script>readCookieSetStyle();</script> 
    </head>
    
    <jsp:include page="pre-content.jsp" />
    
    <script>
        document.getElementById("labs").className = "tab selected";
    </script>

    <%
            DbConn dbc = new DbConn();
            String msg = dbc.getErr(); // returns "" if connection is good, else error msg.
            if (msg.length() == 0) { // got open connection

                // returns a string that contains a HTML table with the db data in it
                msg = OtherView.listAllUsers("resultSetFormat", dbc);
            }
            // PREVENT DB connection leaks:
            dbc.close(); //    EVERY code path that opens a db connection, must also close it.
        %>

        <h1>Web Users</h1>
        <% out.print(msg); %>

    
    <jsp:include page="post-content.jsp" />
