from typing import Optional, Union, List, Tuple


# Example 1: Variable number of integers
def process_integers(*numbers: int) -> None:
    for number in numbers:
        print(number)


# Example 2: Variable number of strings with an optional delimiter
def join_strings(delimiter: Optional[str] = " ", *strings: str) -> str:
    return delimiter.join(strings)


# Example 3: Variable number of floats and an optional threshold
def filter_floats(threshold: Optional[float] = None, *numbers: float) -> List[float]:
    if threshold is None:
        return list(numbers)
    else:
        return [num for num in numbers if num > threshold]


# Example 4: Variable number of mixed data types and an optional flag
def process_data(flag: Optional[bool] = False, *data: Union[int, str, float]) -> None:
    if flag:
        print("Processing data...")
    for item in data:
        print(item)


# Example 5: Variable number of tuples of integers and an optional multiplier
def multiply_tuples(
    multiplier: Optional[int] = 1, *tuples: Tuple[int, int]
) -> List[Tuple[int, int]]:
    return [(x * multiplier, y * multiplier) for x, y in tuples]


# Testing the functions
process_integers(1, 2, 3, 4, 5)
print(join_strings(";", "a", "b", "c", "d"))
print(filter_floats(2.0, 1.5, 2.5, 3.5, 4.5))
process_data(True, 10, "hello", 3.14)
print(multiply_tuples(2, (1, 2), (3, 4), (5, 6)))
