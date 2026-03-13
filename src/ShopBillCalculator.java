public class ShopBillCalculator {
	public static void main(String[] args) {
       
        final double PRICE_RICE = 250.0;
        final double PRICE_OIL = 180.0;
        final double PRICE_BREAD = 45.0;
        final double PRICE_MILK = 90.0;
        final double PRICE_EGGS = 84.0;

        
        int qtyRice = 5;     // 5kg
        int qtyOil = 1;      // 1L
        int qtyBread = 1;    // 1 bread
        int qtyMilk = 2;     // 2L
        int qtyEggs = 12;    // 12pcs

        
        double subtotal = 0.0;
        subtotal += PRICE_RICE;      // price already for 5kg
        subtotal += PRICE_OIL * qtyOil;
        subtotal += PRICE_BREAD * qtyBread;
        subtotal += PRICE_MILK * qtyMilk;
        subtotal += PRICE_EGGS;      // price already for 12pc
        System.out.printf("Subtotal: Rs. %.2f%n", subtotal);

        // Step 2: Apply GST using ternary
        double gstRate = (subtotal > 500) ? 0.05 : 0.0;
        double gst = subtotal * gstRate;
        subtotal += gst;  // compound assignment
        System.out.printf("GST (%.0f%%): Rs. %.2f%n", gstRate * 100, gst);
        // Step 3: Apply discount using ternary
        double discountRate = (subtotal > 600) ? 0.10 : 0.0;
        double discount = subtotal * discountRate;
        subtotal -= discount; // compound assignment
        System.out.printf("Discount: Rs. %.2f%n", discount);

        // Step 4: Final total
        double total = subtotal;
        System.out.printf("TOTAL: Rs. %.2f%n", total);
	}
}
