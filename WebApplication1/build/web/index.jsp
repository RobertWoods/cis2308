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
        document.getElementById("home").className = "tab selected";
    </script>
     <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js">
        </script>
        <script>
            $(document).ready(function() {
                $("#innerP").hide()
                $("#innerP2").hide()
                $("h3").click(function() {
                    $(this).next().slideToggle(200); // slide in 200 milliseconds
                });
            });
        </script>

    
    <h3> Project </h3>
    <p id="innerP"> Wow, so many projects here! I'm sure you'll love it! HAHAHAHAHAHAHA! Wow, something for everyone! Everyone for something! Hahaha! What a great website!!!!!!!  ˙ ͜>˙ </p>
    <h3> Goal! </h3>
    <p id="innerP2">  Everyone survives in pursuit of peace of mind. ... Aren't you uneasy, preparing to hire someone, knowing he may not deliver the final product? ... If you join me, I will give you peace of mind that will last forever. </p>

    <p><img src="images/apps_image.jpg"></img>Here you can request applications to be made by developers and incentivize them by offering money to anyone that makes the application.
    <br><a href="data_model.docx">Data model</a>
    <br><a href="proposal.doc">Project proposal</a></p>
    
    <select onchange="javascript:changeStyle(this)">
       <option value="none"> Select Your Theme</option>
       <option value="clear"> Clear Selection</option>
       <option value="style.css"> Basic</option>
       <option value="pink.css" >   Pink</option>
       <option value="green.css" >   Green</option>
   </select>  
    <br/><br/><br/><br/><br/><br/><br/><br/>
    

    
    <jsp:include page="post-content.jsp" />
