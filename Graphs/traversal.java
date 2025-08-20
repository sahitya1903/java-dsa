import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class traversal{
    static class Edge{
        int src;
        int dest;
        int wt;
        
        public Edge(int s,int d,int w) {
            this.src=s;
            this.dest=d;
            this.wt=w;            
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {       //O(n)
        for (int i=0;i<graph.length;i++) {
            graph[i]=new ArrayList<>();
        }

        //vertex 0
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        //vertex 1
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));
        
        //vertex 2
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        //vertex 3
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        //vertex 4
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        //vertex 5
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        //vertex 6
        graph[6].add(new Edge(6,5,1));
    }

    public static void bfs(ArrayList<Edge>[] graph) {
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if (!vis[i]) {
                bfsUtil(graph, vis,i);
            }
        }      
    }
    public static void bfsUtil(ArrayList<Edge> [] graph,boolean vis[],int src) {      //O(V+E)
        Queue<Integer> q=new LinkedList<>();
        q.add(src);       //source-->0

        while (!q.isEmpty()) {
            int curr=q.remove();

            if (!vis[curr]) {       //visit curr
                System.out.print(curr+" ");
                vis[curr]=true;
                for (int i=0;i<graph[curr].size();i++) {
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    public static void dfs(ArrayList<Edge> [] graph) {
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if (!vis[i]) {
                dfsUtil(graph, i, vis);
            }
        }
    }

    public static void dfsUtil(ArrayList<Edge> [] graph,int curr, boolean vis[]) {  //O(V+E)
        System.out.print(curr+" ");
        vis[curr]=true;

        for (int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if (!vis[e.dest]) {
                dfsUtil(graph,e.dest,vis);
            }
        }
    }

    public static boolean hasPath(ArrayList<Edge>[] graph,int src,int dest,boolean vis[]){
        if (src==dest) {
            return true;
        }
        vis[src]=true;

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e=graph[src].get(i);
            if (!vis[e.dest] && hasPath(graph, e.dest, dest, vis)) {
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked") 
    public static void main(String[] args) {
        int V=7;
        ArrayList <Edge> [] graph=new ArrayList[V];

        createGraph(graph);
        bfs(graph);
        dfs(graph);
        System.out.println();
        System.out.println(hasPath(graph, 0, 5,new boolean[V]));
    }
}
