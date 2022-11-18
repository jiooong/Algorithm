for i in range (1, 11):
    
    T = int(input())
    N = list(map(int,input().split()))
    
    for j in range (T):
        
        maxNumInde = N.index(max(N))
        minNumInde = N.index(min(N))
        
        N[maxNumInde] = N[maxNumInde] - 1 
        N[minNumInde] = N[minNumInde] + 1 
        
    print("#{} {}".format(i,  max(N)-min(N)))    
