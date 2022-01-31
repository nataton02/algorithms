public class VertexService {

    public int countHeight(Vertex root) {
        int rightHeight = 0;
        int leftHeight = 0;

        if(root.leftChild != null) {
            leftHeight = 1;
            leftHeight += countHeight(root.leftChild);
        }

        if(root.rightChild != null) {
            rightHeight = 1;
            rightHeight += countHeight(root.rightChild);
        }

        if (rightHeight > leftHeight) {
            return rightHeight;
        } else {
            return leftHeight;
        }
    }

    public int countVertices(Vertex root) {
        int count = 1;
        if(root.leftChild != null) {
            count += countVertices(root.leftChild);
        }

        if(root.rightChild != null) {
            count += countVertices(root.rightChild);
        }

        return count;
    }
}
