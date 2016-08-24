import java.io.*;
import java.util.*;
import java.util.Map.Entry;

/**
 * Adjacency list implementation for the FriendshipGraph interface.
 *
 * Your task is to complete the implementation of this class.  You may add methods, but ensure your modified class compiles and runs.
 *
 * @author Jeffrey Chan, 2016.
 */
public class AdjList <T extends Object> implements FriendshipGraph<T>
{
	private Map<T, LinkedList<T>> list;
	private LinkedList edges;
	//private Map<Integer, T>vertex;


    /**
	 * Contructs empty graph.
	 */
    public AdjList() {
    	// Implement me!
    	this.list = new HashMap<T, LinkedList<T>>();

    } // end of AdjList()


    public void addVertex(T vertLabel) {
        // Implement me!
    	LinkedList<T> vertex = new LinkedList<T>();
    	System.out.println(vertLabel+" has been added to the list ");
    	list.put(vertLabel, vertex);


    } // end of addVertex()


    public void addEdge(T srcLabel, T tarLabel) {
        // Implement me!

    	boolean sourceLabelCheck = false;

    } // end of addEdge()*521


    public ArrayList<T> neighbours(T vertLabel) {
        ArrayList<T> neighbours = new ArrayList<T>();

        // Implement me!

        return neighbours;
    } // end of neighbours()


    public void removeVertex(T vertLabel) {
        // Implement me!
    } // end of removeVertex()


    public void removeEdge(T srcLabel, T tarLabel) {
        // Implement me!
    } // end of removeEdges()


    public void printVertices(PrintWriter os) {
        // Implement me!
    	os.flush();
    	for(Entry<T,LinkedList<T>>entry : list.entrySet())
    	{

    		System.out.print(entry.getKey()+" ");
    		os.print(entry.getKey());
    	}
    	System.out.println();
    	os.flush();
    } // end of printVertices()


    public void printEdges(PrintWriter os) {
        // Implement me!
    } // end of printEdges()


    public int shortestPathDistance(T vertLabel1, T vertLabel2) {
    	// Implement me!

        // if we reach this point, source and target are disconnected
        return disconnectedDist;
    } // end of shortestPathDistance()

} // end of class AdjList