import heapq

def solution(scoville, K):
    answer = 0
    heap = []

    for i in scoville:
        heapq.heappush(heap, i)
            
    while len(heap) > 1:
        cur = heapq.heappop(heap)
        if cur >= K:
            break
        cur2 = heapq.heappop(heap)

        heapq.heappush(heap, cur + (cur2*2))
        answer += 1
     
    if len(heap) != 0:
        if heapq.heappop(heap) < K:
            answer = -1
            
    return answer