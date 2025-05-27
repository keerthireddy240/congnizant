$(document).ready(function () {
  // ✅ Handle button click to register
  $('#registerBtn').click(function () {
    console.log("Register button clicked");

    // Show event card with fadeIn
    $('#eventCard').fadeIn(500);

    // Show success message with fadeIn
    $('#successMessage').fadeIn(600);
  });

  // ✅ Hide the event card with fadeOut
  $('#hideCard').click(function () {
    console.log("Hide button clicked");

    $('#eventCard').fadeOut(400);
    $('#successMessage').fadeOut(400);
  });
});
