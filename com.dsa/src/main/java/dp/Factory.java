package dp;

public class Factory {

    public static Lab getPhone(LabType labType) {
        switch (labType) {
            case CRR:
                return new Alab();
            case BMD:
                return new Blab();
            case CMD:
                return new Clab();
            default:

                throw new IllegalArgumentException("Details Entered were not appropriate please check!!!");
        }
    }
}
