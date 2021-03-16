package com.study.tiantian.responsibilitychain;

/**
 * <p></p>
 *
 * @author yuantiantian
 * @date 2020/12/23 8:41 下午
 */
public class Client {

    public static void main(String[] args) {
        PurchaseRequest request = new PurchaseRequest(1, 50000, 1);

        DepartmentApprover departmentApprover = new DepartmentApprover("主任");
        CollegeApprover collegeApprover = new CollegeApprover("院长");
        ViceShcoolMasterApprover viceShcoolMasterApprover = new ViceShcoolMasterApprover("副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("校长");

        departmentApprover.setNextApprover(collegeApprover);
        collegeApprover.setNextApprover(viceShcoolMasterApprover);
        viceShcoolMasterApprover.setNextApprover(schoolMasterApprover);
        schoolMasterApprover.setNextApprover(departmentApprover);

        departmentApprover.processRequest(request);
    }
}
