// create a movie ticket booking based on the day of the week and showtime
// showtimes are Morningn, Evening and Night. Calculate the ticket price using switch case
// monday to thu 200 fri 250 and sat-sun 300 if show time evening and night add 50 rupee extra

const dayOfTheWeek = "Mon";
const showtime = "Night";
let ticketPrice = 0;

function calculateTicketPrice(dayOfTheWeek, showtime) {
  switch (dayOfTheWeek) {
    case ("Mon", "Tue", "Wed", "Thu"): ticketPrice = 200;
    case "Fri" : ticketPrice = 250;
    case "Sat", "Sun" : ticketPrice = 300;
  }
  
  if (showtime == "Night" || showtime == "Evening") {
    ticketPrice += 50;
  }

  return ticketPrice;
}

console.log(calculateTicketPrice("Sun", "Evening"));