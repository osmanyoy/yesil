package com.metod.java.training.collections;

public class MySetObj {
    private String string;
    private int a;

    public String getString() {
        return this.string;
    }

    public void setString(final String string) {
        this.string = string;
    }

    public int getA() {
        return this.a;
    }

    public void setA(final int a) {
        this.a = a;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + this.a;
        result = (prime * result) + ((this.string == null) ? 0 : this.string.hashCode());
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
        if (this.a != other.a) {
            return false;
        }
        if (this.string == null) {
            if (other.string != null) {
                return false;
            }
        } else if (!this.string.equals(other.string)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MyToString [str=" + this.string + ", adsd=" + this.a + "]";
    }

    public String toShortString() {
        return "3r";
    }

    public static void main(final String[] args) {
        // MySetObj mySetObj = null;

        MySetObj mySetObj = new MySetObj();
        mySetObj.setString("osman");
        mySetObj.setA(10);

        System.out.println("MySetObj1 : " + mySetObj);

        System.out.println("MySetObj2 : " + (mySetObj == null ? "NULL" : mySetObj.toString()));
    }
}
