package class16;

import java.util.ArrayList;

// 点结构的描述
public class Node {
	public int value;
	//入度
	public int in;
	//出度
	public int out;
	//直接邻居
	public ArrayList<Node> nexts;
	//出发的边
	public ArrayList<Edge> edges;

	public Node(int value) {
		this.value = value;
		in = 0;
		out = 0;
		nexts = new ArrayList<>();
		edges = new ArrayList<>();
	}
}
