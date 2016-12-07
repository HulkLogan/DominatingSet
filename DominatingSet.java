/**
 * 
 */
package dspack;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author crowel
 *
 */
public class DominatingSet extends LinkedList {

	/**
	 * 
	 */
	public DominatingSet(){
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfVertice = 0;
		int[][] adjacencyMatrix = new int[25][25];
		Scanner input = new Scanner(System.in);
		numberOfVertice = Integer.parseInt(input.nextLine());
		while(input.nextLine() != null) {
			for(int i = 0; i < 25; i++){
				for(int j = 0; j < 25; j++){
					adjacencyMatrix[i][j] = input.nextInt();
				}
			}
		}
		

	}
	
	private LinkedList powerSet(){
		LinkedList powerset = new LinkedList();
		
		
		
		
		return powerset;
	}
	
	private LinkedList complimentSet() { 
		LinkedList complimentSet = new LinkedList();
		
		
		
		
		return complimentSet;
	}
	
	

}
