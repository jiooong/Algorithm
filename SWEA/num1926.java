T = int(input())
clap = ["3","6","9"]

for i in range(1,T+1):
    i = str(i)    
    clap = i.count("3") +i.count("6")+i.count("9")
    
    if clap==0:
        print(i, end=" ")
    else:
        print("-"*clap,end=" ")
        
