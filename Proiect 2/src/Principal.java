import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Principal {
    private JPanel rootPannel;
    private JRadioButton btnsaratele;
    private JRadioButton btncovrig;
    private JRadioButton btncioco;
    private JRadioButton btncozonac;
    private JRadioButton btnpapanasi;
    private JRadioButton btnalba;
    private JLabel lblprod;
    private JButton btninfo;
    private JButton btnloc;
    private JButton btnptotal;
    private JTextField txtPret;
    private JLabel lblpretfinal;
    private JLabel lblInfoProd;
    private JLabel lblInfoLoc;
    private JTextField txtcant;
    private JLabel lblcant;
    private JLabel lblpret;
    private JLabel lbllei;
    private JLabel lblpretintr;
    private JLabel lblinfo;
    private JLabel lbllocatie;

    static class Aliment {
        public String numeAL;
        public String codAL;
        public String brutarie;

        public Aliment(String numeAL, String codAL, String brutarie) {
            this.numeAL = numeAL;
            this.codAL = codAL;
            this.brutarie = brutarie;
        }
    }

    public class Locatie{
        public String strada;
        public String numar;
        public String judet;

        public Locatie(String strada, String numar, String judet){
            this.strada = strada;
            this.numar = numar;
            this.judet = judet;
        }
    }

    Aliment a1 = new Aliment("Paine alba, " , "Cod produs : 0273546271, " , "Butaria Kovacs");
    Aliment a2 = new Aliment("Papanasi, " , "Cod produs : 7364727460, " , "Brutaria Eldi");
    Aliment a3 = new Aliment("Cozonac, " , "Cod produs : 3894757537, " , "Brutaria Bozon");
    Aliment a4 = new Aliment("Corn cu Ciocolata, " , "Cod produs : 3448689243, " , "Brutaria PanSab");
    Aliment a5 = new Aliment("Covrig cu sare, " , "Cod produs : 5794213987, " , "Brutaria Dona");
    Aliment a6 = new Aliment("Saratele, " , "Cod produs : 1387925791, " , "Brutaria Vera");

    Locatie l1 = new Locatie("Strada Brasovului, " , "Numar 2, " , "Judetul Mures");
    Locatie l2 = new Locatie("Strada Gheorghe Doja, " , "Numar 3, " , "Judetul Cluj");
    Locatie l3 = new Locatie("Strada Secerei, " , "Numar 11, " , "Judetul Timisoara");
    Locatie l4 = new Locatie("Strada Mihai Viteazu, " , "Numar 12, " , "Judetul Suceava");
    Locatie l5 = new Locatie("Strada Avram Iancu, " , "Numar 33, " , "Judetul Covasna");
    Locatie l6 = new Locatie("Strada Cuza Voda, " , "Numar 72, " , "Judetul Constanta");

    public Principal() {
        btninfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(btnalba.isSelected()) {
                    StringBuffer buff = new StringBuffer();
                    buff.append("1- ").append(a1.numeAL).append(" ").append(a1.codAL).append(" ").append(a1.brutarie);
                    lblInfoProd.setText(buff.toString());
                }

                if(btnpapanasi.isSelected()){
                    StringBuffer buff = new StringBuffer();
                    buff.append("2- ").append(a2.numeAL).append(" ").append(a2.codAL).append(" ").append(a2.brutarie);
                    lblInfoProd.setText(buff.toString());
                }

                if(btncozonac.isSelected()) {
                    StringBuffer buff = new StringBuffer();
                    buff.append("3- ").append(a3.numeAL).append(" ").append(a3.codAL).append(" ").append(a3.brutarie);
                    lblInfoProd.setText(buff.toString());
                }

                if (btncioco.isSelected()){
                    StringBuffer buff = new StringBuffer();
                    buff.append("4- ").append(a4.numeAL).append(" ").append(a4.codAL).append(" ").append(a4.brutarie);
                    lblInfoProd.setText(buff.toString());
                }

                if (btncovrig.isSelected()){
                    StringBuffer buff = new StringBuffer();
                    buff.append("5- ").append(a5.numeAL).append(" ").append(a5.codAL).append(" ").append(a5.brutarie);
                    lblInfoProd.setText(buff.toString());
                }

                if (btnsaratele.isSelected()){
                    StringBuffer buff = new StringBuffer();
                    buff.append("6- ").append(a6.numeAL).append(" ").append(a6.codAL).append(" ").append(a6.brutarie);
                    lblInfoProd.setText(buff.toString());
                }
            }
        });

        btnloc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btnalba.isSelected()) {
                    StringBuffer buff = new StringBuffer();
                    buff.append(l1.strada).append(" ").append(l1.numar).append(" ").append(l1.judet);
                    lblInfoLoc.setText(buff.toString());
                }

                if (btnpapanasi.isSelected()) {
                    StringBuffer buff = new StringBuffer();
                    buff.append(l2.strada).append(" ").append(l2.numar).append(" ").append(l2.judet);
                    lblInfoLoc.setText(buff.toString());
                }

                if (btncozonac.isSelected()) {
                    StringBuffer buff = new StringBuffer();
                    buff.append(l3.strada).append(" ").append(l3.numar).append(" ").append(l3.judet);
                    lblInfoLoc.setText(buff.toString());
                }

                if (btncioco.isSelected()) {
                    StringBuffer buff = new StringBuffer();
                    buff.append(l4.strada).append(" ").append(l4.numar).append(" ").append(l4.judet);
                    lblInfoLoc.setText(buff.toString());
                }

                if (btncovrig.isSelected()) {
                    StringBuffer buff = new StringBuffer();
                    buff.append(l5.strada).append(" ").append(l5.numar).append(" ").append(l5.judet);
                    lblInfoLoc.setText(buff.toString());
                }

                if (btnsaratele.isSelected()) {
                    StringBuffer buff = new StringBuffer();
                    buff.append(l6.strada).append(" ").append(l6.numar).append(" ").append(l6.judet);
                    lblInfoLoc.setText(buff.toString());
                }
            }
        });


        btnptotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null,
                        "Doriti sa calculati pretul final?",
                        "Question",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (result == JOptionPane.YES_OPTION) {
                    final double TVA = 0.19;
                    String p = txtPret.getText();
                    String g = txtcant.getText();
                    ArrayList<String> info = new ArrayList<String>();
                    info.add(p);
                    info.add(g);

                    double pret = Double.parseDouble(info.get(0));
                    double cantitate = Double.parseDouble(info.get(1));
                    double prettotal = (pret + (pret * TVA)) * cantitate * 0.001;
                    String ptotal = String.valueOf(prettotal);
                    lblpretfinal.setText(ptotal);

                    JOptionPane.showConfirmDialog(null,
                            "Ati calculat pretul!",
                            "Result",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Produse Panificate");
        frame.setContentPane(new Principal().rootPannel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(700 , 500);

    }
}