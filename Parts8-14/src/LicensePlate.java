public class LicensePlate {
    private final String licenseNum;
    private final String country;

    public LicensePlate(String country, String licenseNum) {
        this.licenseNum = licenseNum;
        this.country = country;
    }

    public String getLicenseNum() { return licenseNum;}

    public String getCountry() {return country;}

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof LicensePlate)) {
            return false;
        }

        LicensePlate val = (LicensePlate) object;
        if (val.getLicenseNum().equals(licenseNum) && val.getCountry().equals(country)) {
            return true;
        }

        return false;
    }

    public int hashCode() {
        return licenseNum.hashCode() + country.hashCode();
    }

    @Override
    public String toString() {
        return country + " " + licenseNum;
    }
}
