# OOPWeek9
1 a) In object-oriented programming, a class is a blueprint or template for creating objects of a certain type. It defines the attributes and methods that the objects will have. For example, in the company's administration program, there might be a class called "Employee" that defines
the attributes and methods that all employees in the company will have, such as their name, ID number, and salary.
An instantiation of a class, on the other hand, is an actual object that is created from a class. It has its own set of attributes and can use the methods defined in the class. Continuing with the example of the "Employee" class, an instantiation of that class might be an object
representing a specific employee in the company, such as "John Smith" with an ID number of 12345 and a salary of $50,000 per year.

(b) Inheritance is a key principle of object-oriented programming that allows classes to inherit attributes and methods from other classes. In the company's administration program, inheritance could be used in two ways:
1. A "Manager" class could inherit from the "Employee" class, since managers are a type of employee with additional attributes and methods. The Manager class would have its own specific attributes and methods, but would also inherit the general attributes and methods of the Employee class, such as name and salary.

2. Similarly, a "Salesperson" class could inherit from the "Employee" class, since salespeople are also a type of employee with specific attributes and methods related to their job. This would allow for easier management of the different types of employees in the company.

(c) Libraries are pre-existing collections of code that can be used to facilitate the development of programs like the company's administration program. Instead of writing all of the code from scratch, developers can use libraries to handle common tasks or functions,
such as displaying a graphical user interface or performing complex calculations.

2a)
public SalesPerson(String id) {
    this.id = id;
    this.salesHistory = new Sales[100]; // Assuming a maximum of 100 sales for each salesperson
    this.count = 0;
}
b)Accessor methods are necessary for the SalesPerson class to maintain data integrity, improve code readability and maintainability, and offer security and control over the access to its private variables. 
Data integrity: With controlled access to the private variables, users are able to ensure validity by including validation or transformation logic. 
Improve code readability and maintainability: By providing a standardized way to access the values of private variables, it enables developers to understand easily.
Security and control: By using accessor methods, the SalesPerson class can enforce access restrictions and implement additional security measures if needed. Ex: validation checks

c)i)![UML Diagrams drawio](https://github.com/wallacelt25/OOPWeek9/assets/114073349/1f896af7-3ff7-43b5-9f87-bec93bc3e52a)
c)ii)A compatibility issue may occur when design of Sales object is modified which would lead to program crashes.

d)The following statement is the output of the code:
102
2
2550.4
6100.0

e)
public double calcTotalSales() {
    double total = 0.0;
    for (Sales sale: salesHistory) {
      if (sale !=null) {
        totalSales += sale.getValue() * sale.getQuantity();
    }
    return totalSales;
}

f)
public String highest(SalesPerson[] salesPeople) {
  String index = salesPeople[0].calcTotalSales();
  for (int 1 = 1; i < salesPeople.length; i++) {
    SalesPerson person= salesPeople[i];
    if (erson == null) {
      continue;
    }
    double highestTotalSales = person.calcTotalSales();
    if (sales > maxSales) {
            maxSales=sales;
            index person.getID();
        }
    }
    return index
}
g)public static boolean addSales(Sales sale, String id, SalesPerson[] salesPeople) {
    for(SalesPerson person : salesPeople) {
    if (person !=null && person.getId().equals(id)) {
      person.setSalesHistory(sale);
        return true;
       }
    }
    return false;
    
  }
}

h)


