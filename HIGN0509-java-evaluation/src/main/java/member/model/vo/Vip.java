package member.model.vo;

public class Vip extends Member{

    public Vip(String name, String grade, int point) {
        super(name, grade, point);
    }

    @Override
    public double calculateInterest() {
        double interestRate = getPoint() * 0.1;
        return interestRate;
    }
}
