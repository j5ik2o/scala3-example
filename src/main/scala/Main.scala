import java.util.Currency

@main def main: Unit =
  val money: Money = Money(BigDecimal(10), Currency.getInstance("JPY"))
  val result = money.add(money)
  println(result.getClass.getName)