class stack:
    def __init__ (self):
        self.stack=[]
        
    def is_empty(self):
        return self.stack==[]
    
    def push(self,v):
        self.stack.append(v)
    
    def pop(self):
        v=None
        
        if not self.is_empty():
            v=self.stack.pop()
        return v
    
    def __str__(self):
        return str(self.stack)
    
#main

st=stack()
st.push(10)
st.push(20)
st.push(30)

print(st)

print(st.pop())
print(st.pop())

print(st)