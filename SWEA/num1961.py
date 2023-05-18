n = int(input())
 
for iii in range(1, n+1):
    c = int(input())
    matrix = [list(map(int, input().split())) for i in range(c)]
 
    rotate = [[0]*c for _ in range(c)]
    rotate_180 = [[0] * c for _ in range(c)]
    rotate_270 = [[0] * c for _ in range(c)]
 
    for i in range(c):
        for j in range(c):
            rotate[j][c-i-1] = matrix[i][j] #90도 회전
            rotate_180[c-i-1][c-j-1] = matrix[i][j]
            rotate_270[c-j-1][i] = matrix[i][j]
 
    print('#{}'.format(iii))
    for j in range(c):
        print(''.join(list(map(str, rotate[j]))), end=' ') #join()은 split()의 반대
        print(''.join(list(map(str, rotate_180[j]))), end=' ')
        print(''.join(list(map(str, rotate_270[j]))))
