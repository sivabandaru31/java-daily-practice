package BinaryTrees.java;
import java.util.Scanner;
public class BinaryTree {
      Node createTree( Scanner scanner){
        System.out.println("enter Node data (-1 for null");
        int value= scanner.nextInt();
        if(value== -1){
            return null;
        }
        Node newNode=new Node(value);
        System.out.println("do you want  to left chaild "+value);
        boolean left=scanner.nextBoolean();
        if(left){
           newNode.left= createTree(scanner);
        }

        System.out.println("do you want to right chaild "+value);

        boolean right=scanner.nextBoolean();
        if(right){
            newNode.right=createTree(scanner);
        }

        return newNode;
    }

}
