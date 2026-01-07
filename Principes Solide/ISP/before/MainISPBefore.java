//package isp.before;

interface Worker {
    void work();
    void eat();
}

class HumanWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Les humains travaillent");
    }

    @Override
    public void eat() {
        System.out.println("Les humains mangent");
    }
}

class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Les robots travaillent sans fatigue");
    }

    @Override
    public void eat() {
        System.out.println("Erreur : un robot ne mange pas !");
        throw new UnsupportedOperationException("Les robots ne mangent pas");
    }
}

public class MainISPBefore {
    public static void main(String[] args) {
        HumanWorker human = new HumanWorker();
        human.work();
        human.eat();

        RobotWorker robot = new RobotWorker();
        robot.work();
        try {
            robot.eat();
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }
    }
}
