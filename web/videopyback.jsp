<%-- 
    Document   : videopyback
    Created on : 8 Feb, 2023, 11:19:12 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
      
       String var1 = request.getParameter("chk1");
       String var2 = request.getParameter("chk2");
       String var3 = request.getParameter("chk3");
       String var4 = request.getParameter("chk4");
       String var5 = request.getParameter("chk5");
       
        if(var1 == null || var2 == null || var3 == null || var4 == null || var5 == null){
           out.print("All checkboxes are not checked");
       }
        else{
            out.print("All checkboxes are checked");
        }

       %>
    </body>
</html>
