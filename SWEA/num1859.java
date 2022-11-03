N = int(input())

for i in range(1,N+1):
    M = int(input())   
    num = list(map(int,input().split()))
    price = 0
    maxNum = num[-1]
    
    for j in range(M-1,-1,-1):
        if num[j]>maxNum:
            maxNum = num[j]
        price+=maxNum-num[j]
            
  
    print("#{} {}".format(i, price))
