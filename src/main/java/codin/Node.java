package main.java.codin;

 class Node {
    // keep these fields
    Node left, right;
    int value;

    public Node find(int v){
        Node current = this;

        while (current != this) {
            if(v == current.value){
                return current;
            } else if (v < current.value) {
                current =current.left;
            } else {
                current = current.right;
            }
        }
        return null;
    }
}
