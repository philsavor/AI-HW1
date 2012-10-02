package main;
import java.util.Set;

public interface ActionsFunction {
	/**
	 * Given a particular state s, returns the set of actions that can be
	 * executed in s.
	 * 
	 * @param s
	 *            a particular state.
	 * @return the set of actions that can be executed in s.
	 */
	Set<Action> actions(Object s);
}
