from typing import Optional


class Item:
    # Class Variable
    discounted_rate = 0.8
    __all = []

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
        Item.__all.append(self)

    @classmethod
    def instantiate_from_csv(cls,path):
        pass

    def __repr__(self) -> str:
        return f"{self.__class__.__name__}(name='{self.name}', price={self.price}, quantity={self.quantity})"

    def get_all(self):
        """Get all instances of the class"""
        return all

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

print(order1)
