package Loops;

public class UtopiaTree {
    public static void main(String[] args) {
        int year = 1;
        int treeSize = 0;
        int growth = 0;
        String report = "";

        /*
        year 1 - growth 1 cm
        tree size: 1cm
         */

        while (year <= 10) {
            if (year <= 3) {
                growth++;
                treeSize = growth;
                report = "year " + year + " - " + "growth - 1 cm" + "\n" + "tree size: " + treeSize + "cm";
            }else{
                growth += 2;
                treeSize = growth;
                report = "year " + year + " - " + "growth - 2 cm" + "\n" + "tree size: " + treeSize + "cm";
            }
            year++;
            System.out.println(report);
        }
    }
}
