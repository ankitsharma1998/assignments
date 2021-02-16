class Bank{
    public void getDetais(){
        System.out.println("Your Bank details are");
    }
}
class Icici extends Bank{
    @Override
    public void getDetais() {
        super.getDetais();
        double interstRate = 0.4;
        System.out.println("This is ICICI bank where interst is: " + interstRate + "%");

    }
}
class Sbi extends  Bank{
    @Override
    public void getDetais() {
        super.getDetais();
        double interstRate = 0.6;
        System.out.println("This is SBI bank where interst is: " + interstRate + "%");
    }
}
class Boi extends Bank{
    @Override
    public void getDetais() {
        super.getDetais();
        double interstRate = 0.3;
        System.out.println("This is BOI bank where interst is: " + interstRate + "%");
    }
}
public class ques11 {
    public static void main(String[] args) {
        Icici icici = new Icici();
        Sbi sbi = new Sbi();
        Boi boi = new Boi();
        icici.getDetais();
        sbi.getDetais();
        boi.getDetais();
    }
}
