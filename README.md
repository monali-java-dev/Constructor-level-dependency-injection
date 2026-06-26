# Constructor Level Dependency Injection (Core Java)

## 📌 Project Overview

This project demonstrates the **Constructor Level Dependency Injection** concept using **Core Java**.

The `PaymentService` class depends on the `IPayment` interface. The required payment implementation is injected through the constructor, which makes the application loosely coupled and flexible.

---

## 📂 Project Structure

```text
src
 └── com.service
      ├── IPayment.java
      ├── UpiPayment.java
      ├── DebitCardPayment.java
      ├── CreditCardPayment.java
      ├── PaymentService.java
      └── Test.java
```

---

## 📖 Classes

### IPayment.java

* Interface containing the `Pay()` method.
* Implemented by different payment methods.

### UpiPayment.java

* Implements `IPayment`.
* Processes payment using UPI.

### DebitCardPayment.java

* Implements `IPayment`.
* Processes payment using Debit Card.

### CreditCardPayment.java

* Implements `IPayment`.
* Processes payment using Credit Card.

### PaymentService.java

* Target class.
* Receives the dependency through the constructor.
* Calls the payment method using the injected object.

### Test.java

* Creates payment objects.
* Injects dependency into `PaymentService`.
* Demonstrates payment using different payment methods.

---

## 🔄 Constructor Dependency Injection Flow

```text
                IPayment
                    ▲
        ┌───────────┼────────────┐
        │           │            │
        │           │            │
UpiPayment   DebitCardPayment   CreditCardPayment
        │           │            │
        └───────────┼────────────┘
                    │
                    ▼
            PaymentService
                    │
                    ▼
              doPayment()
```

---

## ▶️ Sample Output

```text
payment is completed using upiPayment
Payment Completed

payment successfully using debitcard payment
Payment Completed

payment successfully debit using creditcardPayment
Payment Completed
```

---

## 💡 Constructor Injection Example

```java
DebitCardPayment debit = new DebitCardPayment();

PaymentService service = new PaymentService(debit);

service.doPayment(4000.0);
```

---

## 🚀 Concepts Covered

* Interface
* Runtime Polymorphism
* Constructor Injection
* Dependency Injection
* Loose Coupling
* Object Collaboration
* Abstraction

---

## 🛠️ Technologies Used

* Java
* Eclipse IDE
* Git
* GitHub

---

## 👩‍💻 Author

**Monali Babasaheb Palve**
