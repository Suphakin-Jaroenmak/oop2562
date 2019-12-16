package oop2562;

public class Employee {

    protected String employeePrefix;
    protected String employeeTitle;
    protected int employeeAge;
    protected String employeeSex;

    public void chekStock() {
        System.out.println("chekstock");
    }

    public void sellProduct() {
        System.out.println("sellproduct");

    }

    public void purchaseProduct() {
        System.out.println("purchaseproduct");
    }

    public static void main(String[] args) {
        Employee sodsai = new Employee();
        System.out.println("Object = " + sodsai);
        sodsai.employeePrefix = "Miss";
        sodsai.employeeTitle = "Sodsai ngadee";
        sodsai.employeeAge = 15;
        sodsai.employeeSex = "Woman";
        sodsai.chekStock();
        sodsai.sellProduct();
        sodsai.sellProduct();

        Employee sad = new Employee();
        System.out.println("Object = " + sad);
        sad.employeePrefix = "Miss";
        sad.employeeTitle = "Sodsai ngadee";
        sad.employeeAge = 15;
        sad.employeeSex = "Woman";
        sad.chekStock();
        sad.sellProduct();
        sad.sellProduct();
    }
}