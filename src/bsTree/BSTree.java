package bsTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BSTree {
	private Node root;
	public BSTree(){
		
	}
	public BSTree(Node root){
		this.root = root;
	}
	public BSTree creatTree(String fileName){
		BSTree tree = new BSTree();
		File file = new File(fileName);
		try {
			Scanner input = new Scanner(file);
			root = new Node(input.nextInt());
			
			while(input.hasNext()){
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tree;
	}
}
