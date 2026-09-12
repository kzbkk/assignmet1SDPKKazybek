import java.util.List;

public class SubscriptionPlan {

    private final String name;
    private final double price;
    private final int durationMonths;
    private final int maxDevices;
    private final int storageGb;
    private final String support;
    private final boolean autoRenewal;
    private final List<String> features;

    public SubscriptionPlan(
            String name,
            double price,
            int durationMonths,
            int maxDevices,
            int storageGb,
            String support,
            boolean autoRenewal,
            List<String> features) {

        this.name = name;
        this.price = price;
        this.durationMonths = durationMonths;
        this.maxDevices = maxDevices;
        this.storageGb = storageGb;
        this.support = support;
        this.autoRenewal = autoRenewal;
        this.features = features;
    }

    public void showPlan() {
        System.out.println("===== SUBSCRIPTION PLAN =====");
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Duration: " + durationMonths + " month(s)");
        System.out.println("Max Devices: " + maxDevices);
        System.out.println("Storage: " + storageGb + " GB");
        System.out.println("Support: " + support);
        System.out.println("Auto Renewal: " + autoRenewal);
        System.out.println("Features: " + features);
        System.out.println();
    }
}