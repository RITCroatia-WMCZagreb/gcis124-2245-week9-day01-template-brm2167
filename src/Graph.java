/*
@ASSESSME.USERID: brm2167
@ASSESSME.AUTHOR: Benjamin R. Metzger
@ASSESSME.DESCRIPTION: CLASSACTIVITY
@ASSESSME.ANALYZE: YES
*/

public interface Graph<E> {
    void add(E value);
    boolean contains(E value);
    int size();
    void connectDirected(E a, E b);
    void connectUndirected(E a, E b);
    boolean connected(E a, E b);
}
