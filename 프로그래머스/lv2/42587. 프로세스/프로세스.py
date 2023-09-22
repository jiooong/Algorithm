def solution(p, l):
    ans = 0
    num = []
    
    # 위치, 우선순위 저장하기
    p = [[i,n] for i,n in enumerate(p)]
    
    while p:
        maxvalue = max(p, key=lambda x:x[1])[1]
        # 제일 앞에 있는 수를 뽑아낸다
        first = p.pop(0)
        
        if first[1] != maxvalue:
            p.append(first)
        else:
            num.append(first)
                
    return findNum(num, l) + 1

def findNum(num, l):
    count = 0
    for i in num:
        if i[0] == l:
            return count
        else:
            count+=1
