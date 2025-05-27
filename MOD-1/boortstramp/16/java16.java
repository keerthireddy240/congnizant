<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Fixed Footer</title>
  <link rel="stylesheet" href="css/bootstrap.min.css" />
  <style>
    body {
      padding-bottom: 60px; /* To prevent content from being hidden under footer */
    }
  </style>
</head>
<body>

  <div class="container py-5">
    <h1>Content Above Footer</h1>
    <p>Scroll to see the fixed footer at the bottom.</p>
  </div>

  <footer class="bg-dark text-white text-center py-3 position-fixed bottom-0 w-100">
    Fixed Footer - Always Visible at Bottom
  </footer>

  <script src="js/bootstrap.bundle.min.js"></script>
</body>
</html>
