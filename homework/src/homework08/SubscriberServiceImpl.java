package homework08;


public class SubscriberServiceImpl implements SubscriberService {


    @Override
    public void printAllSubsriberByFirstLetter(Subscriber[] subscribers, String firstLetter) {
        System.out.println("Subscribers last name begins with " + firstLetter);
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getLastName().startsWith(firstLetter.toUpperCase())) {
                System.out.println(subscriber.getFirstName() + " " + subscriber.getLastName() + ", phone number= "
                        + subscriber.getPhoneNumber() + ", balance= " + subscriber.getBalance());
            }
        }
        System.out.println();
    }

    @Override
    public void printAllSubsriberByCityCallDurationLimit(Subscriber[] subscribers, int cityCallDurationLimit) {
        System.out.println("Subscribers that spent more than " + cityCallDurationLimit + " city call min");
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getCityCallDurationMin() > cityCallDurationLimit) {
                System.out.println(subscriber);
            }
        }
        System.out.println();
    }

    @Override
    public void printAllSubsriberByInterCityCalls(Subscriber[] subscribers) {
        System.out.println("Subscribers that used interCity calls");
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getInterCityCallDurationMin() > 0) {
                System.out.println(subscriber);
            }
        }
        System.out.println();
    }

    @Override
    public void printTotalInternetTrafficByCity(Subscriber[] subscribers, String city) {
        int summ = 0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getCity().equals(city)) {
                summ = summ + subscriber.getInternetTrafficGb();
            }
        }
        System.out.println("Total traffic for city " + city + " = " + summ + " Gb");
        System.out.println();
    }

    @Override
    public void printSubsribersWithNegativeBalanceCount(Subscriber[] subscribers) {
        int counter = 0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getBalance() < 0) {
                counter++;
            }
        }
        System.out.println("Subsribers with negative balance count = " + counter);
        System.out.println();
    }

}
