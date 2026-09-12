public class SubscriptionPlanDirector {

    public SubscriptionPlan createBasicPlan() {
        return new SubscriptionPlanBuilder()
                .setName("Basic")
                .setDurationMonths(1)
                .setPrice(10)
                .setMaxDevices(2)
                .setStorageGb(10)
                .setAutoRenewal(true)
                .setSupport("Basic")
                .addFeature("Cloud Backup")
                .build();
    }

    public SubscriptionPlan createStandardPlan() {
        return new SubscriptionPlanBuilder()
                .setName("Standard")
                .setDurationMonths(1)
                .setPrice(20)
                .setMaxDevices(5)
                .setStorageGb(50)
                .setAutoRenewal(true)
                .setSupport("Standard")
                .addFeature("Analytics")
                .addFeature("Cloud Storage")
                .build();
    }

    public SubscriptionPlan createPremiumPlan() {
        return new SubscriptionPlanBuilder()
                .setName("Premium")
                .setDurationMonths(1)
                .setPrice(50)
                .setMaxDevices(20)
                .setStorageGb(200)
                .setAutoRenewal(true)
                .setSupport("Premium")
                .addFeature("Analytics")
                .addFeature("Cloud Storage")
                .addFeature("API Access")
                .addFeature("File Sharing")
                .build();
    }
}