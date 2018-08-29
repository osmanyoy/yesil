package com.java.performance;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    public static class MySetObj {
        private String name;
        private String surname;
        private int age;

        public MySetObj() {
        }

        public MySetObj(final String name, final String surname, final int age) {
            super();
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public static MySetObj createMySetObjV1(final String name, final String surname) {
            return new MySetObj(name,
                                surname,
                                0);
        }

        public static MySetObj createMySetObjV2(final String name, final String surname, final int age) {
            return new MySetObj(name,
                                surname,
                                age);
        }

        public String getName() {
            return this.name;
        }

        public void setName(final String name) {
            this.name = name;
        }

        public String getSurname() {
            return this.surname;
        }

        public void setSurname(final String surname) {
            this.surname = surname;
        }

        public int getAge() {
            return this.age;
        }

        public void setAge(final int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "MySetObj [name=" + this.name + ", surname=" + this.surname + ", age=" + this.age + "]";
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = (prime * result) + this.age;
            result = (prime * result) + ((this.name == null) ? 0 : this.name.hashCode());
            result = (prime * result) + ((this.surname == null) ? 0 : this.surname.hashCode());
            return result;
        }

        @Override
        public boolean equals(final Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (this.getClass() != obj.getClass()) {
                return false;
            }
            MySetObj other = (MySetObj) obj;
            if (this.age != other.age) {
                return false;
            }
            if (this.name == null) {
                if (other.name != null) {
                    return false;
                }
            } else if (!this.name.equals(other.name)) {
                return false;
            }
            if (this.surname == null) {
                if (other.surname != null) {
                    return false;
                }
            } else if (!this.surname.equals(other.surname)) {
                return false;
            }
            return true;
        }

    }

    public static void main(final String[] args) {
        Set<MySetObj> setO = new HashSet<>();

        MySetObj mySetObj = new MySetObj();
        mySetObj.setName("osman");
        mySetObj.setSurname("ayay");
        mySetObj.setAge(48);

        MySetObj mySetObj2 = new MySetObj("osman",
                                          "ayay",
                                          48);

        MySetObj mySetObj3 = MySetObj.createMySetObjV2("osman", "ayay", 48);

        setO.add(mySetObj);
        setO.add(mySetObj2);
        setO.add(mySetObj3);

        System.out.println(setO);

        Set<String> set1 = new HashSet<>();
        set1.add("tst1");
        set1.add("tst2");
        set1.add("tst3");
        set1.add("tst4");
        set1.add("tst5");

        Set<String> set2 = new HashSet<>();
        set2.add("tst1");
        set2.add("tst2");
        set2.add("tst3");
        set2.add("tst6");
        set2.add("tst7");

        set1.addAll(set2);

        System.out.println("Kesiþim : " + set1);

        Set<String> set = new HashSet<>();

        long delta = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            set.add("test str" + i);
        }
        delta = System.nanoTime() - delta;
        System.out.println("ListTest Delta : " + delta);

        System.gc();
        try {
            Thread.sleep(2_000);
        } catch (Exception e) {
        }

        delta = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            set.add("test str" + i);
        }
        delta = System.nanoTime() - delta;
        System.out.println("ListTest Delta : " + delta);

        delta = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            set.contains("test str" + i);
        }
        delta = System.nanoTime() - delta;
        System.out.println("ListTest get Delta : " + delta);

        delta = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            set.remove("test str" + i);
        }
        delta = System.nanoTime() - delta;
        System.out.println("ListTest remove Delta : " + delta);
    }
}
