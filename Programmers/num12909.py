def solution(s):
    answer = True
    stack = []
    
    for i in s:
        if i == "(":
            stack.append(i)
        elif i == ")":
            if not stack:
                answer = False
            else:
                stack.pop()
                
    if len(stack) is not 0:
        answer = False

    return answer
