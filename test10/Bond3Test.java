import issues.Bond;

public class Bond3Test{
    public static void main(String[] args) {
        Bond test1 = new Bond("1234", "Japan", 20211130, 2.0);
        System.out.println(test1.getBondType());
        Bond test2 = new Bond("1234", "Japan", 20211130, 0.0);
        System.out.println(test2.getBondType());
    }
}