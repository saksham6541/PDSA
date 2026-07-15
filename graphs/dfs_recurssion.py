def dfs(node,graph,visited): # performing DFS using the recursive function 
    visited[node]=True # marking the node as visited
    print(node,end=" ") # printing the node which is visited
    
    for neighbour in graph[node]: # checking all the neighbours of the node that they are visited or not 
        if not visited[neighbour]: 
            dfs(neighbour,graph,visited) # calling the dfs function (recursive nature) to go deep in that particular branch


# driver's code
n = 5

graph = [[] for _ in range(n)]

graph[0].append(1)
graph[0].append(2)
graph[1].append(3)
graph[2].append(4)

visited = [False] * n

dfs(0, graph, visited)