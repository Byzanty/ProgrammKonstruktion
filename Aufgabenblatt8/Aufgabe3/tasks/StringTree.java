class StringTree {

    private class Node {

        String elem;
        Node left = null;
        Node right = null;

        Node(String elem) {
            this.elem = elem;
        }

        void add(String elem) {
            //TODO Implementieren Sie hier die Angabe
        }

        int height() {
            //TODO Implementieren Sie hier die Angabe
            return -1; //diese Anweisung ändern oder löschen.
        }

        void printLeaves() {
            //TODO Implementieren Sie hier die Angabe
        }

        void printInOrderUp() {
            //TODO Implementieren Sie hier die Angabe
        }

        void printPostOrder() {
            //TODO Implementieren Sie hier die Angabe
        }

        void printPreOrder() {
            //TODO Implementieren Sie hier die Angabe
        }

        void printLevelOrder(int level) {
            //TODO Implementieren Sie hier die Angabe
        }
        
        void printNodesStartingWith(char letter) {
            //TODO Implementieren Sie hier die Angabe
        }
        
        @Override
        public String toString() {
            //TODO Implementieren Sie hier die Angabe
            return null; //TODO Anweisung ändern oder löschen.
        }
    }

    private Node root = null;

    public void add(String elem) {
        if (empty()) {
            this.root = new Node(elem);
        } else {
            this.root.add(elem);
        }
    }

    public boolean empty() {
        return this.root == null;
    }

    public int height() {
        if (this.root == null) {
            return 0;
        }
        return this.root.height();
    }

    public void printLeaves() {
        if (this.root != null) {
            this.root.printLeaves();
        }
    }

    public void printInOrderUp() {
        if (this.root != null) {
            this.root.printInOrderUp();
        }
    }

    public void printPostOrder(){
        if(this.root != null){
            this.root.printPostOrder();
        }
    }

    public void printPreOrder(){
        if(this.root != null){
            this.root.printPreOrder();
        }
    }

    public void printLevelOrder(){
        // TODO Implementieren Sie hier die Angabe
    }
    
    public void printNodesStartingWith(char letter){
        if(this.root != null){
            this.root.printNodesStartingWith(letter);
        }
    }
    
    @Override
    public String toString() {
        // TODO Implementieren Sie hier die Angabe
        return null; //TODO Anweisung ändern oder löschen.
    }
}

