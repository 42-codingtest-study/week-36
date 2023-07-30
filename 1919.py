first = list(input())
second = list(input())
i = 0

while i < len(first) :
    if first[i] in second :
        second.remove(first[i])
        first.remove(first[i])
        i -= 1
    i += 1

print(len(first) + len(second))