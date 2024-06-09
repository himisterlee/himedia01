package member.model.vo;

public class Vip extends Member implements Buyable {

    public Vip(String name, String grade, int point) {
        super(name, grade, point);
    }

    @Override
    public double calculateInterest() {
        double interestRate = getPoint() * 0.1;
        return interestRate;
    }


    @Override
    public int buy(int price) {
        double disconuntRate = price * 0.1;
        int buyPrice = (int) disconuntRate;
        return buyPrice;
    }
}
