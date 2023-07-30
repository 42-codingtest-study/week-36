n, k = map(int, input().split())
arr = [[0] * 2 for _ in range(6)] #성별2개 6학년

for _ in range(n) :
    s, y= map(int, input().split())
    arr[y-1][s-1] += 1

room = 0
for a in range(6):
    for b in range(2) :
        if(arr[a][b] % k == 0):
            room += arr[a][b] / k
        else:
            room += arr[a][b] // k + 1

print(int(room))