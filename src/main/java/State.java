/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 204641
 */
public class State {
    
    private String stateName;
    private Double baseSalesTax;
    private Double surtax;
    private Double groceryTax;
    private Double preparedFoodTax;
    private Double prescriptionDrugTax;
    private Double nonprescriptionDrugTax;
    private Double clothingTax;
    private Double intangiblesTax;

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Double getBaseSalesTax() {
        return baseSalesTax;
    }

    public void setBaseSalesTax(Double baseSalesTax) {
        this.baseSalesTax = baseSalesTax;
    }

    public Double getSurtax() {
        return surtax;
    }

    public void setSurtax(Double surtax) {
        this.surtax = surtax;
    }

    public Double getGroceryTax() {
        return groceryTax;
    }

    public void setGroceryTax(Double groceryTax) {
        this.groceryTax = groceryTax;
    }

    public Double getPreparedFoodTax() {
        return preparedFoodTax;
    }

    public void setPreparedFoodTax(Double preparedFoodTax) {
        this.preparedFoodTax = preparedFoodTax;
    }

    public Double getPrescriptionDrugTax() {
        return prescriptionDrugTax;
    }

    public void setPrescriptionDrugTax(Double prescriptionDrugTax) {
        this.prescriptionDrugTax = prescriptionDrugTax;
    }

    public Double getNonprescriptionDrugTax() {
        return nonprescriptionDrugTax;
    }

    public void setNonprescriptionDrugTax(Double nonprescriptionDrugTax) {
        this.nonprescriptionDrugTax = nonprescriptionDrugTax;
    }

    public Double getClothingTax() {
        return clothingTax;
    }

    public void setClothingTax(Double clothingTax) {
        this.clothingTax = clothingTax;
    }

    public Double getIntangiblesTax() {
        return intangiblesTax;
    }

    public void setIntangiblesTax(Double intangiblesTax) {
        this.intangiblesTax = intangiblesTax;
    }

    @Override
    public String toString() {
        return "State{" + "baseSalesTax=" + baseSalesTax + ", surtax=" + surtax +
                ", groceryTax=" + groceryTax + ", preparedFoodTax=" + preparedFoodTax +
                ", prescriptionDrugTax=" + prescriptionDrugTax + ", nonprescriptionDrugTax=" + 
                nonprescriptionDrugTax + ", clothingTax=" + clothingTax + ", intangiblesTax=" + intangiblesTax + '}';
    }
    
    
            
}
