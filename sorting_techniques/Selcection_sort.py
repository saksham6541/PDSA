l=["d34", "g54", "d12", "b87", "g1", "c65", "g40", "g5", "d77"]
l.sort()
c=l[0][0]
a=[]
l1=[]
for j in range(len(l)):
    print(l[j][0])
    if(l[j][0]== c):
        a.append(l[j])
    else:
        print("-------------->a")
        for n in a:
            print(n)
        a.sort()
        l1.append(a)
        a=[]
        c=l[j][0]
        j=j-1
        print("--------------->",c)
a.sort()
l1.append(a)
for i in l1:
    print(i)