package employeebst;


import java.util.Comparator;

public class EmployeeBST {

    private class BinaryNode {
        Employee element;
        BinaryNode left;
        BinaryNode right;

        BinaryNode(Employee element) {
            this(element, null, null);
        }

        BinaryNode(Employee element, BinaryNode left, BinaryNode right) {
            this.element = element;
            this.left = left;
            this.right = right;
        }
    }

    private BinaryNode root;
    private Comparator<Employee> comparator;

    public EmployeeBST(Comparator<Employee> comparator) {
        this.comparator = comparator;
        root = null;
    }

    public void insert(Employee e) {
        root = insert(e, root);
    }

    private BinaryNode insert(Employee e, BinaryNode node) {
        if (node == null) {
            return new BinaryNode(e);
        }

        int compareResult = comparator.compare(e, node.element);
        if (compareResult < 0) {
            node.left = insert(e, node.left);
        } else if (compareResult > 0) {
            node.right = insert(e, node.right);
        } else {
            // Duplicate, do nothing
        }
        return node;
    }

    public void printTree() {
        printTree(root);
    }

    private void printTree(BinaryNode node) {
        if (node != null) {
            printTree(node.left);
            System.out.println(node.element);
            printTree(node.right);
        }
    }
}
