function resetSeats() {
  availableSeats = 100;
  localStorage.setItem("availableSeats", availableSeats);
  displayEventInfo();
}
