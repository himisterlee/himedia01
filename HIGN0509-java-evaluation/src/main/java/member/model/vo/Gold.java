package member.model.vo;

public class Gold extends Member{

    public Gold(String name, String grade, int point) {
        super(name, grade, point);
    }

    @Override
    public double calculateInterest() {
        double interestRate = getPoint() * 0.05;
        return interestRate;
    }
}
