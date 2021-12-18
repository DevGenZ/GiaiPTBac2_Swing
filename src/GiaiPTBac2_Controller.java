import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GiaiPTBac2_Controller {
    private GiaiPTBac2_View view;
    private double a, b, c;

    public GiaiPTBac2_Controller(GiaiPTBac2_View view) {
        this.view = view;

        view.getBtnRes().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!view.getTxfA().getText().equals("") &&
                            !view.getTxfB().getText().equals("") &&
                            !view.getTxfC().getText().equals("")
                    ) {
                        a = Double.parseDouble(view.getTxfA().getText());
                        b = Double.parseDouble(view.getTxfB().getText());
                        c = Double.parseDouble(view.getTxfC().getText());

                        view.getTxaRes().setText(calculate(a, b, c));
                    } else {
                        JOptionPane.showMessageDialog(view, "Vui long nhap a, b, c");
                    }
                } catch (NumberFormatException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(view, "a/b/c Khong hop le!");
                }
            }
        });

        view.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public String calculate(double a, double b, double c) {
        if (a==0) {
            if (b!=0) {
                return "Phương trình có 1 nghiệm x = " + -c/b;
            } else {
                if (c==0) {
                    return "Phương trình có 1 nghiệm x = 0";
                } else {
                    return "Phương trình vô nghiệm";
                }
            }
        }

        double delta = b*b - 4*a*c;
        double x1, x2;
        if (delta < 0) {
            return "Phương trình vô nghiệm!";
        } else if (delta == 0) {
            return "Phương trình có nghiệm kép x1 = x2 = " + -b/a;
        } else {
            x1 = (-b+Math.sqrt(delta))/a;
            x2 = (-b-Math.sqrt(delta))/a;
        }
        return "Phương trình có 2 nghiệm: x1 = " + x1 + " và x2 = " + x2;
    }
}
