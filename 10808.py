str = input()
count = [0]*26

for i in str:
    count[ord(i)-97] += 1
    
print(*count)