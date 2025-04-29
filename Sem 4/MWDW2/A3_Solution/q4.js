function fibRecursive(numTerms) {
  if (numTerms <= 0) return [];
  if (numTerms === 1) return [0];
  if (numTerms === 2) return [0, 1];

  const prevSeq = fibRecursive(numTerms - 1);
  const nextNum = prevSeq[prevSeq.length - 1] + prevSeq[prevSeq.length - 2];
  return [...prevSeq, nextNum];
}
console.log('n = 5');
console.log(fibRecursive(5));