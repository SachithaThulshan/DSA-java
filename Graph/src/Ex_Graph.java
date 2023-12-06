public class Ex_Graph {
    class Edge{
        int node, dest;
    }

    int vertices, edges;
    Edge[] edge;

    Ex_Graph(int vertices, int edges){
        this.vertices = vertices;
        this.edges = edges;
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {
            edge[i] = new Edge();

        }
    }

    public static void main(String[] args) {
        int noVertices = 9;
        int noEdges = 12;

        Ex_Graph g = new Ex_Graph(noVertices,noEdges);
        g.edge[0].node = 1;
        g.edge[0].dest = 5;
        g.edge[1].node = 1;
        g.edge[1].dest = 6;
        g.edge[2].node = 1;
        g.edge[2].dest = 2;
        g.edge[3].node = 2;
        g.edge[3].dest = 6;
        g.edge[4].node = 2;
        g.edge[4].dest = 7;
        g.edge[5].node = 2;
        g.edge[5].dest = 3;
        g.edge[6].node = 3;
        g.edge[6].dest = 7;
        g.edge[7].node = 3;
        g.edge[7].dest = 4;
        g.edge[8].node = 6;
        g.edge[8].dest = 8;
        g.edge[9].node = 6;
        g.edge[9].dest = 9;
        g.edge[10].node = 6;
        g.edge[10].dest = 7;
        g.edge[11].node = 7;
        g.edge[11].dest = 9;
        for (int i = 0; i < noEdges; i++) {
            System.out.println(g.edge[i].node + " - " + g.edge[i].dest);
        }
    }
}
