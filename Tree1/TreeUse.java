package Tree1;
import java.util.*;
public class TreeUse{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Tree ob = new Tree();
		TreeNode root = ob.takeInput(sc);
		ob.print(root);
		// ob.countNode(root);
		int ans = ob.countNode(root);
		System.out.println(ans);
		int sum = ob.sumNode(root);
		System.out.println(sum);
		System.out.println(ob.largestNode(root).data);
		System.out.println("count:"+ ob.largestorEqualNodeCount(root, 60));
	}

}