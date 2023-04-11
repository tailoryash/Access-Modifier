package com.yash.accessModifier.company;

public class Simform {

    //private instance variable only accessible in same class, so we have to generate getter setter method to indirectly access it.
    private String ceo;
    private String cto;

    //protected instance variable only accessible in sub-class who inherited this class - same package or other package also.
    protected String engineeringManager;

    //public instance variable accessible everywhere.
    public String dept;

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getCto() {
        return cto;
    }

    public void setCto(String cto) {
        this.cto = cto;
    }
}
