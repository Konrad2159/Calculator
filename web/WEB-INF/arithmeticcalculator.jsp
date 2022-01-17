<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
        
        <link href="css/style.css" type="text/css" rel="stylesheet">
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form action="arithmetic" method="post">
            
            <label for="num1">First:</label>
            <input type="number" name="num1" id="num1">
            
            <br><br>
            
            <label for="num2">Second:</label>
            <input type="number" name="num2" id="num2">
            
            <br><br>
            
            <button type="submit" name="add" id="add"><strong>+</strong></button>
            <button type="submit" name="subtract" id="subtract"><strong>-</strong></button>
            <button type="submit" name="multiply" id="multiply"><strong>*</strong></button>
            <button type="submit" name="modulus" id="modulus"><strong>%</strong></button>
        </form>
        
        <p>Result:${message2}</p>
        
        <br>
        
        <a href= "http://localhost:8084/Calculator/age">Age Calculator</a>
    </body>
</html>