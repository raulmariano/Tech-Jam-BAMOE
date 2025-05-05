package org.acme.cc_approval.model;


public class Applicant {
    private String name;   
    private boolean isStudent;
    private Long annualIncome;
    private Integer creditScore;
    private Integer age;
    
    
    public Applicant(String name, boolean isStudent, Long annualIncome, Integer creditScore, Integer age) {
        this.name = name;
        this.isStudent = isStudent;
        this.annualIncome = annualIncome;
        this.creditScore = creditScore;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Long getAnnualIncome() {
        return annualIncome;
    }
    public void setAnnualIncome(Long annualIncome) {
        this.annualIncome = annualIncome;
    }
    public Integer getCreditScore() {
        return creditScore;
    }
    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Applicant [name=" + name + ", isStudent=" + isStudent + ", annualIncome=" + annualIncome + ", creditScore="
        + creditScore + ", age=" + age + "]";
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean isStudent) {
        this.isStudent = isStudent;
    }
    
    
    
}
