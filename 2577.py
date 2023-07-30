import sys
input = sys.stdin.readline

num = int(input()) * int(input()) * int(input())

list = list(str(num))
result = [0] * 10

for num in list:
	result[int(num)] += 1

print("\n".join(map(str, result)))