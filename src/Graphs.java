/*
@ASSESSME.USERID: brm2167
@ASSESSME.AUTHOR: Benjamin R. Metzger
@ASSESSME.DESCRIPTION: CLASSACTIVITY
@ASSESSME.ANALYZE: YES
*/

public class Graphs {
    /**
     * Creates the graph shown in the exercise.
     * @return the graph shown in the exercise
     */
    public static Graph<String> makeGraph() {
        Graph<String> graph = new AdjacencyGraph<>();

        for (int i = 65; i <= 75; i++) graph.add(Character.toString((char) i));
        graph.connectUndirected("A", "B");
        graph.connectDirected("A", "C");
        graph.connectUndirected("B", "E");
        graph.connectUndirected("C", "D");
        graph.connectUndirected("C", "E");
        graph.connectDirected("C", "H");
        graph.connectDirected("D", "B");
        graph.connectUndirected("D", "F");
        graph.connectDirected("E", "F");
        graph.connectUndirected("F", "G");
        graph.connectUndirected("I", "K");
        graph.connectDirected("J", "I");
        graph.connectUndirected("J", "K");

        return graph;
    }
}
