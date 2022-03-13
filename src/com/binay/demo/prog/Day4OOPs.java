package com.binay.demo.prog;

import java.io.Serializable;

public class Day4OOPs {
    public static void main(String[] args) {

        SuperHero binay = new SuperHero();
        binay.id = 9999;
        binay.name = "Binay";     // we can uncomment this line
        binay.canFly = true;
        binay.superName = "Batman";
        binay.age = 40;

        binay.setProfession(binay);
        System.out.println(binay);
    }
}

class SuperHero implements Serializable {

    public int id;
    public String name;
    public String superName;
    public String profession;
    public int age;
    public boolean canFly;

    public void setProfession(SuperHero superHero) {

//        if (null != superHero && superHero.name.equals("Binay"))      // NUll pointer exception if superHero.name is null
//        if (null != superHero && (superHero.name != null) && superHero.name.equals("Binay"))
        if (null != superHero && "Binay".equals(superHero.name)) superHero.profession = "Software developer";
        else superHero.profession = "Not a super hero";
    }

    @Override
    public String toString() {
        return "SuperHero{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", " +
                "superName='" + superName + '\'' + ", profession='" + profession + '\'' + ", " +
                "age=" + age + ", canFly=" + canFly + '}';
    }
}