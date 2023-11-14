def solution(numbers, target):
    def dfs(i, sums):
        if i == len(numbers):
            if sums == target:
                return 1
            else:
                return 0
        else:
            return dfs(i+1, sums + numbers[i]) + dfs(i+1, sums - numbers[i])            
                    
    return dfs(0,0)

