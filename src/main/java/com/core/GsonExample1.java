package com.core;

import com.domain.Staff;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

public class GsonExample1 {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                //.excludeFieldsWithModifiers(Modifier.STATIC, Modifier.TRANSIENT)
                //.excludeFieldsWithoutExposeAnnotation()
                //.setExclusionStrategies(new CustomExclusionStrategy(List.class))
                .create();

        List<Staff> staff = new ArrayList<>();
        staff.add(createStaffOleg());
        staff.add(createStaffAlex());
        String json = gson.toJson(staff);

        File file = new File("json/student.json");
        try ( FileWriter fw = new FileWriter(file)){
            fw.write(json);
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static Staff createStaffOleg(){
        Staff staff = new Staff();
        staff.setName("oleg");
        staff.setAge(25);
        staff.setPosition(new String[]{"fonder", "seo", "coding"});
        Map<String, BigDecimal> salary = new HashMap() {{
            put("2010", new BigDecimal(10000));
            put("2012", new BigDecimal(12000));
            put("2018", new BigDecimal(14000));
        }};
        staff.setSalary(salary);
        staff.setSkills(Arrays.asList("java", "python", "node", "kotlin"));


        return staff;
    }


    private static Staff createStaffAlex(){
        Staff staff = new Staff();
        staff.setName("alex");
        staff.setAge(32);
        staff.setPosition(new String[]{"hr", "design"});
        Map<String, BigDecimal> salary = new HashMap() {{
            put("2017", new BigDecimal(5000));
            put("2018", new BigDecimal(2000));
            put("2019", new BigDecimal(3000));
        }};
        staff.setSalary(salary);
        staff.setSkills(Arrays.asList("angular", "react"));


        return staff;
    }
}
