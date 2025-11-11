// write a program that determines the total number of days for a date for example the
// Jan 1 1994 then total number of days = 1 Dec 31 1996 then total number of days 366 use a
// function leap year that returns 1 if leap year otherwise 0
// input 3 variables day month year, create an array month that contains the total number of days in each month
// if you enter Aug 20 2025, month is 8 day is 20 and year is 2025 calculate the total number of days
const day = 31; 
const month = 12;
const year = 1996; 

function isLeapYear(year) { 
  if ((year % 4 === 0 && year % 100 !== 0) || year % 400 === 0) { 
    return true; 
  } else { 
    return false; 
  } 
} 

function calculateNumberOfDaysPassed(day, month, year) {
  let totalDaysPassed = 0
  const daysInMonthArray = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    if (isLeapYear(year)) {
    daysInMonthArray[2] = 29;
  }
  
  for (let i = 0; i < month; i++) {
    totalDaysPassed += daysInMonthArray[i];
  }
  
  totalDaysPassed += day;
  return totalDaysPassed;
}

console.log(calculateNumberOfDaysPassed(day, month, year));