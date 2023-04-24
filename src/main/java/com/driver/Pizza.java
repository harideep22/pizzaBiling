package com.driver;

public class Pizza {

    public int basePrice;
    public int cheesePrice;
    public int toppingsPrice;
    public int  paperBagPrice;
    public String bill;
    public int totalPrice;
    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isPaperBagAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        if(isVeg){
            basePrice=300;
            toppingsPrice=70;
        }
        else{
            basePrice=400;
            toppingsPrice=120;
        }
        paperBagPrice=20;
        cheesePrice=80;

        isCheeseAdded=false;
        isPaperBagAdded=false;
        isToppingsAdded=false;
        totalPrice=basePrice;
        bill="Base Price Of The Pizza: "+basePrice+"\n";

    }

    public int getPrice(){
        return totalPrice;
    }

    public void addExtraCheese(){
        if(isCheeseAdded==false){
            isCheeseAdded=true;
            totalPrice+=cheesePrice;

        }
    }

    public void addExtraToppings(){
        if(isToppingsAdded==false){
            isToppingsAdded=true;
            totalPrice+=toppingsPrice;
        }
    }

    public void addTakeaway(){
        if(isPaperBagAdded==false){
            isPaperBagAdded=true;
            totalPrice+=paperBagPrice;
        }
    }

    public String getBill() {
        if(isBillGenerated==false){
            if(isCheeseAdded==true) {
                bill = bill + "Extra Cheese Added: " + cheesePrice + "\n";
            }
            if(isToppingsAdded==true){
                bill=bill+"Extra Toppings Added: "+toppingsPrice+"\n";
            }
            if(isPaperBagAdded==true){
                bill=bill+"Paperbag Added: "+paperBagPrice+"\n";
            }
            bill=bill+"Total Price: "+totalPrice+"\n";
            isBillGenerated = true;
        }
        return bill;
    }
}
