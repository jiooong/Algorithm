def solution(brown, yellow):
    answer = []
    x = 0
    y = 0 
        
    for i in range (yellow, 0 , -1 ):
        x = i
        y = yellow / x
        if (x * 2) + (y * 2) + 4 == brown:
            answer.append(x+2)
            answer.append(y+2)
            break
  
    return answer
