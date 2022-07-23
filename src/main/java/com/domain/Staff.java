package com.domain;

import com.core.ExcludeField;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Staff {
    private String name;
    private int age;
    @ExcludeField
    private String[] position;
    private List<String> skills;
    private Map<String, BigDecimal> salary;
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String[] getPosition() {
        return position;
    }

    public List<String> getSkills() {
        return skills;
    }

    public Map<String, BigDecimal> getSalary() {
        return salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String[] position) {
        this.position = position;
    }

    public void setSalary(Map<String, BigDecimal> salary) {
        this.salary = salary;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}
