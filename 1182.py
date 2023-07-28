# code.plus - 부분 수열의 합

N, S = map(int, input().split())
num = list(map(int, input().split()))
cnt = 0
ans = []

def arr(start) :
    global cnt
    if sum(ans) == S and len(ans) > 0:
        cnt += 1

    for i in range(start, N):
        ans.append(num[i])
        arr(i + 1)
        ans.pop()

arr(0)
print(cnt)