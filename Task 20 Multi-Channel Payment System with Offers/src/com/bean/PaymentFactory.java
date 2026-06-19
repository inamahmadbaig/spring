package com.bean;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Interface.Payment;

@Component
public class PaymentFactory {
	@Autowired
	private Map<String, Payment> paymentMap;
	
	
	
	public Payment getPayment(String type) {
		 if (type == null || type.isBlank()) {
		        System.out.println("Please enter a payment type");
		        return null;
		    }
		 Payment payment = paymentMap.get(type.trim().toLowerCase());
		 if(payment == null) {
			 System.out.println("Invalid payment type! Please choose: UPI, Credit Card, Debit Card");
		        return null;
		 }
		 return payment;
	}
}
/*1. Class ka purpose
@Component
public class PaymentFactory
@Component ka matlab hai ki Spring is class ko bean ke form mein manage karega.
Ye class ek factory class hai jo different payment methods (like UPI, Card, PayPal etc.) return karegi.
🔹 2. Map injection
@Autowired
private Map<String, Payment> paymentMap;

Yahan Spring automatically ek Map inject karta hai:

Key (String) → bean ka naam (e.g. "upiPayment", "cardPayment")
Value (Payment) → us bean ka object

👉 Matlab Spring automatically saare Payment interface implement karne wale beans ko collect karke Map bana deta hai.

Example:

upiPayment -> UpiPayment class object
cardPayment -> CardPayment class object
🔹 3. Payment interface
import com.Interface.Payment;
Ye ek interface hoga jisme method define honge, jaise:
public interface Payment {
    void pay(double amount);
}
Different classes (UPI, Card, etc.) isko implement karengi.
🔹 4. getPayment method
public Payment getPayment(String type)

Ye method input leta hai:

type → kis payment method ka object chahiye
🔹 5. Map se object lena
Payment payment = paymentMap.get(type.toLowerCase());
type ko lowercase mein convert kiya ja raha hai
Map se matching payment bean fetch hota hai

Example:

type = "UPI"
→ "upi" ban gaya
→ paymentMap.get("upi")
→ UpiPayment object mil gaya
🔹 6. Error handling
if(payment == null) {
    throw new IllegalArgumentException("Invalid Payment type: " + type);
}

Agar galat type diya:

type = "bitcoin"

→ Map me nahi mila → exception throw ho jayega:

Invalid Payment type: bitcoin
🔹 7. Return object
return payment;

Valid payment object return ho jata hai.

🧠 Simple Summary

Ye class ek Factory Design Pattern implement kar rahi hai:

👉 User input deta hai (like "upi", "card")
👉 Spring Map se correct Payment implementation find karta hai
👉 Uska object return karta hai

🚀 Real-life analogy

Socho ek restaurant hai 🍽️:

UPI bolo → UPI counter
Card bolo → Card counter
Cash bolo → Cash counter

PaymentFactory waiter hai jo tumhe correct counter pe le jata hai 😄
*/