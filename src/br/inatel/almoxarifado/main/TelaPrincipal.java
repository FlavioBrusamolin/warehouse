package br.inatel.almoxarifado.main;

import br.inatel.almoxarifado.classes.Aluno;
import br.inatel.almoxarifado.classes.Componente;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    Login login = new Login();
    
    public TelaPrincipal(Login l) {
        login = l;
        initComponents();
    }

    //Lista auxiliar de componentes existentes
    static List<Componente> lcomp = new ArrayList<>();
    //Lista auxiliar com o empréstimo
    List<Componente> lemp = new ArrayList<>();
    DefaultListModel dlm = new DefaultListModel();
    //Número do pedido
    static int numrecibo = 1;
    private Login veioDoLogin;

    public void enviaDado(Login veioDoLogin, Aluno aluno) {
        lbNomeAluno.setText(aluno.getNome());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbtipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        tfvalor1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfqnt1 = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        lbimage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfvalor2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfqnt2 = new javax.swing.JTextField();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btValidar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btAddComp = new javax.swing.JButton();
        cbcomp2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        lbNomeAluno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COMPONENTES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 300));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("TIPO:");

        cbtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Resistor", "Capacitor", "Transistor", "CI" }));
        cbtipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbtipoItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("VALOR:");

        tfvalor1.setMinimumSize(new java.awt.Dimension(6, 200));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("QUANTIDADE: ");

        btCadastrar.setText("CADASTRAR");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        lbimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/almoxarifado/resources/Resistor.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfvalor1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfqnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(lbimage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCadastrar)))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btCadastrar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfvalor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(tfqnt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbimage, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VALIDAÇÃO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jList1.setModel(dlm);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jList1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel4.setText("COMPONENTE");

        jLabel5.setText("VALOR");

        jLabel6.setText("QUANTIDADE");

        btEditar.setText("EDITAR EMPRÉSTIMO");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btExcluir.setText("EXCLUIR COMPONENTE");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btValidar.setText("VALIDAR EMPRÉSTIMO");
        btValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btValidarActionPerformed(evt);
            }
        });

        btCancelar.setText("CANCELAR");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btAddComp.setText("ADICIONAR COMPONENTE");
        btAddComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCompActionPerformed(evt);
            }
        });

        cbcomp2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Resistor", "Capacitor", "Transistor", "CI" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Aluno:");

        lbNomeAluno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(cbcomp2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(tfvalor2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(tfqnt2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btValidar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCancelar))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btAddComp)))))
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNomeAluno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfvalor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfqnt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbcomp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btAddComp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btExcluir)))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btValidar)
                    .addComponent(btCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1007, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed

        //Variável auxiliar assumindo um valor qualquer
        int aux = 99;

        if (tfvalor1.getText().equalsIgnoreCase("") || tfqnt1.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "Você deve colocar os dados do componente a ser cadastrado!");
        } else {
            //Criando um novo componente para salvar na lista
            Componente novocomponente = new Componente();
            novocomponente.setTipo(cbtipo.getSelectedItem().toString());
            novocomponente.setValor(tfvalor1.getText());
            novocomponente.setQuantidade(Integer.parseInt(tfqnt1.getText()));

            //Verifica se a lista de componentes está vazia
            if (lcomp.isEmpty()) {
                lcomp.add(novocomponente);
            } else {
                for (int i = 0; i < lcomp.size(); i++) {
                    aux = lcomp.get(i).compareTo(novocomponente);
                    if (aux == -1) {
                        break;
                    }
                }
                if (aux == 0) {
                    lcomp.add(novocomponente);
                }
            }

            //Cria arquivo com os componentes disponíveis
            try {

                OutputStream os1 = new FileOutputStream("arquivos/componentes/disponiveis.txt", true);

                OutputStreamWriter osw = new OutputStreamWriter(os1);
                BufferedWriter bw = new BufferedWriter(osw);

                bw.write((String) cbtipo.getSelectedItem() + "  -  " + tfvalor1.getText() + "  -  " + tfqnt1.getText() + "un.");
                bw.newLine();
                bw.close();

                JOptionPane.showMessageDialog(rootPane, "Componente cadastrado com Sucesso! "
                        + "Quantidade de componente(s) cadastrado(s): " + lcomp.size());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar componente!");
            }
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed

        //Fecha a execução
        login.setVisible(true);
        login.setResizable(false);
        login.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btCancelarActionPerformed

    private void btAddCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCompActionPerformed

        //Variável auxiliar para verificação da existencia do componente
        int aux = 0;

        Componente novocomponente = new Componente();

        if (tfvalor2.getText().equalsIgnoreCase("") || tfqnt2.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "Você deve colocar os dados do componente requisitado!");
        } else {
            //Quantidade de componente do mesmo tipo e valor requisitados
            int quantemprestimo = Integer.parseInt(tfqnt2.getText());

            for (int i = 0; i < lcomp.size(); i++) {
                if (cbcomp2.getSelectedItem().toString().equals(lcomp.get(i).getTipo()) && tfvalor2.getText().equals(lcomp.get(i).getValor())) {
                    aux = 1;
                    //Verifica se tem a quantidade de componente suficiente para empréstimo
                    if (quantemprestimo > lcomp.get(i).getQuantidade()) {
                        JOptionPane.showMessageDialog(rootPane, "Sem estoque. Temos " + lcomp.get(i).getQuantidade() + " componentes!");
                    } else {
                        novocomponente.setTipo(lcomp.get(i).getTipo());
                        novocomponente.setValor(lcomp.get(i).getValor());
                        novocomponente.setQuantidade(quantemprestimo);
                        lemp.add(novocomponente);
                        lcomp.get(i).setQuantidade(lcomp.get(i).getQuantidade() - quantemprestimo);
                    }
                    break;
                }
            }

            //Caso não exista o componente
            if (aux == 0) {
                JOptionPane.showMessageDialog(rootPane, "Componente não existente no almoxarifado!");
            }

            //Atualiza a dlm
            dlm.clear();
            for (int i = 0; i < lemp.size(); i++) {
                dlm.add(i, lemp.get(i).getTipo() + "  -  " + lemp.get(i).getValor() + "  -  " + lemp.get(i).getQuantidade() + "un.");
            }
        }
    }//GEN-LAST:event_btAddCompActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed

        //Pega o item selecionado e transforma em String
        String valorLista = (String) jList1.getSelectedValue();

        //Index do item selecionado
        int index = jList1.getSelectedIndex();

        int opcao = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente deletar "
                + "este componente?", "Atenção", JOptionPane.INFORMATION_MESSAGE);

        if (opcao == 0) {
            jList1.setSelectedIndex(0);

            for (int i = 0; i < lemp.size(); i++) {
                if (valorLista.equalsIgnoreCase(lemp.get(i).getTipo() + "  -  " + lemp.get(i).getValor() + "  -  " + lemp.get(i).getQuantidade() + "un.")) {
                    lcomp.get(i).setQuantidade(lcomp.get(i).getQuantidade() + lemp.get(i).getQuantidade());

                    lemp.remove(i);

                    dlm.remove(i);
                    break;
                }
            }
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btValidarActionPerformed

        //Verifica se a dlm tem algum item
        if (dlm.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Deve haver pelo menos 1 componente a ser requisitado!");
        } else {
            //Cria um arquivo com os componentes que foram emprestados
            try {

                OutputStream os1 = new FileOutputStream("arquivos/requisicoes/" + numrecibo + "_2018.txt", true);
                numrecibo++;

                OutputStreamWriter osw = new OutputStreamWriter(os1);
                BufferedWriter bw = new BufferedWriter(osw);
                
                bw.write("Requisitado por: " + lbNomeAluno.getText());
                bw.newLine();
                bw.write("");
                bw.newLine();

                for (int i = 0; i < lemp.size(); i++) {
                    bw.write(lemp.get(i).getTipo() + "  -  " + lemp.get(i).getValor() + "  -  " + lemp.get(i).getQuantidade() + "un.");
                    bw.newLine();
                }

                bw.write("");
                bw.newLine();
                bw.write("Obrigado pela preferência!");
                bw.newLine();
                bw.close();

                limpaTela();

                JOptionPane.showMessageDialog(rootPane, "Componentes requisitados com Sucesso!");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao validar empréstimo!");
            }

            //Atualiza os dados(Quantidade) dos componentes existentes no almoxarifado
            try {

                OutputStream os1 = new FileOutputStream("arquivos/componentes/disponiveis.txt", true);

                OutputStreamWriter osw = new OutputStreamWriter(os1);
                BufferedWriter bw = new BufferedWriter(osw);

                bw.write("");
                bw.newLine();
                bw.write("--DADOS ATUALIZADOS--");
                bw.newLine();
                for (int i = 0; i < lcomp.size(); i++) {
                    bw.write(lcomp.get(i).getTipo() + "  -  " + lcomp.get(i).getValor() + "  -  " + lcomp.get(i).getQuantidade() + "un.");
                    bw.newLine();
                }
                bw.write("");
                bw.newLine();

                bw.close();

                JOptionPane.showMessageDialog(rootPane, "Componentes atualizados no almoxarifado!");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao atualizar o componente!");
            }
        }

        login.setVisible(true);
        login.setResizable(false);
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btValidarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed

        //Pega o item selecionado e transforma em uma String
        String valorLista = (String) jList1.getSelectedValue();

        //Pega o index do item selecionado
        int index = jList1.getSelectedIndex();

        /*
            Apenas é possível editar a quantidade do empréstimo
            A lógica usada é somar a quantidade de novo ao total e retirar a nova quantidade do total.
         */
        for (int i = 0; i < lemp.size(); i++) {
            if (valorLista.equalsIgnoreCase(lemp.get(i).getTipo() + "  -  " + lemp.get(i).getValor() + "  -  " + lemp.get(i).getQuantidade() + "un.")) {
                for (int j = 0; j < lcomp.size(); j++) {
                    if (lcomp.get(j).getTipo().equals(lemp.get(i).getTipo()) && lcomp.get(j).getValor().equals(lemp.get(i).getValor())) {
                        if ((Integer.parseInt(tfqnt2.getText()) - lemp.get(i).getQuantidade()) > lcomp.get(j).getQuantidade()) {
                            JOptionPane.showMessageDialog(rootPane, "Sem estoque. Temos " + lcomp.get(j).getQuantidade() + " componentes!");
                        } else {
                            lcomp.get(j).setQuantidade(lcomp.get(j).getQuantidade() + lemp.get(i).getQuantidade());
                            lemp.get(i).setQuantidade(Integer.parseInt(tfqnt2.getText()));
                            lcomp.get(j).setQuantidade(lcomp.get(j).getQuantidade() - lemp.get(i).getQuantidade());
                        }
                    }
                }

                dlm.set(index, lemp.get(i).getTipo() + "  -  " + lemp.get(i).getValor() + "  -  " + lemp.get(i).getQuantidade() + "un.");
                break;
            }
        }

    }//GEN-LAST:event_btEditarActionPerformed

    private void jList1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MousePressed
        //Pega o item selecionado e transforma em String
        String valorLista = (String) jList1.getSelectedValue();

        //Ao selecionar um valor um valor na lista, seta os text fields e combobox do empréstimo com seus devidos valores
        for (int i = 0; i < lemp.size(); i++) {
            if (valorLista.equalsIgnoreCase(lemp.get(i).getTipo() + "  -  " + lemp.get(i).getValor() + "  -  " + lemp.get(i).getQuantidade() + "un.")) {
                tfvalor2.setText(lemp.get(i).getValor());
                cbcomp2.setSelectedItem(lemp.get(i).getTipo());

                break;
            }
        }
    }//GEN-LAST:event_jList1MousePressed

    private void cbtipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbtipoItemStateChanged

        //Atualiza a imagem do componente quando selecionado o tipo no comboBox
        if (cbtipo.getSelectedItem().equals("Resistor")) {
            lbimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/almoxarifado/resources/Resistor.jpg")));
        } else if (cbtipo.getSelectedItem().equals("Capacitor")) {
            lbimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/almoxarifado/resources/Capacitor.jpg")));
        } else if (cbtipo.getSelectedItem().equals("Transistor")) {
            lbimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/almoxarifado/resources/Transistor.jpg")));
        } else if (cbtipo.getSelectedItem().equals("CI")) {
            lbimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/almoxarifado/resources/CI.jpg")));
        }
    }//GEN-LAST:event_cbtipoItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    public void limpaTela() {

        //Limpa todos os dados da tela
        tfvalor1.setText("");
        tfqnt1.setText("");
        tfvalor2.setText("");
        tfqnt2.setText("");
        lemp.clear();
        dlm.clear();
        cbtipo.setSelectedIndex(0);
        cbcomp2.setSelectedIndex(0);
    }

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddComp;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btValidar;
    private javax.swing.JComboBox<String> cbcomp2;
    private javax.swing.JComboBox<String> cbtipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNomeAluno;
    private javax.swing.JLabel lbimage;
    private javax.swing.JTextField tfqnt1;
    private javax.swing.JTextField tfqnt2;
    private javax.swing.JTextField tfvalor1;
    private javax.swing.JTextField tfvalor2;
    // End of variables declaration//GEN-END:variables
}
