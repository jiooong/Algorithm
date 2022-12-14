def solution(n):  
    rem = str(bin(n))   
    answer = 0
    while True:
        n += 1 
        countz = str(bin(n))
        
        if countz.count('1') == rem.count('1'):
            answer = n
            break
                
    return answer
