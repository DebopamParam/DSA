import matplotlib.pyplot as plt
import numpy as np

# Assuming x_train and y_train are your data
years = np.arange(2010, 2021)
sales = np.random.randint(10, 90, len(years))

# plt.title("Sales over the years")
# plt.xlabel("Years (2010-2020)")
# plt.xticks(years, fontsize=7, rotation=45)
# plt.xlim(2008, 2022)

# plt.ylabel("Sales (in million $)")
# y_ticks = np.arange(sales.min(), sales.max(), 10)
# plt.yticks(
#     ticks=y_ticks, labels=[f"${x} mil" for x in y_ticks], fontsize=7, rotation=-45
# )
# plt.ylim(sales.min() - 10, sales.max() + 10)

# plt.plot(
#     years, sales, marker="*", markersize=10, color="blue", linestyle="--", linewidth=1
# )

# for x, y in zip(years, sales):
#     label = f"{y} mil"
#     plt.annotate(label, (x, y), textcoords="offset points", xytext=(0, 10), ha="center")

# plt.grid(True)
# plt.show()
explodes = np.full(len(years), 0.1)
plt.pie(
    sales,
    labels=years,
    autopct=lambda p: f"{p:.1f}%\n{p * sum(sales) / 100:.0f} mil",
    explode=explodes,
    startangle=90,
)
plt.show()
