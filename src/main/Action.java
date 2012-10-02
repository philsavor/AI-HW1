package main;

public interface Action {

	/**
	 * Indicates whether or not this Action is a 'No Operation'.<br>
	 * Note: AIMA3e - NoOp, or no operation, is the name of an assembly language
	 * instruction that does nothing.
	 * 
	 * @return true if this is a NoOp Action.
	 */
	boolean isNoOp();
}
