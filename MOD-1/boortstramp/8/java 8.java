<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Registration Form</title>
  <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body class="p-4">

  <div class="container">
    <h2>Registration Form</h2>
    <form>
      <!-- Name -->
      <div class="mb-3">
        <label for="name" class="form-label">Full Name</label>
        <input type="text" class="form-control" id="name" placeholder="John Doe">
      </div>

      <!-- Email with Input Group -->
      <div class="mb-3">
        <label for="email" class="form-label">Email address</label>
        <div class="input-group">
          <span class="input-group-text">@</span>
          <input type="email" class="form-control" id="email" placeholder="email@example.com">
        </div>
      </div>

      <!-- Password -->
      <div class="mb-3">
        <label for="password" class="form-label">Password</label>
        <input type="password" class="form-control" id="password" placeholder="Enter password">
      </div>

      <!-- Checkbox -->
      <div class="mb-3 form-check">
        <input type="checkbox" class="form-check-input" id="terms">
        <label class="form-check-label" for="terms">I agree to the terms and conditions</label>
      </div>

      <button type="submit" class="btn btn-primary">Register</button>
    </form>
  </div>

  <script src="js/bootstrap.bundle.min.js"></script>
</body>
</html>
