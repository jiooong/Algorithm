import sys
N = int(sys.stdin.readline())
k=[]
for _ in range(N):
    word = sys.stdin.readline().split()
    order = word[0] #명령어 받기

    if order=="push":
        value = word[1]
        k.append(value)

    elif order=="pop":
        if len(k)==0:
            print(-1)
        else:
            print(k.pop())

    elif order=="size":
        print(len(k))

    elif order=="empty":
        if len(k)==0:
            print(1)
        else:
            print(0)
    elif order == "top":
        if len(k)==0:
            print(-1)
        else:
            print(k[-1])
