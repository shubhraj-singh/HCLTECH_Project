package org.shubh;

import java.time.LocalDate;

public class Claims {
    private int claimId;
    private int policyId;
    private LocalDate claimDate;
    private Status claimStatus;

    public Claims(int claimId, int policyId, LocalDate claimDate, Status claimStatus) {
        this.claimId = claimId;
        this.policyId = policyId;
        this.claimDate = claimDate;
        this.claimStatus = claimStatus;
    }


}
