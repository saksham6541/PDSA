class Queue:
    def __init__(self):
        self.queue=[]
    
    def enqueue(self,value):
        self.queue.append(value)
        
    def dequeue(self):
        if not self.isempty():
            value = self.queue[0]
            self.queue=self.queue[1:]
            return value
        return None
    
    def isempty(self):
        return self.queue == []
    
    
    def __str__(self):
        return str(self.queue)
    
def topological_s(AList):
    
    indegree={}
    for i in AList:
        indegree[i]=0
        
    for vertex in AList:
        for neighbour in AList[vertex]:
            indegree[neighbour]+=1
    
    q=Queue()
    
    for vertex in AList:
        if indegree[vertex] == 0:
            q.enqueue(vertex)
            
    topo=[]
    
    while not q.isempty():
        
        current = q.dequeue()
        topo.append(current)
        
        for neighbour in AList[current]:
            
            indegree[neighbour]-=1
            
            if indegree[neighbour]==0:
                q.enqueue(neighbour)
                
            
    if len(topo) != len(AList):
        return "Graph contains a cycle"
    
    return topo

AList = {
    0: [2, 3, 4],
    1: [2, 7],
    2: [5],
    3: [5, 7],
    4: [7],
    5: [6],
    6: [7],
    7: []
}

print("Topological Order:")
print(topological_s(AList))