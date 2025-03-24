/*
@ASSESSME.USERID: brm2167
@ASSESSME.AUTHOR: Benjamin R. Metzger
@ASSESSME.DESCRIPTION: CLASSACTIVITY
@ASSESSME.ANALYZE: YES
*/

import java.util.HashMap;
import java.util.Map;

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

    @Override
    public void connectDirected(E a, E b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'connectDirected'");
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
