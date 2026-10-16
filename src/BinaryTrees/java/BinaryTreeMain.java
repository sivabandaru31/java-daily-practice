package BinaryTrees.java;

import java.util.Scanner;

public class BinaryTreeMain  {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BinaryTree tree=new BinaryTree();
        Node root;
        root=tree.createTree(scanner);
        System.out.println(root.data);
    }
}
