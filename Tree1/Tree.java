package Tree1;
import java.util.*;
public class Tree{

	//DFS input way
	public static TreeNode takeInput(Scanner sc){
		int data;
		System.out.println("Enter the Node Data");
		data = sc.nextInt();
		TreeNode root = new TreeNode(data);
		System.out.println("Enter the number of children of root: "+data);
		int child = sc.nextInt();

		for(int i=0;i<child;i++){
			System.out.println("Enter the "+ (i+1) +" child of "+data);
			TreeNode childNode = takeInput(sc);
			root.children.add(childNode);
		}
		return root;
	}

	//Printing
	public static void print(TreeNode root){
		String s = "Root is "+ root.data + " and children ";
		for(TreeNode child : root.children){
			s += child.data+", ";
		}
		System.out.println(s);
		for(TreeNode child : root.children){
			print(child);
		}
	}
	public static int countNode(TreeNode root){
		int count=1;
		for(TreeNode child : root.children){
			count += countNode(child);
		}
		return count; 
	}
	public static int sumNode(TreeNode root){
		int sum= root.data;
		for(TreeNode child : root.children){
			sum += sumNode(child);
		}
		return sum; 
	}

	public static TreeNode largestNode(TreeNode root){
		TreeNode max = root;
		for(TreeNode child : root.children){
			TreeNode val = largestNode(child);
			if(val.data>max.data){
				max = val;
			}	
		}
		return max;
	}
	public static int largestorEqualNodeCount(TreeNode root, int x){
		int count = 0;
		if (root.data >= x) {
        	count++;
    	}
		for(TreeNode child : root.children){
			count += largestorEqualNodeCount(child, x);
		}
		return count;
	}
}
// 10 2 60 2 20 0 50 2 70 0 85 0 40 2 90 1 95 0 100 0