import java.util.LinkedList;
import java.util.Queue;

class Solution {
	static Node root;
	static Node tmp = root;
	
	static class Node {
		int key;
		Node lt, rt;
		
		Node(int key) {
			this.key = key;
			lt = rt = null;
		}
	}
	
	static void inorder(Node tmp) {
		if(tmp == null) return;
		else {
			inorder(tmp.lt);
			System.out.print(tmp.key);
			inorder(tmp.rt);
		}
	}
	
	static void insert(Node tmp, int key) {
		if(tmp == null) {
			root = new Node(key);
			return;
		}
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(tmp);
		
		while(!q.isEmpty()) {
			tmp = q.peek();
			q.remove();
			
			if(tmp.lt == null) {
				tmp.lt = new Node(key);
				break;
			}
			else {
				q.add(tmp.lt);
			}
			if(tmp.rt == null) {
				tmp.rt = new Node(key);
				break;
			}
			else {
				q.add(tmp.rt);
			}
		}
	}
	public static void main(String[] args) {
		root = new Node(10);
		root.lt = new Node(11);
		root.lt.lt = new Node(7);
		root.rt = new Node(9);
		root.rt.lt = new Node(15);
		root.rt.rt = new Node(8);
		
		System.out.print("Inorder traversal before insertion: ");
		inorder(root);
		
		int key = 12;
		insert(root, key);
		
		System.out.print("\nInorder traversal after insertion: ");
		inorder(root);
	}
}
