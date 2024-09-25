<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Greeting Form</title>
    <style>
        body { font-family: Arial, sans-serif; background-color: #f0f8ff; display: flex; justify-content: center; align-items: center; height: 100vh; }
        .form-container { text-align: center; background-color: #fff; padding: 20px; border-radius: 10px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); }
    </style>
</head>
<body>
    <div class="form-container">
        <h1>Enter your name</h1>
        <form action="greeting" method="post">
            <label for="username">Name: </label>
            <input type="text" id="username" name="username" required>
            <button type="submit">Greet Me!</button>
        </form>
    </div>
</body>
</html>