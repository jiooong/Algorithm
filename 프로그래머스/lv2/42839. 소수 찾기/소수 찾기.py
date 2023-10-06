from itertools import permutations
def solution(numbers):
    answer = 0
    num = []
    for i in range(1, len(numbers)+1):
        num.append(list(set(map(''.join, permutations(numbers, i)))))
    
    per = list(set(map(int, set(sum(num, [])))))
                   
    for p in per:
        if is_prime_number(p) == True:
                answer+=1
                  
    return answer

def is_prime_number(n):
    if n < 2:
        return False
    for i in range(2, n):
        if n%i ==0:
            return False
    return True