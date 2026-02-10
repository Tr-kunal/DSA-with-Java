package BinaryTree;

import java.util.*;

public class BinaryTree {
    static Scanner sc = new Scanner(System.in);

    public static BinaryTreeNode<Integer> takeInput() {
        System.out.println("Enter the root data");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
        System.out.println("Enter the left children data of " + root.data);
        root.left = takeInput();
        System.out.println("Enter the right children data of " + root.data);
        root.right = takeInput();

        return root;
    }

    public static void print(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data);
        if (root.left != null) {
            System.out.print(root.left.data + " ");
        }
        if (root.right != null) {
            System.out.print(root.right.data);
        }
        System.out.println();
        print(root.left);
        print(root.right);
    }

    public static boolean findNode(BinaryTreeNode<Integer> root, int x) {
        if (root == null)
            return false;
        if (root.data == x) {
            return true;
        }
        boolean ans = findNode(root.left, x) || findNode(root.right, x);
        return ans;
    }

    public static int height(BinaryTreeNode<Integer> root) {
        if (root == null)
            return 0;

        int max = 0;
        int lh = height(root.left);
        int rh = height(root.right);

        max = Math.max(lh, rh);
        return 1 + max;
    }

    public static BinaryTreeNode<Integer> arrToBinaryTree(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        return arrToBinaryTreeHelper(arr, 1);
    }

    private static BinaryTreeNode<Integer> arrToBinaryTreeHelper(int[] arr, int idx) {
        if (idx >= arr.length || arr[idx] == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[idx]);
        root.left = arrToBinaryTreeHelper(arr, 2 * idx);
        root.right = arrToBinaryTreeHelper(arr, 2 * idx + 1);

        return root;
    }

    public static void preOrderBTPrint(BinaryTreeNode<Integer> root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrderBTPrint(root.left);
        preOrderBTPrint(root.right);
    }

    public static void main(String args[]) {
        BinaryTreeNode<Integer> root = takeInput();
        // print(root);
        // int x = sc.nextInt();
        // System.out.println(findNode(root, x));
        // System.out.println(height(root));
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        // int[] arr = new int[sc.nextInt()];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // BinaryTreeNode<Integer> ans = arrToBinaryTree(arr);
        // print(ans);
        preOrderBTPrint(root);


    }
}
