import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class cloneGraph_133 {
    static class Node {
        public int val;
        public ArrayList<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public Node helper(HashMap<Node, Node> map, Node node) {
        if (map.containsKey(node)) {
            return map.get(node);
        }

        Node clone = new Node(node.val, new ArrayList());

        map.put(node, clone);

        for (int i = 0; i < node.neighbors.size(); i++) {
            clone.neighbors.add(helper(map, node.neighbors.get(i)));
        }

        return clone;
    }

    public Node cloneGraph(Node node) {
        if (node == null) return null;
        HashMap<Node, Node> map = new HashMap<>();
        return helper(map, node);
    }
}
