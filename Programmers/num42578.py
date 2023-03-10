def solution(clothes):
    answer = 1
    dic = {}
    for i in clothes:
        key = i[1]
        value = i[0]
        
        if key in dic:
            dic[key].append(value)
        else:
            dic[key] = [value]
        
    for key in dic.keys():
        answer = answer * (len(dic[key])+1)
        

    return answer -1
