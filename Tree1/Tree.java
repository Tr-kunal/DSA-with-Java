package Tree1;

import java.util.*;
public class Tree {

	// DFS input way
	public static TreeNode takeInput(Scanner sc) {
		int data;
		System.out.println("Enter the Node Data");
		data = sc.nextInt();
		TreeNode root = new TreeNode(data);
		System.out.println("Enter the number of children of root: " + data);
		int child = sc.nextInt();

		for (int i = 0; i < child; i++) {
			System.out.println("Enter the " + (i + 1) + " child of " + data);
			TreeNode childNode = takeInput(sc);
			root.children.add(childNode);
		}
		return root;
	}

	public static TreeNode takeInputBFS(Scanner sc) {
		System.out.println("Enter Node data");
		int data = sc.nextInt();
		TreeNode root = new TreeNode(data);
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {
			TreeNode curr = q.remove();
			System.out.println("Enter number of children for " + curr.data + ":");
			int n = sc.nextInt();

			for (int i = 0; i < n; i++) {
				System.out.println("Enter " + (i + 1) + "child of " + curr.data + ":");
				int cData = sc.nextInt();

				TreeNode child = new TreeNode(cData);
				curr.children.add(child);
				q.add(child);
			}
		}
		return root;
	}

	// Printing
	public static void print(TreeNode root) {
		String s = "Root is " + root.data + " and children ";
		for (TreeNode child : root.children) {
			s += child.data + ", ";
		}
		System.out.println(s);
		for (TreeNode child : root.children) {
			print(child);
		}
	}

	public static void printBFS(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {
			TreeNode node = q.poll();

			String s = "Node is " + node.data + " and children ";
			for (TreeNode child : node.children) {
				s += child.data + ", ";
				q.add(child);
			}

			System.out.println(s);
		}
	}

	public static int countNode(TreeNode root) {
		int count = 1;
		for (TreeNode child : root.children) {
			count += countNode(child);
		}
		return count;
	}

	public static int sumNode(TreeNode root) {
		int sum = root.data;
		for (TreeNode child : root.children) {
			sum += sumNode(child);
		}
		return sum;
	}

	public static TreeNode largestNode(TreeNode root) {
		TreeNode max = root;
		for (TreeNode child : root.children) {
			TreeNode val = largestNode(child);
			if (val.data > max.data) {
				max = val;
			}
		}
		return max;
	}

	public static int largestorEqualNodeCount(TreeNode root, int x) {
		int count = 0;
		if (root.data >= x) {
			count++;
		}
		for (TreeNode child : root.children) {
			count += largestorEqualNodeCount(child, x);
		}
		return count;
	}

	public static int height(TreeNode root) {
		if (root == null)
			return 0;
		if (root.children.size() == 0)
			return 0;
		int max = 0;
		for (TreeNode child : root.children) {
			max = Math.max(max, height(child));
		}
		return 1 + max;
	}

	public static void printNodesAtDepth(TreeNode root, int depth) {

		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		int curr = 0;

		while (!q.isEmpty()) {
			int size = q.size();
			if (curr == depth) {
				for (TreeNode v : q) {
					System.out.println(v.data + " ");
				}
				System.out.println();
				return;
			}
			for (int i = 0; i < size; i++) {
				TreeNode node = q.poll();
				for (TreeNode child : node.children) {
					q.add(child);
				}
			}
			curr++;

		}
	}

	public static void printNodesAtDepthDFS(TreeNode root, int depth) {

		if (depth == 0) {
			System.out.print(root.data + " ");
			return;
		}

		for (TreeNode child : root.children) {
			printNodesAtDepthDFS(child, depth - 1);
		}
	}

}
// 10 2 60 2 20 0 50 2 70 0 85 0 40 2 90 1 95 0 100 0