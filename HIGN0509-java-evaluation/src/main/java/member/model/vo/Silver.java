package member.model.vo;

public class Silver extends Member{

    public Silver(String name, String grade, int point) {
        super(name, grade, point);
    }

    @Override
    public double calculateInterest() {
        double interestRate = getPoint() * 0.02;
        return interestRate;
    }
}
