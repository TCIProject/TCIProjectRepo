package webapp.crawler;

import java.util.ArrayList;

public class Node {
    private boolean isVisited;
    private Node parent;
    private ArrayList<Node> nodes;
    private String JSONString;
    private String URLLink;

    public Node(boolean isVisited, Node parent, String JSONString, String URLLink) {
        this.isVisited = isVisited;
        this.parent = parent;
        this.JSONString = JSONString;
        this.URLLink = URLLink;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void setNodes(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }

    public void setJSONString(String JSONString) {
        this.JSONString = JSONString;
    }

    public void setURLLink(String URLLink) {
        this.URLLink = URLLink;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public Node getParent() {
        return parent;
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public String getJSONString() {
        return JSONString;
    }

    public String getURLLink() {
        return URLLink;
    }
}
