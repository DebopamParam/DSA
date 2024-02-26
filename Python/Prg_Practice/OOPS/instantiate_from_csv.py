from typing import Optional


class Item:
    # Class Variable
    discounted_rate = 0.8
    _all = []

    # Constructor
    def __init__(
            self,
            name: Optional[str] = "",
            price: Optional[float] = 0.0,
            quantity: Optional[int] = 0,
    ) -> None:
        # Type check
        assert isinstance(name, str)
        assert isinstance(float(price), float)
        assert isinstance(quantity, int)

        # Initialize Attributes
        self.name = name
        self.price = price
        self.quantity = quantity

        # Adding each instance to the List after creation & initialization
        Item._all.append(self)

    def __repr__(self) -> str:
        return f"Item(name='{self.name}', price={self.price}, quantity={self.quantity})"

    def calculate_total_price(self) -> float:
        """Calculate the total Bill"""
        return self.price * self.quantity

    def apply_discount(self) -> float:
        """Apply Discount if applicable"""
        return self.price * self.discounted_rate


# Main
order1 = Item("Phone", 100, 3)
order2 = Item("Laptop", 1000, 3)
order3 = Item("Mouse", 20, 10)

print(order2.__dict__)

