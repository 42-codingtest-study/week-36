//문제: 25881
const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().trim().split("\n");

solution(input);
function solution(input) {
  const [a, b] = input.shift().split(" ").map(Number);
  input.shift();
  let answer = "";
  input.forEach((e) => {
    answer = e;
    answer += " ";
    if (e <= 1000) answer += a * e;
    else answer += (e - 1000) * b + a * 1000;
    console.log(answer);
  });
}
