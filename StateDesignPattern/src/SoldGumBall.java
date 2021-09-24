public class SoldGumBall extends GumBallFallback {
    public SoldGumBall(GumBallManager gumBallManager) {
    super(gumBallManager);
    }

    @Override
    public void dispenseGumball() {
        gumBallManager.setState(gumBallManager.noQuarterState);
    };

    @Override
    public void indicator() {
        System.out.println("Print SoldGumBall");
    }
}
