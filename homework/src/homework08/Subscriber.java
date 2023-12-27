package homework08;

public class Subscriber {

    private int id;
    private String lastName;
    private String firstName;
    private String city;
    private String phoneNumber;
    private String contractNumber;
    private int balance;
    private int cityCallDurationMin;
    private int interCityCallDurationMin;
    private int internetTrafficGb;



    public Subscriber(int id, String lastName, String firstName, String city, String phoneNumber, String contractNumber,
                      int balance, int cityCallDurationMin, int interCityCallDurationMin, int internetTrafficGb) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.contractNumber = contractNumber;
        this.balance = balance;
        this.cityCallDurationMin = cityCallDurationMin;
        this.interCityCallDurationMin = interCityCallDurationMin;
        this.internetTrafficGb = internetTrafficGb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCityCallDurationMin() {
        return cityCallDurationMin;
    }

    public void setCityCallDurationMin(int cityCallDurationMin) {
        this.cityCallDurationMin = cityCallDurationMin;
    }

    public int getInterCityCallDurationMin() {
        return interCityCallDurationMin;
    }

    public void setInterCityCallDurationMin(int interCityCallDurationMin) {
        this.interCityCallDurationMin = interCityCallDurationMin;
    }

    public int getInternetTrafficGb() {
        return internetTrafficGb;
    }

    public void setInternetTrafficGb(int internetTrafficGb) {
        this.internetTrafficGb = internetTrafficGb;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", contractNumber='" + contractNumber + '\'' +
                ", balance=" + balance +
                ", cityCallDurationMin=" + cityCallDurationMin +
                ", interCityCallDurationMin=" + interCityCallDurationMin +
                ", internetTrafficGb=" + internetTrafficGb +
                '}';
    }
}
