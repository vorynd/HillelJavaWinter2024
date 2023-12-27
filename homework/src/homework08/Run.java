package homework08;

public class Run {

    public static void main(String[] args) {
        Subscriber[] subscribers = SubGen.generateSubArray();
        for (Subscriber s : subscribers) {
            System.out.println(s);
        }
        System.out.println();

        SubscriberService subscriberService = new SubscriberServiceImpl();
        subscriberService.printAllSubsriberByCityCallDurationLimit(subscribers, 500);
        subscriberService.printAllSubsriberByInterCityCalls(subscribers);
        subscriberService.printAllSubsriberByFirstLetter(subscribers, "m");
        subscriberService.printTotalInternetTrafficByCity(subscribers,"London");
        subscriberService.printSubsribersWithNegativeBalanceCount(subscribers);
    }

}
