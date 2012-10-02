package main;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class RouteFindingDemo
{
	  static Map romaniaMap = new SimplifiedRoadMapOfPartOfRomania();
	  
	  public static void main(String[] args) 
	  {
			routeFindingAStarDemo();
			routeFindingGreedyBestFirstDemo();
	  }
	  private static void routeFindingAStarDemo() 
	  {
			System.out
					.println("\nRouteFindingAStarDemo AStar Search (SLDHeursitic)-->");
			try 
			{
				Problem problem = new Problem(SimplifiedRoadMapOfPartOfRomania.ZERIND,
							MapFunctionFactory.getActionsFunction(romaniaMap),
							MapFunctionFactory.getResultFunction(), new DefaultGoalTest(
									SimplifiedRoadMapOfPartOfRomania.IASI),
							new MapStepCostFunction(romaniaMap));

				Search search = new AStarSearch(new GraphSearch(),
							new StraightLineDistanceHeuristicFunction(
									SimplifiedRoadMapOfPartOfRomania.IASI, romaniaMap));
				SearchAgent agent = new SearchAgent(problem, search);
				printActions(agent.getActions());
				printInstrumentation(agent.getInstrumentation());
			} catch (Exception e) 
			{
				e.printStackTrace();
			}

		}
	  

		private static void routeFindingGreedyBestFirstDemo() 
		 {
				System.out
						.println("\nRouteFindingAStarDemo Greedy Best-First Search (SLDHeursitic)-->");
				try 
				{
					Problem problem = new Problem(SimplifiedRoadMapOfPartOfRomania.ZERIND,
								MapFunctionFactory.getActionsFunction(romaniaMap),
								MapFunctionFactory.getResultFunction(), new DefaultGoalTest(
										SimplifiedRoadMapOfPartOfRomania.IASI),
								new MapStepCostFunction(romaniaMap));

					  Search search = new GreedyBestFirstSearch(new GraphSearch(),
								new StraightLineDistanceHeuristicFunction(
										SimplifiedRoadMapOfPartOfRomania.IASI, romaniaMap));
						SearchAgent agent = new SearchAgent(problem, search);
					printActions(agent.getActions());
					printInstrumentation(agent.getInstrumentation());
				} catch (Exception e) 
				{
					e.printStackTrace();
				}

		}
		
	  private static void printActions(List<Action> actions) 
	  {
			for (int i = 0; i < actions.size(); i++) 
			{
				String action = actions.get(i).toString();
				System.out.println(action);
			}
	  }
	  
	  private static void printInstrumentation(Properties properties) 
	  {
			Iterator<Object> keys = properties.keySet().iterator();
			while (keys.hasNext()) {
				String key = (String) keys.next();
				String property = properties.getProperty(key);
				System.out.println(key + " : " + property);
			}

		}

}