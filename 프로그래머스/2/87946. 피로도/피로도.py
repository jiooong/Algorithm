from itertools import permutations
def solution(k, dungeons):
    answer = 0
    for i in permutations(dungeons, len(dungeons)):
        count = 0
        kk = k
        for j in i:
            if kk >= j[0]:
                kk -= j[1]
                count += 1 
            if answer < count:
                answer = count
    return answer
