package com.car.rental;

public class PricingPolicy {
    public Category category;
    public double higherPrice;
    public double lowerPrice;
    public long maxDaysHigherPrice;
    public double childSeatPrice;
    public double bikeRackPrice;
    public double kmCostHigher;
    public double kmCostLower;
    public double missingHubcapPenalty;
    public double missingDocumentPenalty;
    public double delayDayMultiplier;

    public PricingPolicy(Category category, double higherPrice, double lowerPrice, long maxDaysHigherPrice, double childSeatPrice, double bikeRackPrice, double kmCostHigher, double kmCostLower, double missingHubcapPenalty, double missingDocumentPenalty, double delayDayMultiplier){
        this.category = category;
        this.higherPrice = higherPrice;
        this.lowerPrice = lowerPrice;
        this.maxDaysHigherPrice = maxDaysHigherPrice;
        this.childSeatPrice = childSeatPrice;
        this.bikeRackPrice = bikeRackPrice;
        this.kmCostHigher = kmCostHigher;
        this.kmCostLower = kmCostLower;
        this.missingHubcapPenalty = missingHubcapPenalty;
        this.missingDocumentPenalty = missingDocumentPenalty;
        this.delayDayMultiplier = delayDayMultiplier;
    }
}
