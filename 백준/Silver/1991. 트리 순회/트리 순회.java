import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Node{
        Node left;
        Node right;
        char data;
        Node(char data){
            this.data = data;
        }
}
class Tree{
    public Node root;

    public void createNode(char data, char leftdata , char rightdata ){
        if(root == null){
        root = new Node(data);
            root.left = (leftdata != '.') ? new Node(leftdata) : null;
            root.right = (rightdata != '.') ? new Node(rightdata) : null;

        }else{
            searchNode(root, data, leftdata, rightdata);
        }
    }

    public void searchNode(Node node, char data, char leftData, char rightData){
        if(node == null){ // 노드가 없는 자식 노드에 오면 끝 !
            return;
        }
        else if(node.data == data){
            node.left = (leftData != '.') ? new Node(leftData) : null;
            node.right = (rightData != '.') ? new Node(rightData) : null;

        }else{
            searchNode(node.left, data, leftData, rightData);
            searchNode(node.right, data, leftData, rightData);
        }
    }

    public void preOrder(Node node){
        if(node != null) {
            System.out.print(node.data);
            if(node.left != null) { preOrder(node.left);}
            if(node.right != null) {preOrder(node.right);}
        }
    }
    public void inOrder(Node node){
        if(node!=null){
            if(node.left != null) {inOrder(node.left);}
            System.out.print(node.data);
            if(node.right != null) {inOrder(node.right);}
        }

    }
    public void postOrder(Node node){
        if(node!=null) {
            if (node.left != null) {
                postOrder(node.left);
            }
            if (node.right != null) {
                postOrder(node.right);
            }
            System.out.print(node.data);
        }
    }
}


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        Tree tree = new Tree();
        for(int i=0; i<num; i++){
            char[] str = br.readLine().toCharArray();
            char root = str[0];
            char left = str[2];
            char right = str[4];
            tree.createNode(root, left, right);
        }

        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
        System.out.println();

    }
}
