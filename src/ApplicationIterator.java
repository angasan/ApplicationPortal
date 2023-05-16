//////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Author:   Angela Galindo 
//
///////////////////////////////////////////////////////////////////////////////

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Implements an iterator for Applications, which returns the Applications in order from earliest to
 * latest based on their order in a priority queue.
 */
public class ApplicationIterator implements Iterator<Application> {
  private ApplicationQueue queue; // a copy of the priority queue of applications to iterate over


  /**
   * Creates a new ApplicationIterator which iterates over the elements of the given ApplicationQueue
   * in order from lowest-scored application to the highest-scored application.
   * 
   * @param queue the ApplicationQueue to iterate over
   */
  public ApplicationIterator(ApplicationQueue queue) {
    this.queue = queue.deepCopy(); // we are going to work on a deep copy of the provided queue
                                   // as input parameter. 
  }

  /**
   * Returns true if the iteration has more elements.
   * 
   * @return {@code true} if the iteration has more elements
   */
  @Override
  public boolean hasNext() {
	  Application p;
	  try {
		  p = queue.peek();
	  } catch (Exception e) {
		  return false;
	  }
    return p != null;  // TO DO fix
  }

  /**
   * Returns the next element in the iteration.
   * 
   * @return the next element in the iteration.
   * @throws NoSuchElementException with a descriptive error message if the iteration has no more
   *                                elements
   */
  @Override
  public Application next() {
    if (!hasNext())
      throw new NoSuchElementException("No more elements in this iteration");

    return queue.dequeue(); // TO DO fix
  }
}
