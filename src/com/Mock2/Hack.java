/* Design a analystics system to track actions performed within an application 
 * The system stored all the actions performed . once the system has registered 
 * a specified number of actions , K , it sends them to an Analytics Store for storage.
 * 
 * Actions are represented by an enumeration called ActionEnum. The definition of ActionEnum is provided in the code stub.
 * 
 * 
 */
package com.Mock2;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

enum ActionEnum {
    appliedFilter,
    feature1Button,
    feature2Button,
    feature3Button,
    proceedButton
}

interface IAnalytics {
    public void registerAction(ActionEnum action);
	public int getNumberOfActionRegisteredButNotSentToAnalyticsStore();
	public int getTotalNumberOfLoggedActions();
    public List<ActionEnum> getMostFrequentlyUsedActions();
}

interface IAnalyticsStore {
    public void storeActions(Queue<ActionEnum> q);
    public Queue<ActionEnum> getAllStoredActions();
}

class Analytics implements IAnalytics {
    private final IAnalyticsStore analyticsStore;
    private final int K;
    
    private final Queue<ActionEnum> actionQueue;
    private final Map<ActionEnum, Integer> actionCountMap;
    private int totalLoggedActions;

    
    public Analytics(IAnalyticsStore analyticsStore, int K) {
        this.analyticsStore = analyticsStore;
        this.K = K;
        this.actionQueue = new LinkedList<>();
        this.actionCountMap = new HashMap<>();
        this.totalLoggedActions = 0;
        
    }

    @Override
    public void registerAction(ActionEnum action) {
        actionQueue.add(action);
        actionCountMap.put(action, actionCountMap.getOrDefault(action, 0) + 1);
        totalLoggedActions++;

        if (actionQueue.size() == K) {
            analyticsStore.storeActions(new LinkedList<>(actionQueue));
            actionQueue.clear();
        }
    }

    @Override
    public int getNumberOfActionRegisteredButNotSentToAnalyticsStore() {
        return actionQueue.size();
    }

    @Override
    public int getTotalNumberOfLoggedActions() {
        return totalLoggedActions;
    }

    @Override
    public List<ActionEnum> getMostFrequentlyUsedActions() {
        if(actionCountMap.isEmpty()) {
        	return new ArrayList<>();
        }
        int maxCount=Collections.max(actionCountMap.values());
    	
    	/*List<ActionEnum> mostFrequentActions = new ArrayList<>(actionCountMap.keySet());
        mostFrequentActions.sort((a, b) -> { 
        	
        int freqComparison = actionCountMap.get(b) - actionCountMap.get(a);
        return freqComparison != 0 ? freqComparison : a.name(). compareTo(b.name());
        });
        // Find the highest frequency
        int highestFrequency = actionCountMap.get(mostFrequentActions.get(0));
        
        // Filter actions to include only those with the highest frequency*/
        List<ActionEnum> mostFrequentActions = new ArrayList<>();
        for (Map.Entry<ActionEnum, Integer> entry : actionCountMap.entrySet()) {
            if (entry.getValue() == maxCount) {
            	mostFrequentActions.add(entry.getKey());
            } 
        }
        /*else {
                break;
            }*/
        mostFrequentActions.sort(Comparator.comparing(Enum::name));
        return mostFrequentActions;
    }
   }
class AnalyticsStore implements IAnalyticsStore{
	private final Queue<ActionEnum> storedActions=new LinkedList<>();
	
	@Override
	public void storeActions(Queue<ActionEnum>q) {
		storedActions.addAll(q);
}
	@Override
	public Queue<ActionEnum> getAllStoredActions(){
		return new LinkedList<>(storedActions);
	}
}
        
 
public class Hack {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        
        String inp[];
        inp = br.readLine().split(" ");

        int totalNumberOfRequests = Integer.parseInt(inp[0]),
            K = Integer.parseInt(inp[1]);
        
        IAnalyticsStore analyticsStore = new AnalyticsStore();
        IAnalytics analytics = new Analytics(analyticsStore, K);

        for(int queryNumber = 1; queryNumber <= totalNumberOfRequests; queryNumber++) {
            inp = br.readLine().split(" "); 
            switch(inp[0]) {
                case "registerAction":
                    ActionEnum actionEnum = ActionEnum.valueOf(inp[1]);
                    analytics.registerAction(actionEnum);
                    break;
                case "getTotalNumberOfLoggedActions":
                    int totalNumberOfLoggedEvents = analytics.getTotalNumberOfLoggedActions();
                    out.println(totalNumberOfLoggedEvents);
                    break;
                case "getNumberOfActionRegisteredButNotSentToAnalyticsStore":
                    int x = analytics.getNumberOfActionRegisteredButNotSentToAnalyticsStore();
                    out.println(x);
                    break;
                case "getMostFrequentlyUsedActions":
                    List<ActionEnum> li = analytics.getMostFrequentlyUsedActions();
                    for(ActionEnum a : li) {
                        out.print(a + " ");
                    }
                    out.print("\n");
                    break;
            }
        }
        
        Queue<ActionEnum> q = analyticsStore.getAllStoredActions();
        for(ActionEnum a : q) {
            out.print(a.toString() + " ");
        }
        out.print("\n");

        out.flush();
        out.close();
    }
}

/*class AnalyticsStore implements IAnalyticsStore {
    private Queue<ActionEnum> storedEventEnums = new LinkedList<>();

    @Override
    public void storeActions(Queue<ActionEnum> q) {
        while(!q.isEmpty()) {
            storedEventEnums.add(q.poll());
        }
    }

    @Override
    public Queue<ActionEnum> getAllStoredActions() {
        Queue<ActionEnum> clonedActionEnums = new LinkedList<>(storedEventEnums);
        return clonedActionEnums;
    }
}
*/


/*
Input (stdin)

Run as Custom Input
|
Download
8 3
registerAction feature1Button
registerAction feature1Button
getTotalNumberOfLoggedActions
registerAction feature2Button
registerAction feature3Button
getNumberOfActionRegisteredButNotSentToAnalyticsStore
registerAction feature2Button
getMostFrequentlyUsedActions
Your Output (stdout)
2
1
feature1Button feature2Button 
feature1Button feature1Button feature2Button 
Expected Output

Download
2
1
feature1Button feature2Button
feature1Button feature1Button feature2Button
*/