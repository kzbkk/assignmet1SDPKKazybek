This is a Java program for creating subscription plans.

For example:
  Basic
  Standard
  Premium
  Ultra

Each plan has its own settings:
  name;
  price;
  subscription duration;
  number of devices;
  storage capacity;
  support level;
  automatic renewal;
  additional features.


The project has 4 main classes.

SubscriptionPlan
This is the final subscription plan.
It stores all information about the subscription.

SubscriptionPlanBuilder
This class creates a subscription plan step by step.
For example:
```
SubscriptionPlan plan = new SubscriptionPlanBuilder()
        .setName("Ultra")
        .setPrice(1000)
        .setDurationMonths(12)
        .setMaxDevices(10)
        .setStorageGb(100)
        .setSupport("Standard")
        .setAutoRenewal(false)
        .addFeature("Discount")
        .build();
```

We can add the settings one by one.

SubscriptionPlanDirector
The Director creates predefined standard plans.
For example:
```
createBasicPlan()
createStandardPlan()
createPremiumPlan()
```

Main

`Main` runs the program and displays the created subscription plans.

---



A subscription plan has many parameters.
Without the Builder, the code would look like this:

```
new SubscriptionPlan(
        "Ultra",
        1000,
        12,
        10,
        100,
        "Standard",
        false,
        features
);
```

It is difficult to understand what each number means.
With the Builder, the code is much easier to read:

```
new SubscriptionPlanBuilder()
        .setName("Ultra")
        .setPrice(1000)
        .setDurationMonths(12)
        .setMaxDevices(10)
        .setStorageGb(100)
        .build();
```


Clean Code
1. Meaningful Names
I used clear names for methods and variables.

```
int d;
int s;
```
--->
```java
int durationMonths;
int storageGb;
```

The names immediately show what the variables mean.

2. Small Methods
Each method performs one task.
For example:
```
public SubscriptionPlanBuilder setPrice(double price) {
    this.price = price;
    return this;
}
```
This method only sets the price.

3. Separation of Classes
I divided the program into several classes:
```
SubscriptionPlan
SubscriptionPlanBuilder
SubscriptionPlanDirector
Main
```
Each class has its own responsibility.
`SubscriptionPlan` stores the data.
`SubscriptionPlanBuilder` creates the subscription plan.
`SubscriptionPlanDirector` creates predefined plans.
`Main` runs the program.

4. Data Validation

Before creating a subscription plan, the Builder checks the data.
For example:
```
if (durationMonths <= 0) {
    throw new IllegalArgumentException(
            "Duration must be greater than 0."
    );
}
```
This prevents creating a subscription plan with an invalid duration.

5. No Magic Numbers

Instead of using an unexplained number, we can use a constant.

```
if (maxDevices > 20) {
    ...
}
```
--->
```java
private static final int MAX_DEVICES = 20;

if (maxDevices > MAX_DEVICES) {
    ...
}
```
Now it is clear that `20` is the maximum number of devices.

Technologies
Java
IntelliJ IDEA
Git
GitHub
Builder Pattern



