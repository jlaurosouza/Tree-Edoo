package tree;

public class Node {

    private Node left;
    private Node right;
    private String content;

    public void addContent(Node root, String valor, String raiz) {
        Node n = new Node();
        n.setContent(valor);

        int NewValor = Integer.parseInt(valor);
        int Raiz = Integer.parseInt(raiz);

        if (NewValor <= Raiz) {
            addLeft(root, n);
        } else {
            addRight(root, n);
        }
    }

    public boolean addRight(Node root, Node right) {
        if (root.right == null) {
            root.right = right;
            System.out.println(right.content + " Fica a Direita de " + root.content);
            return true;
        } else {

            int v = Integer.parseInt(right.content);
            int r = Integer.parseInt(root.right.content);

            if (v <= r) {
                addLeft(root.right, right);
            } else {
                addRight(root.right, right);
            }
            return true;
        }
    }

    public boolean addLeft(Node root, Node left) {
        if (root.left == null) {
            root.left = left;
            System.out.println(left.content + " Fica a Esquerda de " + root.content);
            return true;
        } else {
            int v = Integer.parseInt(left.content);
            int r = Integer.parseInt(root.left.content);

            if (v <= r) {
                addLeft(root.left, left);
            } else {
                addRight(root.left, left);
            }
            return true;
        }
    }

    public void removeRight() {
        this.right = null;
    }

    public void removeLeft() {
        this.left = null;
    }

    public int degree() {
        if ((this.right == null) & (this.left == null)) {
            return 0;
        } else if ((this.right != null) | (this.left != null)) {
            return 1;
        } else {
            return 2;
        }
    }

    public String getContent(Node no) {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
