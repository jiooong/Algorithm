def solution(A,B):
    answer = 0
    length = len(A)
    A.sort()
    B.sort(reverse=True)
    
    for i in range(length):
        
        num1 = A[i]
        num2 = B[i]
        
        answer += num1 * num2 
        

    return answer