<html>
<head>
    <title>
        Login Page
    </title>
    <style>
        table{
            border: 2px;
            padding: 5%;
        }
        tr,td{
            padding: 1px;
            border-color: black;
        }
    </style>
</head>
<body>
<center><form action="LoginServlet" method="post">
    <table>
        <tr>
            <td>
                UserName :
            </td>
            <td>
                <input type="text" name="user"><br>
            </td>
        </tr>
        <tr>
            <td>
                Password :
            </td>
            <td>
                <input type="password" name="pwd"><br>
            </td>
        </tr>
        <tr><td></td>
            <td>
                <input type="submit" value="Login">
            </td>
        </tr>
    </table>
</form>
</center>
</body>
</html>
