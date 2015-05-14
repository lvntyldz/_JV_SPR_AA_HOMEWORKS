package com.okan.finalp;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by levent on 5/14/15.
 */
@SuppressWarnings("serial")
public class Run extends Applet implements ActionListener {

    TextField n;
    Label text, traversal;
    Button[] b = new Button[32];
    Button add, del, reset, pre, post, ino;

    public void init() {
        setSize(1400, 700);
        setBackground(Color.GRAY);
        Font f = new Font("Monospaced", Font.BOLD, 12);
        for (int i = 0; i <= 31; i++)
            b[i] = new Button(" ");

        text = new Label("Sayı Gir :");
        traversal = new Label(" : ");
        n = new TextField(5);
        add = new Button("Ekle");
        del = new Button("Sil");
        reset = new Button("Reset");
        pre = new Button("Pre-Order");
        post = new Button("Post-Order");
        ino = new Button("In-Order");

        add(text);
        add.setBackground(Color.white);
        del.setBackground(Color.white);
        reset.setBackground(Color.white);
        add(n);
        add(add);
        add(del);
        add(reset);

        for (int i = 1; i <= 31; i++) {
            b[i].setSize(30, 30);
            b[i].setVisible(false);
            b[i].setFont(f);
            add(b[i]);
            b[i].addActionListener(this);
        }

        pre.setBackground(Color.white);
        post.setBackground(Color.white);
        ino.setBackground(Color.white);
        traversal.setFont(f);
        traversal.setForeground(Color.white);

        add(pre);
        add(post);
        add(ino);
        add(traversal);

        add.addActionListener(this);
        del.addActionListener(this);
        reset.addActionListener(this);
        pre.addActionListener(this);
        post.addActionListener(this);
        ino.addActionListener(this);

        repaint();
    }

    public void paint(Graphics g) {
        b[1].setBackground(Color.WHITE);
        b[1].setBounds(645, 50, 40, 40);
        b[2].setBackground(Color.CYAN);
        b[2].setBounds(368, 186, 30, 30);
        b[3].setBackground(Color.CYAN);
        b[3].setBounds(932, 186, 30, 30);
        b[4].setBackground(Color.MAGENTA);
        b[4].setBounds(226, 260, 25, 25);
        b[5].setBackground(Color.MAGENTA);
        b[5].setBounds(515, 260, 25, 25);
        b[6].setBackground(Color.MAGENTA);
        b[6].setBounds(790, 260, 25, 25);
        b[7].setBackground(Color.MAGENTA);
        b[7].setBounds(1079, 260, 25, 25);
        b[8].setBackground(Color.GREEN);
        b[8].setBounds(161, 330, 25, 25);
        b[9].setBackground(Color.GREEN);
        b[9].setBounds(291, 330, 25, 25);
        b[10].setBackground(Color.GREEN);
        b[10].setBounds(450, 330, 25, 25);
        b[11].setBackground(Color.GREEN);
        b[11].setBounds(580, 330, 25, 25);
        b[12].setBackground(Color.GREEN);
        b[12].setBounds(725, 330, 25, 25);
        b[13].setBackground(Color.GREEN);
        b[13].setBounds(855, 330, 25, 25);
        b[14].setBackground(Color.GREEN);
        b[14].setBounds(1014, 330, 25, 25);
        b[15].setBackground(Color.GREEN);
        b[15].setBounds(1144, 330, 25, 25);
        b[16].setBackground(Color.YELLOW);
        b[16].setBounds(126, 385, 25, 25);
        b[17].setBackground(Color.YELLOW);
        b[17].setBounds(196, 385, 25, 25);
        b[18].setBackground(Color.YELLOW);
        b[18].setBounds(256, 385, 25, 25);
        b[19].setBackground(Color.YELLOW);
        b[19].setBounds(326, 385, 25, 25);
        b[20].setBackground(Color.YELLOW);
        b[20].setBounds(415, 385, 25, 25);
        b[21].setBackground(Color.YELLOW);
        b[21].setBounds(485, 385, 25, 25);
        b[22].setBackground(Color.YELLOW);
        b[22].setBounds(545, 385, 25, 25);
        b[23].setBackground(Color.YELLOW);
        b[23].setBounds(615, 385, 25, 25);
        b[24].setBackground(Color.YELLOW);
        b[24].setBounds(690, 385, 25, 25);
        b[25].setBackground(Color.YELLOW);
        b[25].setBounds(760, 385, 25, 25);
        b[26].setBackground(Color.YELLOW);
        b[26].setBounds(820, 385, 25, 25);
        b[27].setBackground(Color.YELLOW);
        b[27].setBounds(890, 385, 25, 25);
        b[28].setBackground(Color.YELLOW);
        b[28].setBounds(979, 385, 25, 25);
        b[29].setBackground(Color.YELLOW);
        b[29].setBounds(1049, 385, 25, 25);
        b[30].setBackground(Color.YELLOW);
        b[30].setBounds(1109, 385, 25, 25);
        b[31].setBackground(Color.YELLOW);
        b[31].setBounds(1179, 385, 25, 25);

        pre.setBounds(100, 450, 70, 30);
        post.setBounds(180, 450, 70, 30);
        ino.setBounds(260, 450, 70, 30);
        traversal.setLocation(350, 450);

        g.setColor(Color.orange);
        g.drawRect(645, 50, 40, 40);
        g.drawLine(645, 90, 398, 186);
        g.drawLine(685, 90, 932, 186);
        g.drawRect(368, 186, 30, 30);
        g.drawRect(932, 186, 30, 30);
        g.drawLine(368, 216, 251, 260);
        g.drawLine(398, 216, 515, 260);
        g.drawLine(932, 216, 815, 260);
        g.drawLine(962, 216, 1079, 260);
        g.drawRect(226, 260, 25, 25);
        g.drawRect(515, 260, 25, 25);
        g.drawRect(790, 260, 25, 25);
        g.drawRect(1079, 260, 25, 25);
        g.drawLine(226, 285, 186, 330);
        g.drawLine(515, 285, 475, 330);
        g.drawLine(540, 285, 580, 330);
        g.drawLine(790, 285, 750, 330);
        g.drawLine(1079, 285, 1039, 330);
        g.drawLine(1104, 285, 1144, 330);
        g.drawLine(251, 285, 291, 330);
        g.drawLine(815, 285, 855, 330);
        g.drawRect(161, 330, 25, 25);
        g.drawRect(291, 330, 25, 25);
        g.drawRect(450, 330, 25, 25);
        g.drawRect(580, 330, 25, 25);
        g.drawRect(725, 330, 25, 25);
        g.drawRect(855, 330, 25, 25);
        g.drawRect(1014, 330, 25, 25);
        g.drawRect(1144, 330, 25, 25);
        g.drawLine(161, 355, 151, 385);
        g.drawLine(186, 355, 196, 385);
        g.drawLine(291, 355, 281, 385);
        g.drawLine(316, 355, 326, 385);
        g.drawLine(450, 355, 440, 385);
        g.drawLine(475, 355, 485, 385);
        g.drawLine(580, 355, 570, 385);
        g.drawLine(605, 355, 615, 385);
        g.drawLine(725, 355, 715, 385);
        g.drawLine(750, 355, 760, 385);
        g.drawLine(855, 355, 845, 385);
        g.drawLine(880, 355, 890, 385);
        g.drawLine(1014, 355, 1004, 385);
        g.drawLine(1039, 355, 1049, 385);
        g.drawLine(1144, 355, 1134, 385);
        g.drawLine(1169, 355, 1179, 385);
        g.drawRect(126, 385, 25, 25);
        g.drawRect(196, 385, 25, 25);
        g.drawRect(256, 385, 25, 25);
        g.drawRect(326, 385, 25, 25);
        g.drawRect(415, 385, 25, 25);
        g.drawRect(485, 385, 25, 25);
        g.drawRect(545, 385, 25, 25);
        g.drawRect(615, 385, 25, 25);
        g.drawRect(690, 385, 25, 25);
        g.drawRect(760, 385, 25, 25);
        g.drawRect(820, 385, 25, 25);
        g.drawRect(890, 385, 25, 25);
        g.drawRect(979, 385, 25, 25);
        g.drawRect(1049, 385, 25, 25);
        g.drawRect(1109, 385, 25, 25);
        g.drawRect(1179, 385, 25, 25);

        for (int i = 1; i <= 31; i++) {
            b[i].paint(g);
        }
    }


    public void actionPerformed(ActionEvent e) {
        Object action = e.getSource();
        int num = Integer.parseInt(n.getText());
        int in = 0;

        if (action.equals(add)) {
            showStatus(" ");
            if (("" + num).matches("^[-+]?\\d+$")) {
                in = insertNode(num, 1);
                if (in == 40) showStatus("Number already exists");
                else if (in == 41) showStatus("Maximum height reached. Cannot insert further");
                else {
                    b[in].setLabel("" + num);
                    b[in].setVisible(true);
                }
            } else showStatus("Invalid number"); //error.setText("Invalid number");
        }

        if (action.equals(del)) {
            showStatus(" ");
            if (("" + num).matches("^[-+]?\\d+$")) {
                deleteNode(num, 1);
            } else showStatus("Invalid number");
        }

        if (action.equals(pre)) {
            traversal.setText(" : ");
            showStatus(" ");
            if (b[1].isVisible()) preorder(1);
            else showStatus("Tree Empty");
        }

        if (action.equals(post)) {
            traversal.setText(" : ");
            showStatus(" ");
            if (b[1].isVisible()) postorder(1);
            else showStatus("Tree Empty");
        }

        if (action.equals(ino)) {
            traversal.setText(" : ");
            showStatus(" ");
            if (b[1].isVisible()) inorder(1);
            else showStatus("Tree Empty");
        }

        if (action.equals(reset))
            for (int i = 1; i < 32; i++)
                b[i].setVisible(false);
    }

    private int insertNode(int val, int in) {
        if (in > 31) return 41;

        if (b[in].isVisible()) {
            if (Integer.parseInt(b[in].getLabel()) > val)
                return insertNode(val, 2 * in);
            else if (Integer.parseInt(b[in].getLabel()) < val)
                return insertNode(val, (2 * in) + 1);
            else if (Integer.parseInt(b[in].getLabel()) == val)
                return 40;
        }
        return in;
    }

    private void deleteNode(int val, int in) {
        if (in > 31) showStatus("Number does not exist");

        if (b[in].isVisible()) {
            if (Integer.parseInt(b[in].getLabel()) > val)
                deleteNode(val, 2 * in);
            else if (Integer.parseInt(b[in].getLabel()) < val)
                deleteNode(val, (2 * in) + 1);
            else if (Integer.parseInt(b[in].getLabel()) == val) {
                if (in > 15 || (!(b[2 * in].isVisible()) && !(b[2 * in + 1].isVisible())))
                    b[in].setVisible(false);
                else if (!(b[2 * in + 1].isVisible())) {
                    int rval = getHighestValue(2 * in);
                    b[in].setLabel(b[rval].getLabel());
                    deleteNode(Integer.parseInt(b[rval].getLabel()), rval);
                } else {
                    int lval = getLeastValue(2 * in + 1);
                    b[in].setLabel(b[lval].getLabel());
                    deleteNode(Integer.parseInt(b[lval].getLabel()), lval);
                }
            }
        } else showStatus("Number does not exist");
    }

    private int getHighestValue(int in) {
        if (in > 15 || !(b[2 * in + 1].isVisible())) return in;
        else return getHighestValue(2 * in + 1);
    }

    private int getLeastValue(int in) {
        if (in > 15 || !(b[2 * in].isVisible())) return in;
        else return getLeastValue(2 * in);
    }

    private void preorder(int in) {
        if (in > 31 || !(b[in].isVisible())) return;
        traversal.setText(traversal.getText() + " " + b[in].getLabel());
        preorder(2 * in);
        preorder(2 * in + 1);
    }

    private void postorder(int in) {
        if (in > 31 || !(b[in].isVisible())) return;
        postorder(2 * in);
        postorder(2 * in + 1);
        traversal.setText(traversal.getText() + " " + b[in].getLabel());
    }

    private void inorder(int in) {
        if (in > 31 || !(b[in].isVisible())) return;
        inorder(2 * in);
        traversal.setText(traversal.getText() + " " + b[in].getLabel());
        inorder(2 * in + 1);
    }
}
