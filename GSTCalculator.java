public class GSTCalculator {
  public static double[] calculateGST(double[] prices, double gstRate) {
    double[] gstAmounts = new double[prices.length];
    for (int i = 0; i < prices.length; i++) { 
      gstAmounts[i] = prices[i] * gstRate;
    }
    return gstAmounts;
  }
  public static void main(String[] args) {
    double[] prices = {100.0, 200.0, 300.0};
    double gstRate = 0.18;
    double[] gstAmounts = calculateGST(prices, gstRate);
    for (int i = 0; i < prices.length; i++) {
      System.out.println("Price: " + prices[i] + ", GST Amount: " + gstAmounts[i]);
    }
  }
}
