<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

    <p> This will contain utility to search through </p>

    
    <jsp:include page="post-content.jsp" />
