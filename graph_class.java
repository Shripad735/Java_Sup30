import java.util.Scanner;

public class graph_class {
    int AdjMat[][] , Nodes , Visited[];
    Scanner sc = new Scanner(System.in);
    void create_graph(int n) {
        Nodes = n;
        AdjMat = new int[Nodes][Nodes];
        Visited = new int[Nodes];
    }

    void set_graph(){
        for(int source=0;source<Nodes;source++)
        {
            for(int dest=0;dest<Nodes;dest++)
            {
                System.out.println("Enter cost between "+source+" and "+dest);
                AdjMat[source][dest] = sc.nextInt();
            }
        }
    }

    void display_graph(){
        System.out.println("The adjacency matrix is : ");
        for(int source=0;source<Nodes;source++)
        {
            for(int dest=0;dest<Nodes;dest++)
            {
                System.out.print(AdjMat[source][dest] + "\t");
            }
            System.out.println();
        }
    }

    void dfs(int source){
        System.out.print("V"+source + " ");
        Visited[source] = 1;
        for(int dest=0;dest<Nodes;dest++)
        {
            if(AdjMat[source][dest] == 1 && Visited[dest] == 0)
            {
                dfs(dest);
            }
        }
    }

    void BFS(int source){
        int queue[] = new int[Nodes];
        int front = 0, rear = -1;
        queue[++rear] = source;
        Visited[source] = 1;
        while(front <= rear)
        {
            int element = queue[front++];
            System.out.print("V"+element + " ");
            for(int dest=0;dest<Nodes;dest++)
            {
                if(AdjMat[element][dest] == 1 && Visited[dest] == 0)
                {
                    queue[++rear] = dest;
                    Visited[dest] = 1;
                }
            }
        }
    } 

    public static void main(String[] args) {
        graph_class g = new graph_class();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes");
        n = sc.nextInt();
        g.create_graph(n);
        g.set_graph();
        g.display_graph();
        System.out.println("DFS traversal is : ");
        g.dfs(0);
        System.out.println();
        for(int i=0;i<n;i++)
            g.Visited[i] = 0;
        System.out.println("BFS traversal is : ");
        g.BFS(0);   
    }
}
