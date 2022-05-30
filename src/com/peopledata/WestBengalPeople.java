package com.peopledata;

public class WestBengalPeople extends WestBengal implements Company{
    private int companyId;
    private String companyName;
    private String memberName;
    private int memberAge;
    private String memberEducation;
    private String memberFatherName;
    private String memberMotherName;
    private int memberIncome;
    private int pinCode;

    public WestBengalPeople(String countryName, int cityId, String cityName, int companyId, String companyName, String memberName, int memberAge, String memberEducation, String memberFatherName, String memberMotherName, int memberIncome, int pinCode) {
        super(countryName, cityId, cityName);
        this.companyId = companyId;
        this.companyName = companyName;
        this.memberName = memberName;
        this.memberAge = memberAge;
        this.memberEducation = memberEducation;
        this.memberFatherName = memberFatherName;
        this.memberMotherName = memberMotherName;
        this.memberIncome = memberIncome;
        this.pinCode = pinCode;
    }

    @Override
    public int getCompanyId() {
        return companyId;
    }

    @Override
    public String getCompanyName() {
        return companyName;
    }

    public String getMemberName() {
        return memberName;
    }

    public int getMemberAge() {
        return memberAge;
    }

    public String getMemberEducation() {
        return memberEducation;
    }

    public String getMemberFatherName() {
        return memberFatherName;
    }

    public String getMemberMotherName() {
        return memberMotherName;
    }

    public int getMemberIncome() {
        return memberIncome;
    }

    public int getPinCode() {
        return pinCode;
    }
}
