public class Trie {
    // tree node class
    static class Node {
        public Node[] children;
        public int wordCount;

        public Node() {
            children = new Node[26];
            wordCount = 0;
        }
    }


    public Node root = null;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node current = root;

        for (int i = 0; i < word.length(); i++) {
            int currentChar = word.charAt(i) - 'a';

//            if the node does not exist yet, then we create it, otherwise we
//            move down the tree.
            if (current.children[currentChar] == null) {

                // insert into the tree a new node at that index
                current.children[currentChar] = new Node();
            }

            current = current.children[currentChar];

        }

//        increment the wordCount to indicate that the word ends here.
        current.wordCount++;
    }


    public boolean search(String word) {
        Node current = root;

        for (int i = 0; i < word.length(); i++) {
            int currentChar = word.charAt(i) - 'a';

            if (current.children[currentChar] == null) {
                return false;
            }

            current = current.children[currentChar];

        }

//        increment the wordCount to indicate that the word ends here.
        return current.wordCount > 0;
    }

    public boolean startsWith(String prefix) {
        Node current = root;

        for (int i = 0; i < prefix.length(); i++) {
            int currentChar = prefix.charAt(i) - 'a';

            if (current.children[currentChar] == null) {
                return false;
            }

            current = current.children[currentChar];

        }
        return true;
    }

    public static void main(String[] args) {
        Trie obj = new Trie();

    }
}

/**
 * Your Trie object will be instantiated and called as such: Trie obj = new
 * Trie(); obj.insert(word); boolean param_2 = obj.search(word); boolean param_3
 * = obj.startsWith(prefix);
 */

