public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        return daysSkipped <= 5 ? 1.00 : 0.85; 
    }

    public int multiplierPerProductsSold(int productsSold) {
        return productsSold > 20 ? 13 : 10;
    }

    public double bonusForProductSold(int productsSold) {
        return productsSold * multiplierPerProductsSold(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        return Math.min(1000.00 * multiplierPerDaysSkipped(daysSkipped) + bonusForProductSold(productsSold) , 2000.00);
    } 
}
