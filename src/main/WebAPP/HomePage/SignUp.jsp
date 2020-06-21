<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="https://www.thymeleaf.org"
      xmlns:sec="https://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
    <head>
        <title>WelecomePage!</title>
    </head>
    <body>
        <h1>Welcome Watheq Visitors!</h1>

        <h1>Please Enter Your Email</h1>

        <h1>Password</h1>

        <form action="/Users/authenticate"" method="post">
          <label for="fname">First name:</label><br>
          <input type="text" id="fname" name="fname" value="Hassan"><br>
          <label for="lname">Last name:</label><br>
          <input type="text" id="lname" name="lname" value="ALI"><br><br>

          <label for="lname">Enter Your Email :</label><br>
           <input type="email" name="email" required /> <br />
          <input type="submit" value="Submit">
        </form>
    </body>
</html>