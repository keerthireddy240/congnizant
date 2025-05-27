// Define Event constructor
function Event(name, date, location, capacity, booked) {
  this.name = name;
  this.date = date;
  this.location = location;
  this.capacity = capacity;
  this.booked = booked; // number of booked seats/tickets
}

// Add checkAvailability method to the prototype
Event.prototype.checkAvailability = function() {
  return this.booked < this.capacity;
};

// Create an event instance
const concert = new Event("Rock Concert", "2025-08-15", "Stadium", 1000, 750);

// Check availability
console.log(concert.checkAvailability()); // true (750 < 1000)

// List keys and values using Object.entries()
const entries = Object.entries(concert);
console.log(entries);

// Output example:
// [
//   ['name', 'Rock Concert'],
//   ['date', '2025-08-15'],
//   ['location', 'Stadium'],
//   ['capacity', 1000],
//   ['booked', 750]
// ]
