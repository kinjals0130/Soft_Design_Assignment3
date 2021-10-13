# Advantages/Disadvantages of 3 Approaches:
## Advantages:
- The MVC pattern allows you to easily maintain the application as it promotes Separation of Concerns.
- In MVC, you can create mutiple views for a model because Model and View don't depend on each other, therfore, you can create changes in the Model without affecting the entire architecture.
- The Observer pattern is less complex compared to the MVC approach thus, improving performance.
- No modification is needed to be done to the Subject in order to add and/or remove Observers while using the Observer pattern.
## Disadvantages:
- There is less data abstraction in exercise 1 compared to the other 2 exercises because there is no View interface.
- In Observer pattern approach the observers are notified in random order unlike MVC.
- In Observer pattern approach you don't know which Observers (Display, TicketPrinter) the Subject (CashRegister) is notifying.
- The MVC approach is more complex than the Observer approach.
