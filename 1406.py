import sys
input = sys.stdin.readline

str = list(input().rstrip())
str2 = []
n = int(input())

for _ in range(n):
	cmd = list(input().split())
	if cmd[0] == 'L':
		if str :
			str2.append(str.pop())
	elif cmd[0] == 'D':
		if str2:
			str.append(str2.pop())
	elif cmd[0] == 'B':
		if str:
			str.pop()
	else:
		str.append(cmd[1])

str.extend(reversed(str2))
print(''.join(str))