for i in range (1, 11):
    
    T = int(input())
    N = [list(map(int, input().split())) for _ in range (100)]
    
    
    x = 0 
    #가로
    for j in range(100):
        sum = 0
        for z in range (100):
            sum += N[j][z]
        if sum > x:
            x = sum
                
    
    y = 0
    for j in range(100):
        sum = 0
        for z in range (100):
            sum += N[z][j]
        if sum > y:
            y = sum
    
    xy = 0
    yx = 0
    fin = 0
    for j in range(100):       
        xy += N[j][j]
        yx += N[j][99-i]
        
    if max(xy, yx) > fin:
        fin = max(xy,yx)

            
    print("#{} {}".format(i, max(x,y,xy,yx)))
