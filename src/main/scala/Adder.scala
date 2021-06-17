import java.util.Currency

trait Adder[A]:
  type Output[A]
  extension (self: A) def add(rhs: A): Output[A]




