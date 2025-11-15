class Membership {
    public void getBenefits() {
        System.out.println("General Membership Benefits");
    }
}

class Basic extends Membership {
    public void getBenefits() {
        System.out.println("Basic Plan: Gym Access Only");
    }
}

class Premium extends Membership {
    public void getBenefits() {
        System.out.println("Premium Plan: Gym + Personal Trainer + Diet Plan");
    }
}

public class FitnessApp {
    public static void main(String[] args) {
        Membership plans[] = new Membership[2];
        plans[0] = new Basic();
        plans[1] = new Premium();

        for (Membership m : plans) {
            m.getBenefits(); // Dynamic dispatch
        }
    }
}

