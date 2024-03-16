from collections import deque

def solution(bridge_length, weight, truck_weights):
    # 다리를 건널때는 무조건 bridge_length 만큼 걸린다 
    time = 0 # 경과 시간
    rem = 0
    bridge = deque([0]*bridge_length)
    # 1대인 경우
    if len(truck_weights) == 1:
        return bridge_length + 1
    # 여러대인 경우
    while len(truck_weights) != 0:
        time += 1 
        rem -= bridge.popleft()
        if rem + truck_weights[0] <= weight:
            rem += truck_weights[0]
            bridge.append(truck_weights.pop(0))
        else:
            bridge.append(0)
    return time+bridge_length