public class BST<E extends Comparable<E>> extends AbstractTree<E>{
    protected TreeNode<E> root;
    protected int size = 0;
    protected TreeNode<E> createNewNode(E element) {
        return new TreeNode<>(element);
    }

    public BST() {}

    public BST(E[] objects) {
        for (int  i = 0; i < objects.length; i++) {
            insert(objects[i]);
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean insert(E element) {
        if (root == null)
            root = createNewNode(element);
        else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (element.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (element.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false;
            }
            if (element.compareTo(current.element) < 0) {
                parent.left = createNewNode(element);
            } else
                parent.right = createNewNode(element);
        }
        size++;
        return true;
    }

    @Override
    public void inorder() {
        inorder(root);
    }
    protected void inorder(TreeNode<E> root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }
}
