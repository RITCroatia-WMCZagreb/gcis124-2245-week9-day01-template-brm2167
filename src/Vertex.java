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
     * Gets the value stored in the vertex.
     * @return the value stored in the vertex
     */
    public E getValue() {
        return this.value;
    }
}
