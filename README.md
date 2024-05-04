# decorator-pattern-spring-boot
This project is a template to understand Decorator pattern implementation. README will have the explanation of how things are working in the project.

# Definition
Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

# When to use
1. <b>Adding Responsibilities to Objects:</b> When you have a base object (or set of objects) that needs additional features or responsibilities, but you want to keep these concerns separate and modular.
2. <b>Extending Functionality:</b> If you have a class with a basic set of functionalities and you want to provide additional features to some instances of that class, but not all.
3. <b>Avoiding Subclass Explosion:</b> Instead of creating numerous subclasses to handle different combinations of behaviors, you can use decorators to add functionalities dynamically.
4. <b>Closed for Modification, Open for Extension:</b> Following the Open/Closed Principle of SOLID design, the Decorator Pattern allows you to extend the functionality of existing classes without modifying their code.
5. <b>Flexible Composition:</b> You want to be able to combine multiple behaviors or features in different combinations at runtime.
6. <b>Modular and Reusable Code:</b> Decorators promote a modular and reusable approach to code, where functionalities can be mixed and matched to create new combinations easily.

# Explanation
Decorator pattern can add functionality before and after the execution of a base service layer functionality, In our case we are adding a very basic decoration to the basic message service that intends to send messages to lets say users or groups,etc. Template just have a print statement.