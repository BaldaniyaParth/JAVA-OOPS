# Car Rental System

## Description
The Car Rental System is a Java-based application designed to manage a fleet of cars and customers. It allows users to rent and return cars through an interactive menu. The system handles availability checks and rental calculations.

## Features
- **Car Management**: Add cars to the fleet with brand, model, and daily base price details.
- **Customer Management**: Add and manage customer details.
- **Rental Management**: Rent cars to customers, calculate rental costs, and return cars.
- **Interactive Menu**: User-friendly menu to navigate through rental and return processes.

## Classes and Methods

### `Car`
Represents a car in the rental system.
- **Fields**:
  - `carId` (String): Unique identifier for the car.
  - `brand` (String): Brand of the car.
  - `model` (String): Model of the car.
  - `basePricePerDay` (double): Base price per day for renting the car.
  - `isAvailable` (boolean): Availability status of the car.
- **Methods**:
  - `getCarId()`: Returns the car ID.
  - `getBrand()`: Returns the car brand.
  - `getModel()`: Returns the car model.
  - `calculatePrice(int rentalDays)`: Calculates the rental price for the given days.
  - `isAvailable()`: Checks if the car is available.
  - `rent()`: Marks the car as rented.
  - `returnCar()`: Marks the car as returned.

### `Customer`
Represents a customer in the rental system.
- **Fields**:
  - `customerId` (String): Unique identifier for the customer.
  - `name` (String): Name of the customer.
- **Methods**:
  - `getCustomerId()`: Returns the customer ID.
  - `getName()`: Returns the customer name.

### `Rental`
Represents a rental transaction.
- **Fields**:
  - `car` (Car): The car being rented.
  - `customer` (Customer): The customer renting the car.
  - `days` (int): Number of days for the rental.
- **Methods**:
  - `getCar()`: Returns the rented car.
  - `getCustomer()`: Returns the customer renting the car.
  - `getDays()`: Returns the number of rental days.

### `CarRentalSystem`
Manages the car rental operations.
- **Fields**:
  - `cars` (List<Car>): List of cars available for rent.
  - `customers` (List<Customer>): List of customers.
  - `rentals` (List<Rental>): List of current rentals.
- **Methods**:
  - `addCar(Car car)`: Adds a car to the list.
  - `addCustomer(Customer customer)`: Adds a customer to the list.
  - `rentCar(Car car, Customer customer, int days)`: Rents a car to a customer for a specified number of days.
  - `returnCar(Car car)`: Returns a rented car.
  - `menu()`: Displays the menu for car rental operations.

## Usage
```java
public class Main {
    public static void main(String[] args) {
        CarRentalSystem rentalSystem = new CarRentalSystem();

        Car car1 = new Car("C001", "Toyota", "Camry", 60.0);
        Car car2 = new Car("C002", "Honda", "Accord", 70.0);
        Car car3 = new Car("C003", "Mahindra", "Thar", 150.0);
        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        rentalSystem.addCar(car3);

        rentalSystem.menu();
    }
}
```

### Getting Started

1. Clone the repository:
```bash
    git clone https://github.com/yourusername/CarRentalSystem.git
```

2. Navigate to the project directory:
```bash
    cd CarRentalSystem
```

3. Compile the Java files:
```bash
    javac *.java
```

4. Run the application:
```bash
    java Main
```

### Author
- Parth Baldaniya