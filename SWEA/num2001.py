case = int(input())

for i in range(1, case+1):

    n,m = map(int, input().split())
    matrix = [list(map(int,input().split())) for i in range(n)]

    addlist = []

    for s in range(n-m+1):
        for k in range(n-m+1):
            total = 0
            for _ in range(m):
                for __ in range(m):
                    total += matrix[s+_][k+__]
            addlist.append(total)

    print('#{} {}'.format(i,max(addlist)))
