package com.luojbin.designPattern.p12_state;

/**
 * @author luojbin
 * @version 1.0
 * @time 2018-04-01
 */
public class CandyMachine {

    State emptyState;
    State noCoinState;
    State hasCoinState;
    State soldState;
    State winnerState;

    State currentState = emptyState;
    int count = 0;

    public CandyMachine(int candyNumber) {
        emptyState = new EmptyState(this);
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = candyNumber;
        if (candyNumber > 0) {
            currentState = noCoinState;
        }
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void ejectCoin() {
        currentState.ejectCoin();
    }

    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }

    void setState(State state) {
        this.currentState = state;
    }

    void releaseCandy() {
        System.out.println("糖果出来了!");
        if (count != 0) {
            count--;
        }
    }

    protected State getEmptyState() {
        return emptyState;
    }

    State getNoCoinState() {
        return noCoinState;
    }

    State getHasCoinState() {
        return hasCoinState;
    }

    State getSoldState() {
        return soldState;
    }

    State getWinnerState() {
        return winnerState;
    }

    State getCurrentState() {
        return currentState;
    }

    int getCount() {
        return count;
    }
}
