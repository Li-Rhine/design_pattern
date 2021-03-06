package com.geely.design.pattern.structural.flyweight;

public class Manager implements Employee {
    public void report() {
        System.out.println(reportContent);
    }


    private String title = "部门经理";
    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
