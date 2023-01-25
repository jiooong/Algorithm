def solution(arr): 

    i = 1

    while True:

        c = 0
        find = arr[-1] * i

        for j in arr:
            if find % j == 0:
                c += 1
                continue
            else:
                i += 1
                break

        if c == len(arr):                   
            break

    return find
