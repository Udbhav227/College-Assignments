function solution(arr) {
  if (arr.length < 2) return null;

  let firstMin = Infinity, secondMin = Infinity;
  let firstMax = -Infinity, secondMax = -Infinity;

  for (const num of arr) {
    // Update minimum values
    if (num < firstMin) {
      secondMin = firstMin;
      firstMin = num;
    } else if (num < secondMin && num !== firstMin) {
      secondMin = num;
    }

    // Update maximum values
    if (num > firstMax) {
      secondMax = firstMax;
      firstMax = num;
    } else if (num > secondMax && num !== firstMax) {
      secondMax = num;
    }
  }

  return {
    secondSmallest: secondMin === Infinity ? null : secondMin,
    secondLargest: secondMax === -Infinity ? null : secondMax,
  };
}
