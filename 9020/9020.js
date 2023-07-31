//문제: 9020
const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().trim().split("\n");

solution(input);
function solution(input) {
  let n = 10000; // 5 안에 들어있는 소수를 알고 싶다고 치자
  let arr = []; // boolean 값이 들어갈 arr 를 선언

  // 1. arr 만들기 (소수만 true 로 표기할거다)
  Array.from({ length: n + 1 }, (_, i) => {
    // length는 n + 1 이다. 쓸모없는 인덱스 0을 포함시킬거다
    // 아래쪽 for문 돌릴 때 인덱스 order가 필요하기 떄문이다
    if (i <= 2) {
      // 인덱스0 이랑 인덱스1은 소수가 아니므로,
      arr.push(false); // false 를 넣어주자
    } else {
      arr.push(true);
    }
  });

  for (let i = 2; i * i <= n; i++) {
    if (arr[i]) {
      for (let j = i * i; j <= n; j += i) {
        arr[j] = false;
      }
    }
  }

  input.shift();
  input.forEach((e) => {
    let [a, b] = [+e / 2, +e / 2];
    if (a % 2 === 0) {
      a -= 1;
      b += 1;
    }
    while (!sosu.includes(a) || !sosu.includes(b)) {
      a -= 2;
      b += 2;
    }
    console.log(a, b);
  });
}
