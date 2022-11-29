package chapter8

import javax.swing.JButton

class SingleAbstractMethod {
  """
    |JButton buttonJava = new JButton(); // This is Java
    |button.addActionListener(
    |  event -> System.out.println("pressed!")
    |);
    |""".stripMargin

  val button = new JButton()
  button.addActionListener(
    _ => println("pressed!")
  )

  trait Increaser:
    def increase(i: Int): Int

  def increaseOne(increaser: Increaser): Int =
    increaser.increase(1)

  increaseOne(  // Java
    new Increaser:
      override def increase(i: Int): Int = i + 7
  )

  increaseOne(i => i + 7)  // Scala
}
