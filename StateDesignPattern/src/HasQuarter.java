public class HasQuarter extends GumBallFallback{
    public HasQuarter(GumBallManager gumBallManager) {
        super(gumBallManager);
    }

    @Override
    public void ejectsQuarter() {
        gumBallManager.setState(gumBallManager.noQuarterState);
    };

    @Override
    public void turnsCrank() {
        gumBallManager.setState(gumBallManager.soldGumBall);
    };
    @Override
    public void indicator() {
        System.out.println("Print HasQuarter");
    }
}
