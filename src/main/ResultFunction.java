package main;

public interface ResultFunction {
	/**
	 * Returns the state that results from doing action a in state s
	 * 
	 * @param s
	 *            a particular state.
	 * @param a
	 *            an action to be performed in state s.
	 * @return the state that results from doing action a in state s.
	 */
	Object result(Object s, Action a);
}