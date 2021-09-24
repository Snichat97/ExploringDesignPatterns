public class GumBallManager {
    public GumBallFallback currentState;
    public GumBallFallback noQuarterState;
    public GumBallFallback hasQuarterState;
    public GumBallFallback soldGumBall;

    public GumBallManager(){
        noQuarterState = new NoQuarter(this);
        hasQuarterState = new HasQuarter(this);
        soldGumBall = new SoldGumBall(this);

        currentState = noQuarterState;
        currentState.indicator();
    }


    public void doInsertsQuarter(){
        currentState.insertsQuarter();
    };
    public void doEjectsQuarter(){
        currentState.ejectsQuarter();

    };
    public void doTurnsCrank(){
        currentState.turnsCrank();

    };
    public void doDispenseGumball(){
        currentState.dispenseGumball();
    };
    public void setState(GumBallFallback gumBallFallback){
        currentState = gumBallFallback;
        currentState.indicator();
    }
}
