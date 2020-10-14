import java.awt.GridLayout
import java.awt.event.KeyAdapter
import java.awt.event.KeyEvent
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JTextField


fun main() {
    val jframe = JFrame()

    val jTextFieldI = JTextField(15)
    val jTextFieldO = JTextField(15).apply {
        isEditable = false
    }
    jTextFieldI.addKeyListener(Keychecker(jTextFieldO))
    jframe.contentPane.apply {
        layout = GridLayout(2, 2, 5, 5)
        add(JLabel("Input:" ))
        add(jTextFieldI)
        add(JLabel("Output:" ))
        add(jTextFieldO)
    }
    jframe.setSize(400, 350)
    jframe.isVisible = true
}

class Keychecker(private val jTextField: JTextField) : KeyAdapter() {
    override fun keyPressed(event: KeyEvent) {
        val ch = KeyEvent.getKeyText(event.keyCode)
        jTextField.text = ch
        println(ch)
    }
}
