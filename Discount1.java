public class Discount1 {
    public static double getDiscount1(double amount){
    double discount1=0.0;
    if(amount >5000){
        discount1=amount*0.10;
    }
    else if(amount>1000 &&amount<=5000){
        discount1=amount*0.05;
    }
    return discount1;
}  

public static void main(String[] args){
    discount1 = getDiscount1(7000);
    System.out.println(discount1);

}

}