package com.yash.accessModifier;

import com.yash.accessModifier.company.Simform;
import com.yash.accessModifier.company.backend.Dotnet;
import com.yash.accessModifier.company.backend.Java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome Simform Family");

        Simform simform = new Simform();
        Java java = new Java();
        Dotnet dotnet = new Dotnet();

        simform.setCeo("Prayaag Kasundra");
        simform.setCto("Hiren Dhaduk");
        System.out.println("CEO : " + simform.getCeo());
        System.out.println("CTO : " + simform.getCto());

        //to show details of dept
        java.showDetailsOfDept();
        dotnet.showDetailsOfDept();
    }

}
