import math

while True:

    n = int(input())
    big = n * 2
    answer = 0

    if n==0:
        break

    arr = [True for i in range(big+1)]
    arr[1] = False

    for i in range(2, int(math.sqrt(big))+ 1):
        if arr[i] == True:
            j = 2
            while i * j <= big:
                arr[i*j] = False
                j += 1


    for i in range(n+1, big+1):
        if arr[i]:
            answer += 1

    print(answer)
