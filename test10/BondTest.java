import issues.Bond;

public class BondTest{
    public static void main(String[] args) {
        Bond bond1 = new Bond("1234", "Japan", 20211130, 0.05);
        System.out.println(bond1.toString());

        Bond bond2 = new Bond("1234", "Japan", 20211130, 0.05);
        if(bond1.equals(bond2) == true){
            System.out.println("テストOK");
        } else {
            System.out.println("テストNO");
        }

        Bond codeChangeBond = new Bond("9876", "Japan", 20211130, 0.05);
        if(bond1.equals(codeChangeBond) == false){
            System.out.println("テストOK");
        } else {
            System.out.println("テストNO");
        }

        Bond nameChangeBond = new Bond("1234", "America", 20211130, 0.05);
        if(bond1.equals(nameChangeBond) == false){
            System.out.println("テストOK");
        } else {
            System.out.println("テストNO");
        }
        Bond maturityChangeBond = new Bond("1234", "Japan", 20200806, 0.05);
        if(bond1.equals(maturityChangeBond) == false){
            System.out.println("テストOK");
        } else {
            System.out.println("テストNO");
        }
        Bond couponChangeBond = new Bond("1234", "Japan", 20211130, 0.03);
        if(bond1.equals(couponChangeBond) == false){
            System.out.println("テストOK");
        } else {
            System.out.println("テストNO");
        }

        System.out.println(bond1.equals(null));
        System.out.println(bond1.equals("あいうえお"));

    }
}