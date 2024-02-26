from typing import Optional


class Car:
    """Vroom Vroom"""

    # Class Variable
    pay_rate = 0.8

    # Constructor
    def __init__(
        self,
        model: Optional[str] = "",
        year: Optional[int] = 0,
        color: Optional[str] = "",
    ) -> None:
        # Run validation of received arguments
        assert isinstance(model, str) or model == ""
        assert isinstance(year, int) or year == 0
        assert isinstance(color, str) or color == ""

        # Assign instance attributes with the help of received args
        self.model = model
        self.year = year
        self.color = color

    # /__init__

    def __repr__(self) -> str:
        return f"Car(model='{self.model}', year={self.year}, color='{self.color}', pay_rate={Car.pay_rate})"


# MAIN
toyota = Car("Nexon",2012,"")

print(toyota)
