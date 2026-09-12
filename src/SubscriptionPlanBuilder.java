import java.util.ArrayList;
import java.util.List;

public class SubscriptionPlanBuilder {

    private static final double MIN_PRICE = 0.0;
    private static final int MIN_DURATION_MONTHS = 1;
    private static final int MIN_DEVICES = 1;
    private static final int MIN_STORAGE_GB = 1;
    private static final int MAX_DEVICES = 20;
    private static final int MAX_STORAGE_GB = 1000;

    private String name;
    private double price;
    private int durationMonths;
    private int maxDevices;
    private int storageGb;
    private String support;
    private boolean autoRenewal;
    private final List<String> features = new ArrayList<>();

    public SubscriptionPlanBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public SubscriptionPlanBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public SubscriptionPlanBuilder setDurationMonths(int durationMonths) {
        this.durationMonths = durationMonths;
        return this;
    }

    public SubscriptionPlanBuilder setMaxDevices(int maxDevices) {
        this.maxDevices = maxDevices;
        return this;
    }

    public SubscriptionPlanBuilder setStorageGb(int storageGb) {
        this.storageGb = storageGb;
        return this;
    }

    public SubscriptionPlanBuilder setSupport(String support) {
        this.support = support;
        return this;
    }

    public SubscriptionPlanBuilder setAutoRenewal(boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
        return this;
    }

    public SubscriptionPlanBuilder addFeature(String feature) {
        this.features.add(feature);
        return this;
    }

    public SubscriptionPlan build() {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name is required.");
        }

        if (price < MIN_PRICE) {
            throw new IllegalArgumentException(
                    "Price cannot be negative."
            );
        }
        if (durationMonths < MIN_DURATION_MONTHS) {
            throw new IllegalArgumentException(
                    "Duration must be at least 1 month."
            );
        }
        if (maxDevices < MIN_DEVICES || maxDevices > MAX_DEVICES) {
            throw new IllegalArgumentException(
                    "Devices must be between "
                            + MIN_DEVICES + " and " + MAX_DEVICES + "."
            );
        }
        if (storageGb < MIN_STORAGE_GB || storageGb > MAX_STORAGE_GB) {
            throw new IllegalArgumentException(
                    "Storage must be between "
                            + MIN_STORAGE_GB + " and "
                            + MAX_STORAGE_GB + " GB."
            );
        }
        if (support == null || support.isBlank()) {
            throw new IllegalArgumentException(
                    "Support level is required."
            );
        }
        return new SubscriptionPlan(
                name,
                price,
                durationMonths,
                maxDevices,
                storageGb,
                support,
                autoRenewal,
                new ArrayList<>(features)
        );
    }
}