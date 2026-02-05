package Tree1;
import java.util.*;
public class TreeNode{
	int data;
	List<TreeNode> children;

	public TreeNode(int data){
		this.data = data;
		children = new ArrayList<>();
	}
}