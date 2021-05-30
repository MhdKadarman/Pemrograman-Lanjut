package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormBiodata {
    private JTextField textNama;
    private JTextField textNim;
    private JButton buttonSave;
    private JPanel rootPanel;
    private JLabel labelHasil;

    public FormBiodata() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Mengambil data dari textNama
                String nama = textNama.getText();
                //Mengambil data dari textNim
                String nim = textNim.getText();
                //Diproses
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNim(nim);
                //Tampilkan output ke FORM
                labelHasil.setText(mhs.toString());
                /*labelHasil.setText(
                        "Nama\t\t: " + mhs.getNama() + "\n"
                                + "NIM\t\t: " + mhs.getNim() + "\n"
                                + "Jenjang Pendidikan\t\t: " + mhs.getjenjangPendidikan() + "\n"
                                + "Angkatan\t\t: " + mhs.gettahunAngkatan() + "\n"
                                + "Fakultas\t\t: " + mhs.getfakultas() + "\n"
                                + "Jurusan\t\t: " + mhs.getjurusan() + "\n"
                                + "Jenis Kelamin\t\t: " + mhs.getjenisKelamin() +"\n"

                );

                 */

            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
