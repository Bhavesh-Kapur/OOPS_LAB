<!DOCTYPE html>
<html>
<head>
    <title>Current Date Servlet</title>
    <style>
        
        body{
            background-image: url(time.webp);
            background-size: cover;
        }
        /* CSS styles for the h1 element */
        h1 {
            width: 100%;
            height: 100%;
            margin-left: 41%;
            margin-top: 3%;
            font-family: Arial, sans-serif;
            color: #333;
        }

        /* CSS styles for the p element */
        p {
            margin-left: 42%;
            margin-top: 15%;
            margin-right: 40%;
            font-family: Arial, sans-serif;
            border: 2px solid #333; /* Add a 2px solid border with color #333 */
            padding: 10px;
            border-radius: 10px;
            color: #000000;

        }
    </style>
</head>
<body>
    <h1>Current Date of the Server</h1>
    <p>
        <% 
            java.util.Date currentDate = new java.util.Date();
            out.print("Current date: " + currentDate);
        %>
    </p>
</body>
</html>