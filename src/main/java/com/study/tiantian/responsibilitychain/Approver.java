package com.study.tiantian.responsibilitychain;

/**
 * <p></p>
 *
 * @author yuantiantian
 * @date 2020/12/23 8:29 下午
 */
public abstract class Approver {

    Approver nextApprover;

    String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void processRequest(PurchaseRequest request);
}
