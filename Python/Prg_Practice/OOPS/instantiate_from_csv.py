from typing import Optional
import csv


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

    def __repr__(self) -> str:
        return f"Item(name='{self.name}', price={self.price}, quantity={self.quantity})"

    @classmethod
    def instantiate_from_csv(cls):
        with open("items.csv") as f:
            reader = csv.DictReader(f)
            items = list(reader)
        for item in items:
            Item(name=item["name"],
                 price=float(item["price"]),
                 quantity=int(item.get("quantity")),
                 )

    def calculate_total_price(self) -> float:
        """Calculate the total Bill"""
        return self.price * self.quantity

    def apply_discount(self) -> float:
        """Apply Discount if applicable"""
        return self.price * self.discounted_rate

    @classmethod
    def get_all(cls):
        return cls.__all


# Main
Item.instantiate_from_csv()
i = 1
for item in Item.get_all():
    print(f"**************   ITEM  {i}  *****************")
    print("Before Discount")
    print(f"{item.name} - {item.price}$ - {item.quantity} piece")
    print("After Discount")
    print(f"{item.name} - {item.apply_discount()}$ - {item.quantity} piece")
    print(f"Total bill : {item.calculate_total_price()} \n\n\n")
    i += 1
del i
