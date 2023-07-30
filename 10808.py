import sys
input = sys.stdin.readline

n = input().rstrip()
arr = [0] * 26

for i in n :
	arr[ord(i)-97] = n.count(i)

for num in arr :
	print(num, end=" ")