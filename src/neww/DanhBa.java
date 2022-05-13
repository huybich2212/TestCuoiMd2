package neww;

import java.time.LocalDate;
import java.util.Date;


public class DanhBa {
    private int soDt;
    private LocalDate dateOfBritd;
    private String name,group,sex,address,email;


    public DanhBa() {
    }

    public DanhBa(int soDt, LocalDate dateOfBritd, String name, String group, String sex, String address, String email) {
        this.soDt = soDt;
        this.dateOfBritd = dateOfBritd;
        this.name = name;
        this.group = group;
        this.sex = sex;
        this.address = address;
        this.email = email;
    }

    public int getSoDt() {
        return soDt;
    }

    public void setSoDt(int soDt) {
        this.soDt = soDt;
    }

    public LocalDate getDateOfBritd() {
        return dateOfBritd;
    }

    public void setDateOfBritd(LocalDate dateOfBritd) {
        this.dateOfBritd = dateOfBritd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "DanhBa{" +
                "soDt=" + soDt +
                ", dateOfBritd=" + dateOfBritd +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
