import java.io.*;
import java.util.*;


/**
 * Adjacency matrix implementation for the FriendshipGraph interface.
 *
 * Your task is to complete the implementation of this class.  You may add methods, but ensure your modified class compiles and runs.
 *
 * @author Jeffrey Chan, 2016.
 */
public class AdjMatrix <T extends Object> implements FriendshipGraph<T>
{
	private int[][] matrix;
	private String[] vertices;
	private boolean[][] visited;
	private int xSize;
	private int ySize;


	private int[][] increaseSize(int x , int y)
	{
		int[][] replace = new int[x+1][y+1]; // initialize the new size to array

		return replace;
	}


	private boolean replace(int[][] old, int[][] replace)
	{
		// Check the current matrix size

		for(int i = 0 ; i < old.length ; i++)
		{
			for(int j = 0 ; j < old[i].length ; j++)
			{
				replace[i][j] = old[i][j];
			}
		}

		return true;
	}
	/**
	 * Contructs empty graph.
	 */
    public AdjMatrix() {
    	// Implement me!
    	vertices = new String[4000];
    	matrix = new int[vertices.length][vertices.length];
    	for(int i = 0 ; i < matrix.length ; i++)
    	{
    		vertices[i] = new String();
    		for(int j = 0 ; j < matrix[i].length ; j++)
    		{
    			matrix[i][j] = 0;
    		}
    	}
    	xSize = 0;
    	ySize = 0;
    } // end of AdjMatrix()
    
    public void addVertex(T vertLabel) {

    	vertices[xSize] =  vertLabel.toString() ;

    	xSize++;
    	ySize++;
    	System.out.println(vertLabel+" has been added to the matrix ");
    } // end of addVertex()
    public void addEdge(T srcLabel, T tarLabel) {
        // Implement me!
    	 int keySource = 0;
    	 int keyTarget = 0;
    	 for(int i = 0 ; i < vertices.length ; i++)
    	 {
    		 if(vertices[i].equals(srcLabel))
    		 {
    			 keySource = i;
    		 }
    		 if(vertices[i].equals(tarLabel))
    		 {
    			 keyTarget = i;
    		 }
    	 }
    	 for(int i = 0 ; i < matrix.length;i++)
    	 {
    		 for(int j = 0 ; j < matrix.length;j++)
    		 {
    			 matrix[i][keySource] = 1;
    			 matrix[i][keyTarget] = 1;
    		 }
    	 }
    } // end of addEdge()


    public ArrayList<T> neighbours(T vertLabel) {
        ArrayList<T> neighbours = new ArrayList<T>();

        // Implement me!

        return neighbours;
    } // end of neighbours()


    public void removeVertex(T vertLabel) {
    	int key = 0 ;

    	for(int i = 0 ; i < vertices.length;i++)
    	{
    		if(vertices[i].equals(vertLabel))
    		{
    			key = i ;
    			vertices[i] = "";
    		}
    	}

    	// Delete edges that link to vertex
    	for(int i = 0 ; i < vertices.length ; i++)
    	{

    			if(matrix[i][key] == 1)
    			{
    				matrix[i][key] = 0;
    			}
    	}
    	xSize--;
    	ySize--;
    	System.out.println(vertLabel+ " has been removed to the matrix");

    } // end of removeVertex()

    public void removeEdge(T srcLabel, T tarLabel) {
        // Implement me!
    	
    	
    	int keySource = 0;
    	int keyTarget = 0;
    	
    	for(int i = 0 ; i<vertices.length;i++)
    	{
    		if(vertices[i].equals(srcLabel))
    		{
    			keySource = i;
    		}
    		if(vertices[i].equals(tarLabel))
    		{
    			keyTarget = i;
    		}
    	}
   	 for(int i = 0 ; i < matrix.length;i++)
   	 {
   		 for(int j = 0 ; j < matrix.length;j++)
   		 {
   			 matrix[i][keySource] = 0;
   			 matrix[i][keyTarget] = 0;
   		 }
   	 }

    } // end of removeEdges()


    public void printVertices(PrintWriter os) {
    	for(int i = 0 ; i < vertices.length ; i++)
    	{
    		if(!vertices[i].isEmpty())
    			os.print(vertices[i]+ " ");

    	}
    	os.println();
    	os.flush();
    } // end of printVertices()

    public void printEdges(PrintWriter os) {
        // Implement me!
    	
    	for(int i = 0 ; i < vertices.length ; i++)
    	{
    		if(!vertices[i].isEmpty())
    			os.print(vertices[i]+ " ");
    	}
    	
    } // end of printEdges()

    public int shortestPathDistance(T vertLabel1, T vertLabel2) {
    	// Implement me!

        // if we reach this point, source and target are disconnected
        return disconnectedDist;
    } // end of shortestPathDistance()

} // end of class AdjMatrix