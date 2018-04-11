import java.util.*;

/**
 *
 * @author 204641
 */
public class States {
    
    private static Map<String ,State> statesMap = new HashMap<String,State>();
    private static String stateName;
    static final double profit = 0.10;

    static {
        State state = new State();
         
        stateName = "Arkansas";
        state.setBaseSalesTax(0.065);
        state.setGroceryTax(0.08);
        statesMap.put(stateName, state);
        
        stateName = "Georgia";
        state.setBaseSalesTax(0.04);
        state.setGroceryTax(0.04);
        statesMap.put(stateName, state);
        
        stateName = "Iowa";
        state.setBaseSalesTax(0.06);
        state.setGroceryTax(0.0);
        statesMap.put(stateName, state);
    }

    public static Map<String, State> getStatesMap() {
        return statesMap;
    }
    
    public static Double getGroceryTaxByState(String stateName, String taxName){
        State currentState = new State();
        Double stateGroceryTax = 0.0;
        for(Map.Entry state:States.getStatesMap().entrySet()){  
            if (stateName.equals(state.getKey())){
                currentState = (State)state.getValue();
                stateGroceryTax = currentState.getGroceryTax();
                break;
            }             
        }
        return stateGroceryTax;
    }
    
    public static Double getMaxGroceryTax(){
        State firstState = statesMap.get("Iowa");
        State otherState;

        Double maxGroceryTax = firstState.getGroceryTax();
        
        for(Map.Entry state:statesMap.entrySet()){
            otherState = (State)state.getValue();
            if (maxGroceryTax < otherState.getGroceryTax()){
                maxGroceryTax = otherState.getGroceryTax();
                break;
            }       
        }
        return maxGroceryTax;
    }
    
    public static Double calculateProductPrice(Double productionPrice, String stateName){
        State state = statesMap.get(stateName);
        Double stateGroceryTax = state.getGroceryTax();
        Double minPrice = productionPrice + productionPrice*profit;
        Double maxGroceryTax = getMaxGroceryTax();
        Double profitSum = productionPrice - minPrice;
        
        Double productPrice = productionPrice + productionPrice*profit + productionPrice*stateGroceryTax;
        Double maxProductPrice = productionPrice + productionPrice*profit + productionPrice*maxGroceryTax;
        
        if (productPrice < maxProductPrice){
            profitSum = maxProductPrice - productPrice;
            return profitSum;
        }
        else return profitSum;
    }
    
    public static String getStateName() {
        return stateName;
    }
}
