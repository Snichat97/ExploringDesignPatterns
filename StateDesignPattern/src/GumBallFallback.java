public class GumBallFallback implements GumBallTransitions {
    GumBallManager gumBallManager;
    public GumBallFallback(GumBallManager gmBallManager) {
        gumBallManager =gmBallManager;
    }

    @Override
    public void insertsQuarter() {
        System.out.println("Inserts Quarter doesn't exist for "+gumBallManager.currentState.getClass());
    };

    @Override
    public void ejectsQuarter() {
        System.out.println("Inserts Quarter doesn't exist for "+gumBallManager.currentState.getClass());
    };

    @Override
    public void turnsCrank() {
        System.out.println("Trunk Crank doesn't exist for "+gumBallManager.currentState.getClass());
    };

    @Override
    public void dispenseGumball() {
        System.out.println("Dispense Gumball doesn't exist for "+gumBallManager.currentState.getClass());
    }

    @Override
    public void indicator() {
        System.out.println("Print GumBallFallback");
    }

    ;
}
