public class Main {

    public static void main(String[] args) {

        SubscriptionPlanDirector director =
                new SubscriptionPlanDirector();

        SubscriptionPlan basicPlan =
                director.createBasicPlan();

        SubscriptionPlan standardPlan =
                director.createStandardPlan();

        SubscriptionPlan premiumPlan =
                director.createPremiumPlan();

        basicPlan.showPlan();
        standardPlan.showPlan();
        premiumPlan.showPlan();

        SubscriptionPlan customPlan =
                new SubscriptionPlanBuilder()
                        .setName("Ultra")
                        .setPrice(1000)
                        .setDurationMonths(12)
                        .setMaxDevices(10)
                        .setAutoRenewal(false)
                        .setStorageGb(100)
                        .setSupport("Standard")
                        .addFeature("Discount")
                        .addFeature("API Access")
                        .addFeature("Cloud Storage")
                        .build();

        customPlan.showPlan();
    }
}