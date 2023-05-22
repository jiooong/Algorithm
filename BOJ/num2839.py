n = int(input())

count = 0

while n >= 0:
    if n % 5 == 0:
        count += int(n/5)
        break
    else:
        n = n - 3
        count += 1
if n < 0:
    print(int(-1))
else:
    print(int(count))
