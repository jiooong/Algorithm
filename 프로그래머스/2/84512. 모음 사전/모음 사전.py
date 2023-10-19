from itertools import product
#모든 조합을 다 찾아서 몇번째 단어인지 찾기 
def solution(word):
    answer = 0
    words = []
    arr = ['A', 'E', 'I', 'O', 'U']
    for j in range(1,6):
        for i in product(arr, repeat=j):
            words.append(''.join(list(i)))
  
    words.sort()
    answer = words.index(word) + 1 
        
    return answer