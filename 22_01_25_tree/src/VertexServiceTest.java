import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VertexServiceTest {
    VertexService vs = new VertexService();

    @Test
    public void test_countHeight_() {
        Vertex v1 = new Vertex(null, null);
        Vertex v2 = new Vertex(null, null);
        Vertex v8 = new Vertex(v1, v2);
        Vertex v4 = new Vertex(null, null);
        Vertex v3 = new Vertex(v4, v8);
        Vertex v6 = new Vertex(null, null);
        Vertex v5 = new Vertex(v6, v3);

        assertEquals(3, vs.countHeight(v5));
        assertEquals(1, vs.countHeight(v8));
        assertEquals(2, vs.countHeight(v3));
        assertEquals(0, vs.countHeight(v1));
    }

    @Test
    public void test_countHeight_oneVertex() {
        Vertex v1 = new Vertex(null, null);

        assertEquals(0, vs.countHeight(v1));
    }

    @Test
    public void test_countHeight_twoVertex() {
        Vertex v1 = new Vertex(null, null);
        Vertex v2 = new Vertex(v1, null);

        assertEquals(1, vs.countHeight(v2));
    }

    @Test
    public void test_countVertices_() {
        Vertex v1 = new Vertex(null, null);
        Vertex v2 = new Vertex(null, null);
        Vertex v8 = new Vertex(v1, v2);
        Vertex v4 = new Vertex(null, null);
        Vertex v3 = new Vertex(v4, v8);
        Vertex v6 = new Vertex(null, null);
        Vertex v5 = new Vertex(v6, v3);

        assertEquals(7, vs.countVertices(v5));
        assertEquals(3, vs.countVertices(v8));
        assertEquals(5, vs.countVertices(v3));
        assertEquals(1, vs.countVertices(v1));
    }

    @Test
    public void test_countVertices_oneVertex() {
        Vertex v1 = new Vertex(null, null);

        assertEquals(1, vs.countVertices(v1));
    }

    @Test
    public void test_countVertices_twoVertex() {
        Vertex v1 = new Vertex(null, null);
        Vertex v2 = new Vertex(v1, null);

        assertEquals(2, vs.countVertices(v2));
    }
}