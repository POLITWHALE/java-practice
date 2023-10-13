# Java Practice

Here are some practice problems for basic Java syntax and language.

## Method Writing
1. Write a method `double mean(int[] arr)` that takes an array of integers as inputs and returns the arithmetic mean as output. Recall that the mean of a sequence $x_i$ with $n$ elements is given by:
$$\bar{x}=\frac{1}{n}\sum_{i=0}^{n-1}x_i$$

2. Write a method `void reverseArray(int[] arr)` that takes an array as input and reverses it.
3. Recall that the factorial function $n!$ is defined to be:
$$n!=n\cdot (n-1)\cdots 1$$
Or, equivalently:
$$0!=1,\hspace{10pt}n!=n\cdot (n-1)!$$
Write a method `int factorial(int n)` that returns $n!$.

4. Write a method `double power(double base, int exponent)` that calculuates and returns `base` raised to the power of `exponent`. <ins>Note:</ins> You are **NOT** allowed to use `Math.pow()` to help you.

5. Write a method `boolean search(int[][] arr, int target)` that returns true iff `target` is found within the two-dimensional array `arr`.

## Classes and Polymorphism
5. Create an abstract class `Account` with attributes `accountNumber` and `balance`, and abstract methods,
- `void deposit(double amount)`, and
- `void withdraw(double amount)`.

Create two subclasses, `SavingsAccount` and `CurrentAccount` and implement the methods for each.

## Problem: Pirate Crew
You are building a system to manage a pirate crew. The crew is composed of differtent types of members: Captains, Swordsmen, and Navigators.

Create an abstract class `Pirate` with the following attributes:
- `name` (String)
- `bounty` (int)
- `hasDevilFruit` (boolean)

It should have the method:
- `void introduce()`: This method prints the pirate's name, bounty, and whether they have a devil fruit power.

Create three subclasses: `Captain`, `Swordsman`, and `Navigator`.
* For `Captain`:
  * Has attribute `shipName` (string)
  * Implement `introduce()` to include ship's name
* For `Swordsman`:
  * Has attribute `swordStyle` (string) indicate the swordsman's unique fighting style (e.g., "Three-Sword Style")
  * Implement `introduce()` to include the sword style
* The `Navigator` class does not include additional attributes.

Finally, create a class `PirateCrew` that manages an array of `Pirate` objeects. It should have the following methods:
* `void addPirate(Pirate pirate)`: Adds a pirate to the crew.
* `void removePirate(String name)`: Removes a pirate from the crew based on their name.
* `void introduceCrew()`: Calls `introduce()` for each member of the crew.

Some example uses:
```java
public class PirateCrewApp {
    public static void main(String[] args) {
        PirateCrew crew = new PirateCrew();

        Captain captain = new Captain("Monkey D. Luffy", 1500000000, true, "Thousand Sunny");
        Swordsman swordsman = new Swordsman("Roronoa Zoro", 320000000, false, "Three-sword Style");
        Navigator navigator = new Navigator("Nami", 66000000, false);

        crew.addPirate(captain);
        crew.addPirate(swordsman);
        crew.addPirate(navigator);

        crew.introduceCrew();
    }
}
```