package coding.interview.week05;

/**
 * p.210 이진트리에서 요소를 검색하는 알고리즘 구하기
 * @author sungyeon.jo
 */
public class BinaryTree {
	void initTree() {
		insertData(3);
		insertData(1);
		insertData(7);
	}

	void insertData(int newData) {
		Node newNode = new Node(newData);
	}

	void findMax() {

	}

	class Node {
		Node left, right;
		int data;

		public Node(int data) {
			this.data = data;
		}
	}
}
