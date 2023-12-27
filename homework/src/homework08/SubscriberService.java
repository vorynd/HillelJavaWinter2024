package homework08;

public interface SubscriberService {

    void printAllSubsriberByFirstLetter(Subscriber[] subscribers, String firstLetter);

    void printAllSubsriberByCityCallDurationLimit(Subscriber[] subscribers, int interCityCallDurationLimit);

    void printAllSubsriberByInterCityCalls(Subscriber[] subscribers);

    void printTotalInternetTrafficByCity(Subscriber[] subscribers, String city);

    void printSubsribersWithNegativeBalanceCount(Subscriber[] subscribers);
}
