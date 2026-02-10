package org.shubh;

import java.time.LocalDate;

public class VehiclePolicy extends Policy{

    public VehiclePolicy(int policyId, double coverageAmount, LocalDate policyStartDate, LocalDate policyEndDate) {
        super(policyId, coverageAmount, policyStartDate, policyEndDate);
    }

    @Override
    public void isPolicyActive() {

    }

    @Override
    public void calculateSettlementAmount() {

    }
}
