import java.util.Currency

case class Money(amount: BigDecimal, currency: Currency)

given Adder[Money] with
  override type Output[A] = Either[MoneyError, A]
  extension (self: Money) def add(rhs: Money): Output[Money] =
    if (self.currency != rhs.currency) then
      Left(MoneyError.InvalidCurrency(s"Invalid currency: self = $self, rhs = $rhs"))
    else
      Right(Money(self.amount + rhs.amount, self.currency))
