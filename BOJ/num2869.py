a,b,v = map(int, input().split())

k = v-b
day = a-b
count = k % day

if count == 0:
    print(k // day)
else:
    print((k // day)+1)

