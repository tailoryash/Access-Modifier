package com.yash.accessModifier.company.backend;

import com.yash.accessModifier.company.Simform;

public class Java extends Simform {
    //extend Simform class to access protected instance variable - engineeringManager
    public void showDetailsOfDept() {
        System.out.println("Welcome to Java backend team");

        Java javaStack = new Java();
        Simform simform = new Simform();

        simform.dept = "JAVA";
        javaStack.engineeringManager = "Mehul Pandya";

        System.out.println("Engineering Manager name in " + simform.dept + " Department : " + javaStack.engineeringManager);
    }

    public static void main(String[] args) {
        Java java = new Java();
        java.showDetailsOfDept();
    }
}
