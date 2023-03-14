import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RelogioDigital extends JFrame {
    private JLabel labelHora;

    public RelogioDigital() {
        super("Relógio Digital");

        labelHora = new JLabel();
        labelHora.setHorizontalAlignment(JLabel.CENTER);
        labelHora.setFont(labelHora.getFont().deriveFont(64.0f));

        add(labelHora);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        atualizarHora();
    }

    private void atualizarHora() {
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");

        while (true) {
            Date agora = new Date();
            String horaFormatada = formato.format(agora);
            labelHora.setText(horaFormatada);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new RelogioDigital();
    }
}