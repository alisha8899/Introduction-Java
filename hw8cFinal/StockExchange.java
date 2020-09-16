import java.util.ArrayList;
/**
 * Manages a collection of Stock objects 
 *
 * @Alisha
 */
public class StockExchange
{
    private ArrayList<Stock> stocks;
    /**
     * Constructs a new stock exchange ArrayList
     */
    public StockExchange()
    {
        stocks = new ArrayList<Stock>();
    }

    /**
     * Adds the stock s to stocks ArrayList
     * @param s the stock that is needed to be added
     */
    public void add(Stock s)
    {
        stocks.add(s);
    }
    
    /**
     * Swaps the element of index1 with index2
     * @param index1 is the first element
     * @param index2 is the second element
     */
    public void swap (int index1, int index2)
    {
        if(index1 >= 0 && index2 >= 0
        && index1 < (stocks.size())
        && index2 < (stocks.size()))
        {
            Stock temp = stocks.get(index1);
            Stock second = stocks.set(index1, stocks.get(index2));
            stocks.set(index2, temp);
        }
    }
    /** 
     * Returns the symbol for the Stock with the lowest price per share
     * @return min lowest price per share symbol
     */
    public String cheapest()
    {
        if(stocks.size() == 0)
        {
            return "";
        }
        Stock min = stocks.get(0);
        for (Stock c: stocks)
        {
            if (stocks.size() > 0)
            {
                if (c.getPrice() < min.getPrice())
                {
                    min = c;
                }
            }
        }
        return min.getSymbol();
    }
        
    @Override
    public String toString()
    {
        return stocks.toString();
    }
    
    
}