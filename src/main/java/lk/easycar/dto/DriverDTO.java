package lk.easycar.dto;

public class DriverDTO {
    private String license;
    private String name;
    private String address;
    private String contact;

    public DriverDTO(String license, String name, String address, String contact) {
        this.license = license;
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    public DriverDTO() {
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "DriverDTO{" +
                "license='" + license + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
