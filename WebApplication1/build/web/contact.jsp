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
    <p></p>
	<form name="myForm" method="post" action="http://www.temple.edu/cgi-bin/mail?tuf08373@temple.edu">
	<table>
      <tr>What is Your Name?   <input type="text" name="userName" />  <br/> <br/> </tr>
      <tr>Are you a developer?      <input type="radio" name="userType" value="Y"  />   Yes  </tr>
                                         <input type="radio" name="userType"  value="N"  />    No  <br/> <br/> 
      <tr> Have you made requests or fulfilled them on this site before <input type="checkbox" name="isUser"  />  <br/> <br/> </tr>
      <tr> Why are you contacting us? </tr>
     <tr>   <select name="contactType" >
           <option value="BR" >Bug Report</option>
           <option value="RU">Report User</option>
           <option value="QS">Question About Site</option>
           <option value="OT" selected="selected">Other</option>
           <option value="FB">Feedback</option>
        </select>     <br/> <br/> </tr>
    <tr>   Message: <br/> </tr>
       <textarea name="inputcomments" cols="45" rows="5">Type your message here</textarea> <br/> <br/>
       <input type="submit" value="Click Here" />
	   </table>
    </form>


    
    <jsp:include page="post-content.jsp" />
