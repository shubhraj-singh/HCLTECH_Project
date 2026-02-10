package org.shubh;

import java.time.LocalDate;

public class LifePolicy extends Policy{

    public LifePolicy(int policyId, double coverageAmount, LocalDate policyStartDate, LocalDate policyEndDate) {
        super(policyId, coverageAmount, policyStartDate, policyEndDate);
    }

    @Override
    public void isPolicyActive() {

    }

    @Override
    public void calculateSettlementAmount() {

    }
}
