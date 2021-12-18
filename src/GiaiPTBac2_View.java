import javax.swing.*;

public class GiaiPTBac2_View extends JFrame {
    private JTextField txfA, txfB, txfC;
    private JButton btnRes;
    private JTextArea txaRes;

    public GiaiPTBac2_View() {
        setTitle("Giải PT Bậc 2 - Java Swing");
        setSize(450, 400);

        JLabel lbl = new JLabel("ax² + bx + c = 0", JLabel.CENTER);
        lbl.setBounds(170, 20, 100, 20);
        add(lbl);

        //a
        JLabel lblA = new JLabel("a:");
        lblA.setBounds(20, 50, 30, 20);
        add(lblA);
        txfA = new JTextField();
        txfA.setBounds(40, 50, 40, 20);
        add(txfA);

        //b
        JLabel lblB = new JLabel("b:");
        lblB.setBounds(120, 50, 30, 20);
        add(lblB);
        txfB = new JTextField();
        txfB.setBounds(140, 50, 40, 20);
        add(txfB);

        //c
        JLabel lblC = new JLabel("c:");
        lblC.setBounds(220, 50, 30, 20);
        add(lblC);
        txfC = new JTextField();
        txfC.setBounds(240, 50, 40, 20);
        add(txfC);

        //btnRes
        btnRes = new JButton("KET QUA");
        btnRes.setBounds(20, 80, 120, 30);
        add(btnRes);

        //tfaRes
        txaRes = new JTextArea();
        txaRes.setBounds(20, 120, 350, 150);
        add(txaRes);

        setLayout(null);
        setVisible(true);
    }

    public JTextField getTxfA() {
        return txfA;
    }

    public void setTxfA(JTextField txfA) {
        this.txfA = txfA;
    }

    public JTextField getTxfB() {
        return txfB;
    }

    public void setTxfB(JTextField txfB) {
        this.txfB = txfB;
    }

    public JTextField getTxfC() {
        return txfC;
    }

    public void setTxfC(JTextField txfC) {
        this.txfC = txfC;
    }

    public JButton getBtnRes() {
        return btnRes;
    }

    public void setBtnRes(JButton btnRes) {
        this.btnRes = btnRes;
    }

    public JTextArea getTxaRes() {
        return txaRes;
    }

    public void setTxaRes(JTextArea txaRes) {
        this.txaRes = txaRes;
    }
}
