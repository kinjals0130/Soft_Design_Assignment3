# Advantages/Disadvantages:
## Advantages:
- The MVC pattern allows you to easily maintain the application as it promotes Seperation of Concerns
- In MVC can create mutiple views for a model because Model and View don't depend on eachother, thus can create changes in the Model without affecting the entire architecture
- The Observer pattern is less complex than the MVC approach thus improved performance
- With the Observer pattern if you want to add and/or remove Observers no modification is needed to be done to the Subject
## Disadvantages:
- There is less data abstraction in approach 1 compared to the other 2 approaches because there is no View interface
- In Observer pattern approach the observers are notified in random order unlike MVC 
- In Observer pattern appraoch you don't know which observers(Display, TicketPrinter) the subject (CashRegister) is notifying
- The MVC approach is more complex than the Observer approach
