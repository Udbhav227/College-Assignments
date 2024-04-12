abstract class Marks {
    protected double markICP;
    protected double markDSA;
    protected double percentage;

    public Marks(double markICP, double markDSA) {
        this.markICP = markICP;
        this.markDSA = markDSA;
    }

    abstract void getPercentage();

}

class CSE extends Marks {
    double algoDesign;

    CSE(double marksICP, double marksDSA, double algoDesign) {
        super(marksICP, marksDSA);
        this.algoDesign = algoDesign;
    }

    @Override
    void getPercentage() {
        percentage = ((markICP + markDSA + algoDesign) / 300) * 100;
        System.out.println("Percentage of marks for CSE student: " + percentage + "%");
    }

}

class NonCSE extends Marks {
    double enggMechanics;

    NonCSE(double marksICP, double marksDSA, double enggMechanics) {
        super(marksICP, marksDSA);
        this.enggMechanics = enggMechanics;
    }

    @Override
    void getPercentage() {
        percentage = ((markICP + markDSA + enggMechanics) / 300) * 100;
        System.out.println("Percentage of marks for Non-CSE student: " + percentage + "%");
    }
}

class Q6 {
    public static void main(String[] args) {
        CSE cseStudent = new CSE(89, 66, 79);
        cseStudent.getPercentage();

        NonCSE nonCSEStudent = new NonCSE(84, 98, 96);
        nonCSEStudent.getPercentage();
    }
}

/**
 *  Output:
 *      Percentage of marks for CSE student: 78.0%
 *      Percentage of marks for NonCSE student: 92.6%
 */