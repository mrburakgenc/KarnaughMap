package karnaugh.map;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import java.lang.String;
import java.lang.Number;
import java.util.Random;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.border.EtchedBorder;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;


public class Main extends javax.swing.JFrame {

   
    public Main() {
        initComponents();
    }

    boolean status = false;

    public String[] Clms = {"A", "B", "C", "D", "E", "F"};
    public int[] ttable;

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jSpinnergirissayisi = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Karnaugh Haritasi Burak Genç");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setSelectionBackground(new java.awt.Color(102, 102, 255));
        jTable1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTable1İnputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jSpinnergirissayisi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSpinnergirissayisi.setModel(new javax.swing.SpinnerNumberModel(4, 1, 6, 1));
        jSpinnergirissayisi.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnergirissayisiStateChanged(evt);
            }
        });

        jLabel1.setText("Giriş Sayısı :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSpinnergirissayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(536, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnergirissayisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jButton1.setText("Çöz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void initialise(int a[][], int val) {
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                a[i][j] = val;
            }
        }
    }

    public static void initialise_single(int a[], int val) {
        int i;
        for (i = 0; i < a.length; i++) {
            a[i] = val;
        }
    }

    public void coz() {
       
        int min[], nmin, nvar, i, j, k, a[][], x, y, pos = 0, b[][], flag = 0, count = 0, c, pi[][], flag2 = 0, c2 = 0, checker[], flag1 = 0, dash[], c1 = 0, c3 = 0, decimal, no9;
        boolean check = false;
       
        nvar = Integer.parseInt(jSpinnergirissayisi.getValue().toString());
        String sonuc = "";
        nmin = 0;
        for (int l = 0; l < ttable.length; l++) {
            if (ttable[l] == 1) {
                nmin++;
            }
        }
        if (nmin == 0) {
            sonuc = "0";
            jTextArea1.setText("Sonuç : " + sonuc);
            return;
        }
        if (nmin == Math.pow(2, nvar)) {
            sonuc = "1";
            jTextArea1.setText("Sonuç : " + sonuc);
            return;
        }
        min = new int[nmin];
        int l = 0;
        for (i = 0; i < nmin; i++) {
            if (ttable[l] == 1) {
                min[i] = l;
            } else {
                i--;
            }
            l++;
        }
        a = new int[nmin * (nmin + 1) / 2][nvar];
        b = new int[nmin * (nmin + 1) / 2][nvar];
        pi = new int[nmin * (nmin + 1) / 2][nvar];
        checker = new int[nmin * (nmin + 1) / 2];
        initialise(a, -1);
        for (i = 0; i < nmin; i++) {
            for (j = 0; j < nvar; j++) {
                a[i][j] = 0;
            }
        }
        
        for (i = 0; i < nmin; i++) {
            x = min[i];
            pos = nvar - 1;
            while (x > 0) {
                a[i][pos] = x % 2;
                pos--;
                x /= 2;
            }
        }
                while (true) {
            count = 0;
            flag = 0;
            initialise(b, -1);
            initialise_single(checker, -1);
            for (i = 0; i < a.length; i++) {
                if (a[i][0] == -1) {
                    break;
                }
                for (j = i + 1; j < a.length; j++) {
                    c = 0;
                    if (a[j][0] == -1) {
                        break;
                    }
                    for (k = nvar - 1; k >= 0; k--) {
                        if (a[i][k] != a[j][k]) {
                            pos = k;
                            c++;
                        }
                    }
                    if (c == 1) {
                        count++;
                        checker[i]++;
                        checker[j]++;
                        for (k = nvar - 1; k >= 0; k--) {
                            b[flag][k] = a[i][k];
                        }
                        b[flag][pos] = 9;
                        flag++;
                    }
                }
            }
            for (j = 0; j < i; j++) {
                if (checker[j] == -1) {
                    for (k = 0; k < nvar; k++) {
                        pi[flag2][k] = a[j][k];
                    }
                    c3 = 0;

                    for (x = flag2 - 1; x >= 0; x--) {
                        c1 = 0;
                        for (y = 0; y < nvar; y++) {
                            if (pi[x][y] != pi[flag2][y]) {
                                c1++;
                            }
                        }
                        if (c1 == 0) {
                            c3++;
                            break;
                        }
                    }
                    if (c3 == 0) {
                        flag2++;
                    }
                }
            }
            if (count == 0)
            {
                break;
            }
            
            for (i = 0; i < b.length; i++) {
                for (j = 0; j < b[i].length; j++) {
                    a[i][j] = b[i][j];
                }
            }
            
            flag1++;
        }
        
                
        dash = new int[nvar];
        initialise_single(dash, -1);
        a = new int[flag2][nmin];
        initialise(a, 0);
        for (i = 0; i < flag2; i++) {
            for (j = 0; j < nmin; j++) {
                check = match(min[j], pi, i, nvar);
                if (check == true) {
                    a[i][j] = 1;
                }
            }
        }
        
        
        checker = new int[flag2];
        dash = new int[nmin];
        count = 0;
        initialise_single(checker, -1);
        initialise_single(dash, -1);
        for (j = 0; j < nmin; j++) {
            count = 0;
            for (i = 0; i < flag2; i++) {
                if (a[i][j] == 1) {
                    pos = i;
                    count++;
                }
            }
            if (count == 1) {
                checker[pos]++;
            }
        }
        
        for (i = 0; i < flag2; i++) {
            if (checker[i] != -1) {
                for (j = 0; j < nmin; j++) {
                    if (a[i][j] == 1) {
                        dash[j]++;
                    }
                }
                for (j = 0; j < nmin; j++) {
                    a[i][j] = -1;
                }
            }
        }
        for (j = 0; j < nmin; j++) {
            if (dash[j] != -1) {
                for (i = 0; i < flag2; i++) {
                    a[i][j] = -1;
                }
            }
        }
      
        while (true) {
            count = 0;
           
            for (j = 0; j < nmin; j++) {
                for (k = j + 1; k < nmin; k++) {
                    c1 = 0;
                    c2 = 0;
                    c3 = 0;
                    for (i = 0; i < flag2; i++) {
                        if (a[i][j] == 1 && a[i][k] == 1) {
                            c1++;
                        }
                        if (a[i][j] == 1 && a[i][k] == 0) {
                            c2++;
                        }
                        if (a[i][j] == 0 && a[i][k] == 1) {
                            c3++;
                        }
                    }
                    if (c2 > 0 && c3 > 0) {
                        break;
                    }
                    if (c1 > 0 && c2 > 0 && c3 == 0) {
                        for (no9 = 0; no9 < flag2; no9++) {
                            a[no9][j] = -1;
                        }
                        count++;
                    }
                    if (c1 > 0 && c3 > 0 && c2 == 0) {
                        for (no9 = 0; no9 < flag2; no9++) {
                            a[no9][k] = -1;
                        }
                        count++;
                    }
                    if (c1 > 0 && c2 == 0 && c3 == 0) {
                        for (no9 = 0; no9 < flag2; no9++) {
                            a[no9][j] = -1;
                        }
                        count++;
                    }
                }
            }
           
            for (i = 0; i < flag2; i++) {
                for (j = i + 1; j < flag2; j++) {
                    c1 = 0;
                    c2 = 0;
                    c3 = 0;
                    for (k = 0; k < nmin; k++) {
                        if (a[i][k] == 1 && a[j][k] == 1) {
                            c1++;
                        }
                        if (a[i][k] == 1 && a[j][k] == 0) {
                            c2++;
                        }
                        if (a[i][k] == 0 && a[j][k] == 1) {
                            c3++;
                        }
                    }
                    if (c2 > 0 && c3 > 0) {
                        break;
                    }
                    if (c1 > 0 && c2 > 0 && c3 == 0) {
                        for (no9 = 0; no9 < nmin; no9++) {
                            a[j][no9] = -1;
                        }
                        count++;
                    }
                    if (c1 > 0 && c3 > 0 && c2 == 0) {
                        for (no9 = 0; no9 < nmin; no9++) {
                            a[i][no9] = -1;
                        }
                        count++;
                    }
                    if (c1 > 0 && c2 == 0 && c3 == 0) {
                        for (no9 = 0; no9 < nmin; no9++) {
                            a[j][no9] = -1;
                        }
                        count++;
                    }
                }
            }
            if (count == 0)
            {
                break;
            }
        }
        
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < nmin; j++) {
                if (a[i][j] == 1) {
                    checker[i]++;
                }
            }
        }
        char bitvar[] = new char[nvar];
        for (i = 0; i < nvar; i++) {
            bitvar[i] = (char) (65 + i);
        }
       

        for (i = 0; i < flag2; i++) {
            if (checker[i] != -1) {
                sonuc = sonuc + decode(pi, i, nvar, bitvar).toString() + " + ";
            }
            
        }
        jTextArea1.setText("Sonuç : " + sonuc.substring(0, sonuc.length() - 3));
    }

    public static String decode(int a[][], int row, int nvar, char bitvar[])
    {
        int i;
        String s = "";
        for (i = 0; i < a[row].length; i++) {
            if (a[row][i] == 9) {
                continue;
            } else if (a[row][i] == 1) {
                s += bitvar[i];
            } else {
                s += bitvar[i] + "'";
            }
        }
        return s;
    }

    public static boolean match(int min, int a[][], int row, int nvar)
    {
        int b[] = new int[nvar], i = nvar - 1, c = 0;
        initialise_single(b, 0);
        while (min > 0) {
            b[i] = min % 2;
            min /= 2;
            i--;
        }
        for (i = 0; i < nvar; i++) {
            if (a[row][i] == 9) {
                continue;
            }
            if (a[row][i] != b[i]) {
                c++;
            }
        }
        if (c == 0) {
            return true;
        }
        return false;
    }

    private void truthtable() {
        int girissayisi = Integer.parseInt(jSpinnergirissayisi.getValue().toString());
        String[] Colums = new String[girissayisi + 1];
        for (int i = 0; i < girissayisi; i++) {
            Colums[i] = Clms[i];
        }
        Colums[girissayisi] = "Q";
        int a = (int) Math.pow(2, girissayisi);
        String[][] data = new String[a][girissayisi + 1];
        String d;
        for (int i = 0; i < a; i++) {
            d = Integer.toBinaryString(i);
            if (d.length() < girissayisi) {
                int b = girissayisi - d.length();
                for (int j = 0; j < b; j++) {
                    d = "0" + d;
                }
            }
            for (int j = 0; j < girissayisi; j++) {
                data[i][j] = d.substring(j, j + 1);
            }
            data[i][girissayisi] = "0";
        }
        boolean[] editable = new boolean[girissayisi + 1];
        for (int i = 0; i <= girissayisi; i++) {
            if (i == girissayisi) {
                editable[i] = true;
            } else {
                editable[i] = false;
            }
        }
        
        jTable1.setModel(new DefaultTableModel(data, Colums) {
            boolean[] canEdit = editable;

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        
        jTable1.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (!status) {
                    try {

                        int val = Integer.valueOf(jTable1.getValueAt(e.getFirstRow(), e.getColumn()).toString());
                        if (val == 1 || val == 0) {
                            status = true;
                            jTable1.setValueAt(val, e.getFirstRow(), e.getColumn());

                            int row, col;
                            String tmp = Integer.toBinaryString(e.getFirstRow());
                            int variable = Integer.parseInt(jSpinnergirissayisi.getValue().toString());
                            int width = (int) Math.pow(2, (Math.ceil(((double) variable) / 2)));
                            int height = (int) Math.pow(2, (Math.floor(((double) variable) / 2)));
                            int w = ((int) (Math.log(width) / Math.log(2)));

                            int k = (variable - tmp.length());
                            for (int j = 0; j < k; j++) {
                                tmp = "0" + tmp;
                            }
                            col = getcolheader(Integer.valueOf(tmp.substring(0, w), 2));
                            if (variable != 1) {
                                row = getcolheader(Integer.valueOf(tmp.substring(w), 2));
                            } else {
                                row = 0;
                            }
                            jTable2.setValueAt(val, row, col);
                            status = false;
                        } else {
                            jTable1.setValueAt("0", e.getFirstRow(), e.getColumn());
                        }
                    } catch (Exception ex) {
                        jTable1.setValueAt("0", e.getFirstRow(), e.getColumn());
                    }
                }
            }
        });
        ListModel ttable_listModel = new AbstractListModel() {
            public int getSize() {
                return (int) Math.pow(2, Integer.parseInt(jSpinnergirissayisi.getValue().toString()));
            }

            public Object getElementAt(int index) {
                return index;
            }
        };
        JList main_table_rowHeader = new JList(ttable_listModel);
        main_table_rowHeader.setFixedCellWidth(50);
        main_table_rowHeader.setFixedCellHeight(jTable1.getRowHeight());
        main_table_rowHeader.setCellRenderer(new RowHeaderRenderer(jTable1));
        jScrollPane1.setRowHeaderView(main_table_rowHeader);
        kmap();
    }

    private void kmap() {
        int variable = Integer.parseInt(jSpinnergirissayisi.getValue().toString());
        int width = (int) Math.pow(2, (Math.ceil(((double) variable) / 2)));
        int height = (int) Math.pow(2, (Math.floor(((double) variable) / 2)));
        String[][] data = new String[height][width];
        String[] header = new String[width];
       

        ListModel ktable_listModel = new AbstractListModel() {
            public int getSize() {
                return (int) Math.pow(2, (Math.floor(((double) Integer.parseInt(jSpinnergirissayisi.getValue().toString())) / 2)));
            }

            public Object getElementAt(int index) {
                int height = (int) Math.pow(2, (Math.floor(((double) Integer.parseInt(jSpinnergirissayisi.getValue().toString())) / 2)));
                String[] row_header = new String[height];
                for (int i = 0; i < height; i++) {
                    String tmp = Integer.toBinaryString(getcolheader(i));
                    int a = ((int) (Math.log(height) / Math.log(2)) - tmp.length());
                    for (int j = 0; j < a; j++) {
                        tmp = "0" + tmp;
                    }
                    row_header[i] = tmp;
                }
                if (getSize() == 1) {
                    return "";
                } else {
                    return row_header[index];
                }

            }
        };
        JList ktable_rowHeader = new JList(ktable_listModel);
        ktable_rowHeader.setFixedCellWidth(50);
        ktable_rowHeader.setFixedCellHeight(jTable2.getRowHeight());
        ktable_rowHeader.setCellRenderer(new RowHeaderRenderer(jTable2));
        jScrollPane3.setRowHeaderView(ktable_rowHeader);

        for (int i = 0; i < width; i++) {
            String tmp = Integer.toBinaryString(getcolheader(i));
            int a = ((int) (Math.log(width) / Math.log(2)) - tmp.length());//girişlerin 
            for (int j = 0; j < a; j++) {
                tmp = "0" + tmp;
            }
            header[i] = tmp;
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                data[i][j] = "0";
            }
        }
        jTable2.setModel(new DefaultTableModel(data, header));

        jTable2.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (!status) {
                    try {

                        int val = Integer.valueOf(jTable2.getValueAt(e.getFirstRow(), e.getColumn()).toString());
                        if (val == 1 || val == 0) {
                            status = true;
                            jTable2.setValueAt(val, e.getFirstRow(), e.getColumn());
                            int row, variable;
                            variable = Integer.parseInt(jSpinnergirissayisi.getValue().toString());
                            int width = (int) Math.pow(2, (Math.ceil(((double) variable) / 2)));
                            int height = (int) Math.pow(2, (Math.floor(((double) variable) / 2)));
                            int w = ((int) (Math.log(width) / Math.log(2)));
                            int h = ((int) (Math.log(height) / Math.log(2)));
                            String tmp2 = Integer.toBinaryString(getcolheader((e.getFirstRow())));
                            String tmp = Integer.toBinaryString(getcolheader((e.getColumn())));
                            int k = w - tmp.length();
                            for (int i = 0; i < k; i++) {
                                tmp = "0" + tmp;
                            }
                            k = h - tmp2.length();
                            for (int i = 0; i < k; i++) {
                                tmp2 = "0" + tmp2;
                            }
                            if (variable != 1) {
                                tmp = tmp + tmp2;
                            }
                            row = Integer.valueOf(tmp, 2);
                            jTable1.setValueAt(val, row, variable);
                            status = false;
                        } else {
                            jTable2.setValueAt("0", e.getFirstRow(), e.getColumn());
                        }
                    } catch (Exception ex) {
                        jTable2.setValueAt("0", e.getFirstRow(), e.getColumn());
                    }
                }
            }
        });
    }

    private int getcolheader(int i)
    {
        int rtrn = -1;
        switch (i) {
            case 0: {
                rtrn = 0;
                break;
            }
            case 1: {
                rtrn = 1;
                break;
            }
            case 2: {
                rtrn = 3;
                break;
            }
            case 3: {
                rtrn = 2;
                break;
            }

            case 4: {
                rtrn = 4;
                break;
            }
            case 5: {
                rtrn = 5;
                break;
            }
            case 6: {
                rtrn = 7;
                break;
            }
            case 7: {
                rtrn = 6;
                break;
            }

        }
        return rtrn;
    }

    private void jSpinnergirissayisiStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnergirissayisiStateChanged
        truthtable();
    }//GEN-LAST:event_jSpinnergirissayisiStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        truthtable();
        kmap();
    }//GEN-LAST:event_formWindowOpened

    private void jTable1İnputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTable1İnputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1İnputMethodTextChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        int girissayisi = Integer.parseInt(jSpinnergirissayisi.getValue().toString());
        ttable = new int[(int) Math.pow(2, girissayisi)];
        for (int i = 0; i < ttable.length; i++) {
            if (Integer.parseInt(jTable1.getValueAt(i, girissayisi).toString()) == 1) {
                ttable[i] = 1;
            } else {
                ttable[i] = 0;
            }
        }
        if (girissayisi < 5)
        {
            coz();
        } 
        else
        {
            jTextArea1.setText("Yapım Aşamasında !!!.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinnergirissayisi;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
