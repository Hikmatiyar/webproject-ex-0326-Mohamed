package q1.extract_method.refactored;

import java.util.List;

public class A {
    Node m1(List<Node> nodes, String p) {
        printIfContains(nodes, p);
        // other implementation
        return null;
    }

    Edge m2(List<Edge> edgeList, String p) {
        printIfContains(edgeList, p);
        // other implementation
        return null;
    }

    private <T extends ContainsName> void printIfContains(List<T> list, String p) {
        for (T item : list) {
            if (item.contains(p)) {
                System.out.println(item.toString());
            }
        }
    }
}

class Node implements ContainsName {
    String name;

    @Override
    public boolean contains(String p) {
        return name.contains(p);
    }

    @Override
    public String toString() {
        return "Node{name='" + name + "'}";
    }
}

class Edge implements ContainsName {
    String name;

    @Override
    public boolean contains(String p) {
        return name.contains(p);
    }

    @Override
    public String toString() {
        return "Edge{name='" + name + "'}";
    }
}

interface ContainsName {
    boolean contains(String p);
}
