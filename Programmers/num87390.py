def solution(n, left, right):
    answer = []
    for i in range(left,right+1):
        first = i//n  
        second = i%n
        if first < second:
            answer.append(second+1)
        else:
            answer.append(first+1)
    return answer
