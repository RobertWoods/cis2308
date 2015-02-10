<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Application Freelancing</title>
        <link href="style.css" rel="stylesheet" type="text/css" />
        <script src="myscript.js" type="text/javascript"></script>
    </head>
    
    <jsp:include page="pre-content.jsp" />
    
    <script>
        document.getElementById("home").className = "tab selected";
    </script>

    <p><img src="images/apps_image.jpg"></img>Here you can request applications to be made by developers and incentivize them by offering money to anyone that makes the application.
    <br><a href="data_model.docx">Data model</a>
    <br><a href="proposal.doc">Project proposal</a></p>
    
    <jsp:include page="post-content.jsp" />
