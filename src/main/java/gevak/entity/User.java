package gevak.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String surName;
    private String name;
    private int p1;
    private int p2;
    private int p3;
    private int atestat;

    public User() {
    }

    public User(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public User(int p1, int p2, int p3, int atestat) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.atestat = atestat;
    }

    public User(String name, String surName, int p1, int p2, int p3, int atestat) {
        this.name = name;
        this.surName = surName;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.atestat = atestat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public int getP3() {
        return p3;
    }

    public void setP3(int p3) {
        this.p3 = p3;
    }

    public int getAtestat() {
        return atestat;
    }

    public void setAtestat(int atestat) {
        this.atestat = atestat;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", Surname='" + surName + '\'' +
                ", Name='" + name + '\'' +
                ", P1=" + p1 +
                ", P2=" + p2 +
                ", P3=" + p3 +
                ", Atestat=" + atestat +
                '}';
    }
}
