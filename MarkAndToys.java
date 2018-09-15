public class MarkAndToys {
    
    static int maximumToys(int[] prices, int k) {

        List<Integer> itemsLessThanWealth = new ArrayList<>();
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= k) {
                itemsLessThanWealth.add(prices[i]);
            }
        }
        
        Collections.sort(itemsLessThanWealth);
        long overallPriceOfBasket = 0;
        long numberOfToysBought = 0;
        
        for (int i = 0; i < itemsLessThanWealth.size(); i++) {
                overallPriceOfBasket = overallPriceOfBasket + itemsLessThanWealth.get(i);

            if (overallPriceOfBasket <= k) {
                numberOfToysBought++;
            }
        }
        return (int)numberOfToysBought;

    }
}