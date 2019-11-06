package com.algorithms.trees;


public class AllPathsOfATree {

    static void printAllPathsDFS(TreeNode root){
        String pathString = "";
        printAllPathsDFS(root, pathString);
    }

    static void printAllPathsDFS(TreeNode root, String pathString){
        if(root == null) return;
        else{
            if(root.left == null && root.right == null){
                System.out.println(pathString + root.val);
                return;
            }
            if(root.left != null){
                printAllPathsDFS(root.left, pathString + root.val + " ");
            }
            if(root.right != null){
                printAllPathsDFS(root.right, pathString + root.val + " ");
            }
        }
    }


    public static void main(String[] args){
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node2.left = node4;
        node2.right = node5;
        node1.left = node2;
        node1.right = node3;

        printAllPathsDFS(node1);
    }

}
