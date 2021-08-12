package trees;

public class BinarySearchTree extends BinaryTree{
    Node root;
    public BinarySearchTree(Node root) {
        this.root=root;
    }
    public void add(Node newNode,Node rootExplore) {
        if (rootExplore == null) {
            return;
        }
        if (newNode.data > rootExplore.data) {
            if (rootExplore.rightChild == null)
                rootExplore.rightChild = newNode;
            else
                add(newNode, rootExplore.rightChild);

        }
        if (newNode.data < rootExplore.data) {
            if (rootExplore.leftChild == null)
                rootExplore.leftChild = newNode;
            else
                add(newNode, rootExplore.leftChild);
        }
    }
    public boolean contain(int value,Node rootExplore){
        if(rootExplore==null){
            try {
                throw new Exception("Value can't found");
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        if(rootExplore.data==value){
            System.out.println("Value found");
            return true;
        }
        if(value>rootExplore.data){
            contain(value,rootExplore.rightChild);

        }
        if(value<rootExplore.data){
            contain(value,rootExplore.leftChild);
        }
        return false;
    }
}
