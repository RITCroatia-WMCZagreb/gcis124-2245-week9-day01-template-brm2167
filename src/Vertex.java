/*
@ASSESSME.USERID: brm2167
@ASSESSME.AUTHOR: Benjamin R. Metzger
@ASSESSME.DESCRIPTION: CLASSACTIVITY
@ASSESSME.ANALYZE: YES
*/

import java.util.HashSet;
import java.util.Set;

public class Vertex<E> {
    private E value;
    private Set<Vertex<E>> neighbors;

    /**
     * Creates a new vertex in a graph.
     * @param value the value to be stored in the vertex
     */
    public Vertex(E value) {
        this.value = value;
        neighbors = new HashSet<>();
    }

    /**
     * Connects this vertex with another.
     * @param neighbor the vertex to connect this vertex to
     */
    public void connect(Vertex<E> neighbor) {
        this.neighbors.add(neighbor);
    }

    /**
     * Checks if this vertex is connected to another.
     * @param other the vertex to check if this vertex is connected to
     * @return whether this vertex is connected to the other
     */
    public boolean connected(Vertex<E> other) {
        return this.neighbors.contains(other);
    }

    /**
     * Gets the set of neighbors of this vertex.
     * @return the set of neighbors of this vertex
     */
    public Set<Vertex<E>> getNeighbors() {
        return this.neighbors;
    }

    /**
     * Gets the value stored in the vertex.
     * @return the value stored in the vertex
     */
    public E getValue() {
        return this.value;
    }
}
