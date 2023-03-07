from collections import deque

        
def solution(s):
    
    answer = 0     
    queue = deque(s)    

    
    for _ in range(len(s)):
        sym = queue.popleft()
        queue.append(sym)

        temp = []
        for q in queue:

            if len(temp) > 0:
                if temp[-1] == "(" and q == ")":
                    temp.pop()
                elif temp[-1] == "{" and q == "}":
                    temp.pop()
                elif temp[-1] == "[" and q == "]":
                    temp.pop()
                else:
                    temp.append(q)
            else:
                temp.append(q)

        if len(temp) == 0:
            answer += 1 
    
    
    return answer
