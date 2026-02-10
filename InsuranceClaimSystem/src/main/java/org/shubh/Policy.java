package org.shubh;

import java.time.LocalDate;

public abstract class Policy {
    private int policyId;
    private double coverageAmount;
    private LocalDate policyStartDate;
    private LocalDate policyEndDate;

    public Policy(int policyId, double coverageAmount, LocalDate policyStartDate, LocalDate policyEndDate) {
        this.policyId = policyId;
        this.coverageAmount = coverageAmount;
        this.policyStartDate = policyStartDate;
        this.policyEndDate = policyEndDate;
    }

    public abstract void isPolicyActive();
    public abstract void calculateSettlementAmount();


}
