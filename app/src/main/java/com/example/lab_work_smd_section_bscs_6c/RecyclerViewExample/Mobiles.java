package com.example.lab_work_smd_section_bscs_6c.RecyclerViewExample;

public class Mobiles {
    String Name,Company,Price;

    public Mobiles(String name, String company, String price) {
        Name = name;
        Company = company;
        Price = price;
    }

    public Mobiles() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }
}