import issues.Bond;

public class Bond2Test {
    public static void main(String[] args) {
        try{
            Bond bondType = new Bond(null, "Japan", 20211130, 0.05);
        } catch(IllegalArgumentException e){
            System.out.println("テスト（コードがnull）OK");
        }

        try{
            Bond bondType = new Bond("1234", null, 20211130, 0.05);
        } catch(IllegalArgumentException e){
            System.out.println("テスト（名称がnull）OK");
        }

        try{
            Bond bondType = new Bond("1234", "Japan", null, 0.05);
        } catch(NullPointerException e){
            System.out.println("テスト（償還年月日がnull）OK");
        }

        try{
            Bond bondType = new Bond("1234", "Japan", 20211130, null);
        } catch(NullPointerException e){
            System.out.println("テスト（クーポンレートがnull）OK");
        }
    }
}
