package org.shubh;

import java.time.LocalDate;

public class HealthPolicy extends Policy{

    public HealthPolicy(int policyId, double coverageAmount, LocalDate policyStartDate, LocalDate policyEndDate) {
        super(policyId, coverageAmount, policyStartDate, policyEndDate);
    }

    @Override
    public void isPolicyActive() {

    }

    @Override
    public void calculateSettlementAmount() {

    }
}
