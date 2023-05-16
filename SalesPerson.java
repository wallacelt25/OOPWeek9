public class SalesPerson {

    private String id;

    private Sales[] salesHistory;

    private int count = 0;

    public SalesPerson(String id){
        this.id = id;
        this.salesHistory = new Sales[100];
        this.count = 0;
    }
    public int getCount(){return count;}

    public String getId() {return id;}

    public void setSalesHistory(Sales s){
        salesHistory[count] = s;
        count++;
    }

    public Sales getSalesHistory(int i) {
        return salesHistory[i];
    }

    public double calcTotalSales(){
        double total = 0;
        for (Sales sale : salesHistory) {
            if (sale != null) {
                total += sale.getValue() * sale.getQuantity();
            }
        }
        return total;
    }
}
