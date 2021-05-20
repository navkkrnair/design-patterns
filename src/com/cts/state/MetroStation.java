package com.cts.state;

import com.cts.state.impl.ClosedState;
import com.cts.state.impl.OpenState;

// open closed
public class MetroStation {
    private final GateState openState;
    private final GateState closedState;

    private GateState currentState;

    public MetroStation() {
        this.openState = new OpenState(this);
        this.closedState = new ClosedState(this);
        this.currentState = this.closedState;
    }

    // a traveler payed/ its closed as of now
    public void payOk() {
        if (currentState.equals(this.closedState)) {
            System.out.println("Payment processed");
            currentState.payOk();
        } else {
            System.out.println("Gate is already open");
        }
    }

    public void enter() {
        if (currentState.equals(this.getOpenState()))
        {
            System.out.println("Entry complete");
            currentState.enter();
        }
        else {
            System.out.println("Please pay to enter");
        }
    }

    public void setState(GateState state) {
        this.currentState = state;
    }

    public GateState getOpenState() {
        return openState;
    }

    public GateState getClosedState() {
        return closedState;
    }
}

