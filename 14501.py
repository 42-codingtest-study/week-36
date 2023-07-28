# code.plus - 퇴사

import sys

input = sys.stdin.readline
n = int(input())
d = [0] * 20
tp = [[0,0]]

for _ in range(n) :
    t, p = map(int,input().split())
    tp.append([t,p])

for i in range(1, n + 1) :
   x = tp[i][0] - 1
   d[i] = max(d[i - 1], d[i])
   d[i + x] = max(d[i - 1] + tp[i][1], d[i + x])
   
print(d[n])