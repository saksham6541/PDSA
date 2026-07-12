from collections import deque

def bfs(graph,start):
    n=len(graph)#length of the graph
    visited=[False]*n # a list to keep the check on whcih all nodes are visited
    
    q=deque() # a queue to keep track of the nodes
    q.append(start) # appending the first node the node from where we will start the BFS
    visited[start]=True # marking the starting node are visited
    
    while q: # iterarting over the queue till it becomes empty
        node=q.popleft()# removing the first node from the queue
        print(node, end=" ")# printing that node
        
        for neighbour in graph[node]: # checking all the neighbour of the node 
            if not visited[neighbour]:# if the neighbour is not marked visted will add in the queue
                q.append(neighbour) # adding the not visited neighbour of the node to the queue
                visited[neighbour]=True # marking that neighbour as visited
                
                
graph = [
    [1,2],
    [0,3,4],
    [0,5],
    [1],
    [1],
    [2]
] # an example graph to check the iteration of the BFS

bfs(graph,0) # calling the graph function to perform the BFS 

# output => 0 1 2 3 4 5