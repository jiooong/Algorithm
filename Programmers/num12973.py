def solution(s):
    stack = []      
    for i in s:
        if len(stack) == 0:
            stack.append(i)
        elif stack[-1] == i:
            stack.pop()
        elif stack[-1] is not i:
            stack.append(i)
                   
    if len(stack)==0:
        answer = 1
    else:
        answer = 0
    return answer
