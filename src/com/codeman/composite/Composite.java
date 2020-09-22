package com.codeman.composite;

import java.util.Vector;

/**
 * 组合模式
 * @author pengyangyan
 * @version 1.0.0
 * @date 2020年09月22日 08:18:00
 */
public class Composite {
    private TreeNode root = null;

    public Composite(String name){
        root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Composite composite = new Composite("A");
        TreeNode b = new TreeNode("B");
        TreeNode c = new TreeNode("C");
        composite.root.add(b);
        b.add(c);
        System.out.println("Tree build");
        System.out.println(composite.root);

    }

}


class TreeNode {
    private TreeNode parent;

    private Vector<TreeNode> children = new Vector<>();

    private String name;

    public TreeNode(String name){
        this.name = name;
    }


    //add
    public void add(TreeNode treeNode){
        children.add(treeNode);
    }

    public void remove(TreeNode treeNode){
        children.remove(treeNode);
    }

    public Vector<TreeNode> getChildren(){
        return children;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "parent=" + parent +
                ", children=" + children +
                ", name='" + name + '\'' +
                '}';
    }
}