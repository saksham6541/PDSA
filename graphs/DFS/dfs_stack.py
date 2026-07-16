def dfs(start,graph): # performing DFS using Stack 
    visited=[False]*len(graph) # list to keep a check whetehr the node has been visited or not 
    stack=[] # a stack to perform DFS
    
    stack.append(start) # appending the start point of the DFS
    
    while stack: # interating over the stack
        node= stack.pop() # taking out node from the Stack
        
        if visited[node]: # checking if the node is visited or not 
            continue
        
        visited[node]=True # marking the node as visited
        print(node,end=" ") # printing the node
        
        
        for neighbour in reversed(graph[node]): # iterating over the neighbour of node in the reversed order and appending in the stack 
            if not visited[neighbour]:
                visited[neighbour]=True
                stack.append(neighbour) # appending unvisited neighbour in the stack 
                
n = 5

graph = [[] for _ in range(n)]

graph[0].append(1)
graph[0].append(2)
graph[1].append(3)
graph[2].append(4)

dfs(0, graph)
            