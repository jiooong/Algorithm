
def solution(progresses, speeds):
    answer = []
    count = 0
    day = 0
    
    while True:
        if progresses[0] + speeds[0] * day <100:
            day += 1 
            if count >= 1:
                answer.append(count)
                count = 0
        else:
            progresses.pop(0)
            speeds.pop(0)
            count += 1 
        if len(progresses) == 0:
            answer.append(count)
            break
            
    
    # for i in range(0, len(progresses)):
    #     if (100 - progresses[i]) % speeds[i] != 0:
    #         progresses[i] = (100 - progresses[i]) // speeds[i] + 1
    #     else:
    #         progresses[i] = (100 - progresses[i]) // speeds[i]

#     while len(progresses)-1 > 0:
#         first = progresses[0]
#         second = progresses[1]

#         if first > second:
#             count += 2
#             answer.append(count)
#             progresses.pop(0)
#             progresses.pop(0)
#         else:
#             count += 1
#             answer.append(count)
#             progresses.pop(0)
            
    return answer