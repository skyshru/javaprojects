<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Advanced Form Page</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            margin: 0;
            padding: 0;
        }
        .container {
            background: rgba(255, 255, 255, 0.1);
            backdrop-filter: blur(10px);
            border-radius: 20px;
            padding: 40px;
            box-shadow: 0 8px 32px 0 rgba(31, 38, 135, 0.37);
            width: 400px;
        }
        h1 {
            color: #ffffff;
            text-align: center;
            margin-bottom: 30px;
            font-size: 28px;
        }
        form {
            display: flex;
            flex-direction: column;
        }
        input[type="text"], input[type="password"], input[type="email"], select {
            width: 100%;
            padding: 12px;
            margin: 8px 0;
            display: inline-block;
            border: none;
            border-radius: 4px;
            box-sizing: border-box;
            background: rgba(255, 255, 255, 0.2);
            color: #ffffff;
        }
        input[type="radio"], input[type="checkbox"] {
            margin-right: 10px;
        }
        select option {
            background-color: #2c3e50;
            color: #ffffff;
        }
        label {
            color: #ffffff;
            margin-bottom: 5px;
        }
        button {
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
            transition: 0.3s;
        }
        button:hover {
            background-color: #45a049;
        }
        .radio-group, .checkbox-group {
            display: flex;
            align-items: center;
            color: #ffffff;
            margin: 10px 0;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Welcome to Sky's Registration</h1>
    <form id="myform" action="RegisterServlet" method="post">
        <label for="user_name">Username</label>
        <input type="text" id="user_name" name="user_name" placeholder="Enter your username" required>

        <label for="password">Password</label>
        <input type="password" id="password" name="password" placeholder="Enter password" required>

        <label for="user_email">Email</label>
        <input type="email" id="user_email" name="user_email" placeholder="Enter your email address" required>

        <label>Gender</label>
        <div class="radio-group">
            <input type="radio" id="male" name="user_gender" value="Male" required>
            <label for="male">Male</label>
            <input type="radio" id="female" name="user_gender" value="Female" required>
            <label for="female">Female</label>
        </div>

        <label for="user_package">Select Package</label>
        <select id="user_package" name="user_package" required>
            <option value="Basic">Basic</option>
            <option value="Intermediate">Intermediate</option>
            <option value="Advanced">Advanced</option>
            <option value="Advanced Pro">Advanced Pro</option>
        </select>

        <div class="checkbox-group">
            <input type="checkbox" id="condition" name="condition" value="checked" >
            <label for="condition">I agree to the Terms and Conditions</label>
        </div>

        <button type="submit" name="register_button">Register</button>
        <button type="reset" name="reset_button">Reset</button>
    </form>
</div>
</body>
</html>