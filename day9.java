interface PaymentGateway{

List<String> paymentMethods;

List<Double> amounts;

abstract void processPayment(double amount);

}



class CreditCardPayment implements PaymentGateway{

void processPayment(double amount){

System.out.printf("Processing credit card payment of %.2f%n", amount);

}

}



class UPIPayment implements PaymentGateway{

void processPayment(double amount){

System.out.printf("Processing UPI payment of %.2f%n", amount);

}

}

