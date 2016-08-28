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
    	
    if(list.containsKey(srcLabel)&&list.containsKey(tarLabel))
    {
        list.get(srcLabel).add(tarLabel);
	    list.get(tarLabel).add(srcLabel);
	    
    }	
    	  	
    } // end of addEdge()


    public ArrayList<T> neighbours(T vertLabel) {
        ArrayList<T> neighbours = new ArrayList<T>();
        T value = null;
        // Implement me!
       if(list.containsKey(vertLabel))
       {
    	   if(list.get(vertLabel).mLength >= 2)
    	   {
    		   for(int i = 0 ; i < list.get(vertLabel).mLength ; i++)
    		   {
    			   value = list.get(vertLabel).get(i);
    			   neighbours.add(value);
    		   }
    		}
       }
        
        return neighbours;
    } // end of neighbours()


    public void removeVertex(T vertLabel) {
        // Implement me!
    	boolean confirm = true;
    	
    	if(list.containsKey(vertLabel))
    	{
    		for(int i = 0 ; i < list.size() ; i++)
    		{
    			list.get(vertLabel).remove(i,confirm);
    		}
    		list.remove(vertLabel);
    	}
    	
    	
    	System.out.println(vertLabel + " has been removed from the matrix");
    	    	
    	
    } // end of removeVertex()


    public void removeEdge(T srcLabel, T tarLabel) {
        // Implement me!
    	
    	boolean confirm = true;
    	if(list.containsKey(srcLabel) && list.containsKey(tarLabel))
    	{
    	for(int i = 0 ; i<list.size(); i++)
    	{
    		list.get(srcLabel).remove(i, confirm);
    		list.get(tarLabel).remove(i, confirm);
    	}
    	}
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
    	os.flush();
    	
    	//if()
    	for(Entry<T,LinkedList<T>>entry : list.entrySet())
    	{
    		if(entry.getValue().mLength >= 2)
    		{
    			os.println(entry.getValue());
    		}
    	}  		
    //		System.out.print(list.values());
    		
    	os.println();
    	os.flush();
    } // end of printEdges()


    public int shortestPathDistance(T vertLabel1, T vertLabel2) {
    	// Implement me!
    	T value = null;
        ArrayList<T> neighbours = new ArrayList<T>();
    	
    	if(list.containsKey(vertLabel1) && list.containsKey(vertLabel2))
    	{
    		/*while((vertLabel1=vertLabel2))
    		{
    	    	   if(list.get(vertLabel1).mLength >= 2)
    	    	   {
    	    		   for(int i = 0 ; i < list.get(vertLabel1).mLength ; i++)
    	    		   {
    	    			   value = list.get(vertLabel1).get(i);
    	    			   neighbours.add(value);
    	    		   }
    		}*/
    		//list.get(vertLabel).mLength
    	}
        // if we reach this point, source and target are disconnected
        return disconnectedDist;
    } // end of shortestPathDistance()

} // end of class AdjList