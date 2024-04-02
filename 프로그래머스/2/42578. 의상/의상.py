def solution(clothes):
    answer = 1
    cloKey = {}
    
    for i in clothes:
        key = i[1]
        value = i[0]
        
        if key in cloKey:
            cloKey[key].append(value)
        else:
            cloKey[key] = [value]
    
    for j in cloKey.keys():
        answer *= (len(cloKey[j]) + 1)
    
    return answer -1 