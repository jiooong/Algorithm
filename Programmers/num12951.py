def solution(s):
    answer = []
    arr = s.split(" ")
    
    for i in arr:
        i = i.capitalize()
        answer.append(i)
        
                      
    return " ".join(answer)
