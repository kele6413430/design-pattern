package com.study.tiantian.responsibilitychain;

/**
 * <p></p>
 *
 * @author yuantiantian
 * @date 2020/12/23 8:35 下午
 */
public class CollegeApprover extends Approver {

    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        float price = request.getPrice();
        int id = request.getId();
        if (5000 < price && price <= 10000) {
            System.out.println("请求编号id=" + id + "被" + this.name + "处理");
        } else {
            nextApprover.processRequest(request);
        }
    }
}
