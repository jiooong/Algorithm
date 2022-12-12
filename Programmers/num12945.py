def solution(n):
    arr = [0,1,1]

    for i in range(3,n+1):
        arr.append((arr[i-1] + arr[i-2]) % 1234567)
    
    answer = arr[n]
    
    return answer
