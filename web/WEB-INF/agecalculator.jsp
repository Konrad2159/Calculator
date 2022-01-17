<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
        
        <link href="/Calculator/css/style.css" type="text/css" rel="stylesheet">
    </head>
    <body>
        <div class="center">
            
        
        <h1>Age Calculator</h1>
        
        <form action="age" method="post">
            <label for="age">Enter your age:</label>
            <input type="number" name="age" id="age">
            
            <br><br>
            
            <button type="submit"><strong>Age next birthday</strong></button>
        </form>
        
        <p>${message}</p>
        
        <br>
        
        <a href= "http://localhost:8084/Calculator/arithmetic">Arithmetic Calculator</a>
        
        </div>
    </body>
</html>