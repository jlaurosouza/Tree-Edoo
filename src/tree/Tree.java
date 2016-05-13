package tree;

public class Tree {

    private Node root;

    public static void main(String[] args) {
        Tree t = new Tree();
        
        String[] valor = new String[11];

        valor[0] = "8";
        valor[1] = "3";
        valor[2] = "11";
        valor[3] = "1";
        valor[4] = "5";
        valor[5] = "9";
        valor[6] = "16";
        valor[7] = "4";
        valor[8] = "7";
        valor[9] = "12";
        valor[10] = "18";
        
        
        for (int i = 0; i < 11; i++) {
            if (t.root == null){
                t.root = new Node();
                System.out.println(valor[i] + " é a Raiz!");
                t.root.setContent(valor[i]);
            }else{
                t.root.addContent(t.root, valor[i], valor[0]);
            }
        }
    }

}
