public class NoQuarter extends GumBallFallback {
    public NoQuarter(GumBallManager gumBallManager) {
        super(gumBallManager);
    }

    @Override
    public void insertsQuarter() {
        gumBallManager.setState(gumBallManager.hasQuarterState);
    };

    @Override
    public void indicator() {
        System.out.println("Print NoQuarter");
    }
}
