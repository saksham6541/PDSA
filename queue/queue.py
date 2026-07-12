class queue:
    
    
    def __init__(self):
        self.queue=[]
    
    def is_empty(self):
        return self.queue==[]
    
    def enqueue(self,v):
        self.queue.append(v)
        
    def dequeue(self):
        v=None
        if not self.is_empty():
            v=self.queue[0]
            self.queue=self.queue[1:]
        return v
    
    
    def __str__(self):
        return str(self.queue)
    
    
#main
q=queue()
q.enqueue(1)
q.enqueue(2)
q.enqueue(3)

print(q)    

print(q.dequeue())
print(q.dequeue())

print(q)