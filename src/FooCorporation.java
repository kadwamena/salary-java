public class FooCorporation {
    final static double minimumWage = 8.0;
    final static int maxHours = 60;

    public static void main(String[] args) {
        employeePay(7.25, 35);
        employeePay(8.20, 47);
        employeePay(10.00, 73);
        }

    public static void employeePay(double basePay, int hoursWorked) {
        double totalSalary = 0;
        if ((basePay < minimumWage) || (hoursWorked > maxHours)) {
            System.out.println("Error!");
        }
        else {
            if (hoursWorked > 40){
                totalSalary = basePay * 40 + 1.5*basePay*(hoursWorked - 40);
            }
            else {
                totalSalary = basePay * hoursWorked;
            }
            System.out.println("Your total salary is " + totalSalary);
        }
    }
}
