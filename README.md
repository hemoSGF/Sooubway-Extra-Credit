First Aproach: The Subclass Explosion (One Class Per Combination)
How it works is that you construct a new, specialized subclass for each potential sandwich and topping combination.
Examples include hardcoding highly specific classes such as ChickenWithMustard, VeggieWithEgg and TunaWithTahini.

The Catch: This creates a major burden for code maintenance. If the business adds only one new sauce or changes the bread type, the number of new subclasses you must build grows exponentially.
------------------------------------------------------------------------------------------------------------------------------------------------------
Second Aproach: The Mega Base Class (With Boolean Flags)
How It Works: You create a large abstract Sandwich base class that contains a boolean variable for each topping offered on the menu (such as hasRanch or hasBlueCheese). The kid classes calculate the final cost by calling the parent's getPrice() function and adding up all of the desired toppings.
The Catch: It is extremely stiff. Every time a pricing changes or a topper is added/removed, you must delve inside and adjust the basic base class. Furthermore, simple boolean flags make handling special orders like "double meat" or "extra mayo" nearly difficult.
------------------------------------------------------------------------------------------------------------------------------------------------------
Third Apraoch: The Decorator Pattern (Ideal Solution)
How It Works: Both the core sandwiches and the add-on condiments use the same Sandwich interface (or abstract type). To "wrap" a sandwich in a topping, give the core sandwich object directly into the condiment's constructor.
As a result, the primary program communicates with the outermost layer as if it were a regular sandwich. In truth, it's communicating with a Condiment Wrapper (Decorator), which effortlessly adds its own price and behavior to the base sandwich.