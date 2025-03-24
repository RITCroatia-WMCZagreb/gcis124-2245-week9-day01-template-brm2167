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

    /**
     * Connects two vertexes in the graph with an umdirected connection between
     * a and b.
     * @param a the value in the first vertex to connect
     * @param b the value in the second vertex to connect
     * @throws NoSuchElementException if no vertex with value a or b exists in
     * the graph
     */
    @Override
    public void connectUndirected(E a, E b) {
        if (!(contains(a) && contains(b))) throw new NoSuchElementException();
        Vertex<E> vA = vertices.get(a);
        Vertex<E> vB = vertices.get(b);
        vA.connect(vB);
        vB.connect(vA);
    }

    /**
     * Checks if a vertex with the value a is connected to a vertex with the
     * value b.
     * @param a the value in the vertex to check if b is connected to
     * @param b the value in the vertex to check if it is connected to a
     * @throws NoSuchElementException if no vertex with value a or b exists in
     * the graph
     * @returns if a vertex with the value a is connected to a vertex with the
     * value b
     */
    @Override
    public boolean connected(E a, E b) {
        if (!(contains(a) && contains(b))) throw new NoSuchElementException();
        Vertex<E> vA = vertices.get(a);
        Vertex<E> vB = vertices.get(b);
        return vA.connected(vB);
    }
    
}
