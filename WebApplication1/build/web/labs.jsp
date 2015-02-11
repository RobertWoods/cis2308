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

    <h2>Lab 1 Project Proposal</h2>
    <a href="proposal.doc">Proposal </a>
    <h2>Lab 2 Data Model</h2>
    <a href="data_model.docx">Data Model </a>
    <h2>Lab 3 Home Page (HTML/CSS)</h2>
    <h2>Lab 4 Forms, Javascript, Cookies</h2>
    <h2>Lab 5 Display Data</h2>

    
    <jsp:include page="post-content.jsp" />
