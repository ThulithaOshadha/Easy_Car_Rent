package lk.easycar.dto;

import java.io.FileInputStream;

public class CustomerDTO {
    private String nic;
    private String name;
    private String address;
    private String license;
    private String contact;
    private String password;
    private FileInputStream nicImg;

    public CustomerDTO(String nic, String name, String address, String license, String contact, String password, FileInputStream nicImg) {
        this.nic = nic;
        this.name = name;
        this.address = address;
        this.license = license;
        this.contact = contact;
        this.password = password;
        this.nicImg = nicImg;
    }

    public CustomerDTO() {
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public FileInputStream getNicImg() {
        return nicImg;
    }

    public void setNicImg(FileInputStream nicImg) {
        this.nicImg = nicImg;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "nic='" + nic + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", license='" + license + '\'' +
                ", contact='" + contact + '\'' +
                ", password='" + password + '\'' +
                ", nicImg=" + nicImg +
                '}';
    }
}
