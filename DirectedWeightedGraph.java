class Node {
    int vertex;
    int weight;
    Node next;

    Node(int v, int w) {
        vertex = v;
        weight = w;
        next = null;
    }
}

class DirectedWeightedGraph {
    int vertices;
    Node[] adjList;

    DirectedWeightedGraph(int v) {
        vertices = v;
        adjList = new Node[vertices];
    }
    void addEdge(int src, int dest, int weight) {
        Node newNode = new Node(dest, weight);
        newNode.next = adjList[src];
        adjList[src] = newNode;
    }

    void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " -> ");
            Node temp = adjList[i];
            while (temp != null) {
                System.out.print("(" + temp.vertex + ", w=" + temp.weight + ") ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DirectedWeightedGraph g = new DirectedWeightedGraph(5); 

        g.addEdge(0, 1, 3);
        g.addEdge(0, 4, 2);
        g.addEdge(1, 2, 6);
        g.addEdge(2, 3, 1);
        g.addEdge(4, 2, 4);

        g.printGraph();
    }
}
