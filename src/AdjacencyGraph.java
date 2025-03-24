/*
@ASSESSME.USERID: brm2167
@ASSESSME.AUTHOR: Benjamin R. Metzger
@ASSESSME.DESCRIPTION: CLASSACTIVITY
@ASSESSME.ANALYZE: YES
*/

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class AdjacencyGraph<E> implements Graph<E> {
    private Map<E, Vertex<E>> vertices = new HashMap<>();

    /**
     * Creates a new vertex for a value and puts it into the vertices map.
     * @param value the value to be contained in the vertex
     */
    @Override
    public void add(E value) {
        this.vertices.put(value, new Vertex<E>(value));
    }

    /**
     * Checks if a value exists in the graph.
     * @param value the value to check for
     */
    @Override
    public boolean contains(E value) {
        return this.vertices.containsKey(value);
    }

    /**
     * Gets the size of the graph.
     * @return the size of the graph
     */
    @Override
    public int size() {
        return this.vertices.size();
    }

    /**
     * Connects two vertexes in the graph with a directed connection from a to
     * b.
     * @param a the value in the vertex to connect b to
     * @param b the value in the vertex to connect to a
     * @throws NoSuchElementException if no vertex with value a or b exists in
     * the graph
     */
    @Override
    public void connectDirected(E a, E b) {
        if (!(contains(a) && contains(b))) throw new NoSuchElementException();
        vertices.get(a).connect(vertices.get(b));;
    }

    @Override
    public void connectUndirected(E a, E b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'connectUndirected'");
    }

    @Override
    public boolean connected(E a, E b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'connected'");
    }
    
}
