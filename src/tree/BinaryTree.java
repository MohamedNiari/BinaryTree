package tree;

public class BinaryTree {

	Node root;

	public Node find(int value) {

		if (root != null) {

			return findNode(root, new Node(value));
		}

		return null;

	}

	private Node findNode (Node searched, Node node) {

		if (searched == null)
			return null;

		if (searched.value == node.value) {

			return searched;
		} else {

			Node returned = findNode(searched.left, node);
			if (returned == null) {

				returned = findNode(searched.right, node);
			}
			return returned;
		}

	}

	public void insert(int value) {

		Node node = new Node(value);

		if (root == null)
			root = node;

		insert(root, node);

	}

	private void insert(Node root, Node node) {

		if (node.value < root.value) {
			if (root.left == null) {

				root.left = node;
			} else {

				insert(root.left, node);
			}
		} else if (node.value > root.value) {

			if (root.right == null) {

				root.right = node;
			} else {

				insert(root.right, node);
			}
		}

	}

	public void traverse() {

		if (root != null) {

			Node nodeToTraverse = root;
			if (nodeToTraverse.left == null && nodeToTraverse.right == null) {

				System.out.println(nodeToTraverse.value);
			} else {

				if (nodeToTraverse.left != null) {
					traverseInOrder(nodeToTraverse.left);

				}

				if (nodeToTraverse.right != null) {

					traverseInOrder(nodeToTraverse.right);
				}

			}
		}

	}

	private void traverseInOrder(Node node) {

		if (node.left != null) {

			traverseInOrder(node.left);
		}
		System.out.println(node.value);

		if (node.right != null) {

			traverseInOrder(node.right);
		}

	}

}
