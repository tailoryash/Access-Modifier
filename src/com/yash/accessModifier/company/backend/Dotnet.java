package com.yash.accessModifier.company.backend;

import com.yash.accessModifier.company.Simform;

public class Dotnet extends Simform {
    public void showDetailsOfDept() {
        System.out.println("Welcome to .Net backend team");
        Dotnet dotnet = new Dotnet();
        Simform simform = new Simform();
        simform.dept = ".NET";
        dotnet.engineeringManager = "Mehul Pandya";
        System.out.println("Engineering Manager name in " + simform.dept + " Department : " + dotnet.engineeringManager);
    }
}
