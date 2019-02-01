package pesquisa;

import javax.swing.JOptionPane;

public class Senso extends javax.swing.JFrame {

    Pessoa pessoa;
    Pessoa[] arrayPessoa;
    int i = 0;
    int contador1=0, contador2=0, contador3=0, contador4=0, contador5=0, contador6=0;
            
    public Senso() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        ddlUF = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        rdBtnMasc = new javax.swing.JRadioButton();
        rdBtnFem = new javax.swing.JRadioButton();
        rdBtnOutros = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txtQtdePessoas = new javax.swing.JTextField();
        btnQtdePessoas = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        ddlOlhos = new javax.swing.JComboBox<>();
        ddlCabelos = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPessoasCadastradas = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanel1.setToolTipText("");

        jLabel1.setText("Nome:");

        jLabel2.setText("Idade:");

        btnSalvar.setText("Salvar Pessoa");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar Pessoas");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        ddlUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "BA", "DF", "GO", "MG", "RJ", "SP", "TO" }));
        ddlUF.setName(""); // NOI18N

        jLabel3.setText("Sexo:");

        sexo.add(rdBtnMasc);
        rdBtnMasc.setText("Masculino");
        rdBtnMasc.setName("Masculino"); // NOI18N
        rdBtnMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnMascActionPerformed(evt);
            }
        });

        sexo.add(rdBtnFem);
        rdBtnFem.setText("Feminino");
        rdBtnFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnFemActionPerformed(evt);
            }
        });

        sexo.add(rdBtnOutros);
        rdBtnOutros.setText("Outros");

        jLabel4.setText("Quantidade de Pessoas a serem cadastradas:");

        btnQtdePessoas.setText("Salvar");
        btnQtdePessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQtdePessoasActionPerformed(evt);
            }
        });

        jLabel5.setText("Estado:");

        jLabel6.setText("Cidade:");

        jLabel7.setText("Data Nascimento:");

        jLabel8.setText("Cor dos Olhos:");
        jLabel8.setToolTipText("");

        jLabel9.setText("Cor dos Cabelos");

        jLabel10.setText("CPF:");

        ddlOlhos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azuis", "Verdes", "Castanhos" }));
        ddlOlhos.setToolTipText("");

        ddlCabelos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Louros", "Castanhos", "Pretos" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdBtnMasc))
                                    .addComponent(btnSalvar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rdBtnFem)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdBtnOutros)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQtdePessoas, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnQtdePessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtIdade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(txtNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCpf))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ddlUF, 0, 140, Short.MAX_VALUE)
                                    .addComponent(ddlOlhos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCidade))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ddlCabelos, 0, 170, Short.MAX_VALUE)))))))
                .addGap(404, 404, 404))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtQtdePessoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQtdePessoas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ddlUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(ddlOlhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddlCabelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rdBtnMasc)
                    .addComponent(rdBtnFem)
                    .addComponent(rdBtnOutros))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnMostrar)))
        );

        rdBtnFem.getAccessibleContext().setAccessibleDescription("");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Relatório do Senso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jScrollPane1.setViewportView(lstPessoasCadastradas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("Senso ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

    
        //Radio Buttons Sexo.
        rdBtnMasc.setActionCommand("Masculino");
        rdBtnFem.setActionCommand("Feminino");
        rdBtnOutros.setActionCommand("Outros");
        
        //Tratamento array.
        if(i < arrayPessoa.length)
        {
            pessoa = new Pessoa();
        
            pessoa.setNome(txtNome.getText());
            pessoa.setDataNascimento(txtData.getText());
            pessoa.setIdade(Integer.parseInt(txtIdade.getText()));
            pessoa.setCpf(txtCpf.getText());
            pessoa.setSexo(sexo.getSelection().getActionCommand());
            pessoa.setEstado(ddlUF.getSelectedItem().toString());
            pessoa.setCidade(txtCidade.getText());
            pessoa.setCorDosCabelos(ddlCabelos.getSelectedItem().toString());
            pessoa.setCorDosOlhos(ddlOlhos.getSelectedItem().toString());
            
            //Array Add.
            arrayPessoa[i] = pessoa;
            i++;
            
            LimparCampos();
            JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso: ", "ChatBox: " + "Senso", JOptionPane.INFORMATION_MESSAGE);
            txtNome.requestFocus();

            //Sexo das pessoas
            if(pessoa.getSexo()=="Masculino"){
                contador1=contador1+1;
            }else
                if(pessoa.getSexo()=="Feminino"){
                    contador2=contador2+1;
                }else
                    if(pessoa.getSexo()=="Outros"){
                        contador3=contador3+1;
                    }
            //Maior e menor de idade
            if(pessoa.getIdade()<=17){
                contador4=contador4+1;
            }else
                if(pessoa.getIdade()>=18){
                    contador5=contador5+1;
                }
//A porcentagem de indivíduos do sexo feminino cuja idade esteja etre 
//18 e 35 anos, inclusive, e que tenham olhos verdes e cabelos louros;            
            if(pessoa.getSexo()=="Feminino"&&pessoa.getIdade()>=18 && pessoa.getIdade()<=35&&pessoa.getCorDosOlhos().equals("Verdes")&&pessoa.getCorDosCabelos().equals("Loiros")){
                contador6=(contador6+1)/arrayPessoa.length;
            }
            
        }
        //Mensagem de array lotado.
        else
        {
            JOptionPane.showMessageDialog(null, "Número máximo de pessoas cadastradas.", "ChatBox: " + " Senso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        
        //Criando um array de String para mostrar as pessoas cadastradas, pegando os dados do array de pessoas.
        String[] pessoasCadastradas = new String[arrayPessoa.length];
        
        //Percorrendo o array com os objetos do tipo Pessoa e salvando cada um e adicionando em uma lista
        for (int j = 0; j < arrayPessoa.length; j++) 
        {
            String pessoaAtualString = "";
            pessoaAtualString += "Nome: " + arrayPessoa[j].getNome() + ". ";
            pessoaAtualString += "|  Estado: " + arrayPessoa[j].getEstado() + ". ";
            pessoaAtualString += "|  Sexo: " + arrayPessoa[j].getSexo()+ ". ";
            pessoaAtualString += "|  Idade: " + arrayPessoa[j].getIdade()+ ". ";
            pessoaAtualString += "|  Data de nascimento: " + arrayPessoa[j].getDataNascimento()+". ";
            pessoaAtualString += "|  CPF: " + arrayPessoa[j].getCpf()+". ";
            pessoaAtualString += "|  Cidade: " + arrayPessoa[j].getCidade()+". ";
            pessoaAtualString += "|  Cor dos Olhos: " + arrayPessoa[j].getCorDosOlhos()+". ";
            pessoaAtualString += "|  Cor dos Cabelos: " + arrayPessoa[j].getCorDosCabelos()+". ";
            pessoasCadastradas[j] = pessoaAtualString;
            
        }
            JOptionPane.showMessageDialog(null, "Número de Homens: " +contador1); 
            JOptionPane.showMessageDialog(null, "Número de Mulheres: " +contador2); 
            JOptionPane.showMessageDialog(null, "Número de 'Outros': "+contador3); 
            JOptionPane.showMessageDialog(null, "Número de pessoas menores de idade: "+contador4); 
            JOptionPane.showMessageDialog(null, "Número de pessoas maiores de idade: "+contador5); 
            JOptionPane.showMessageDialog(null, "Porcentagem de mulheres entre idade de 18 e 35 anos com cabelos louros e olhos verdes: "+contador6+"%"); 
            
            
        
        lstPessoasCadastradas.setListData(pessoasCadastradas);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnQtdePessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQtdePessoasActionPerformed
        arrayPessoa = new Pessoa[Integer.parseInt(txtQtdePessoas.getText())];
        JOptionPane.showMessageDialog(null, "Valor salvo com sucesso.", "ChatBox: " + "Senso", JOptionPane.INFORMATION_MESSAGE);
        txtNome.requestFocus();
    }//GEN-LAST:event_btnQtdePessoasActionPerformed

    private void rdBtnMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnMascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdBtnMascActionPerformed

    private void rdBtnFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnFemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdBtnFemActionPerformed

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
            java.util.logging.Logger.getLogger(Senso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Senso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Senso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Senso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Senso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnQtdePessoas;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> ddlCabelos;
    private javax.swing.JComboBox<String> ddlOlhos;
    private javax.swing.JComboBox<String> ddlUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstPessoasCadastradas;
    private javax.swing.JRadioButton rdBtnFem;
    private javax.swing.JRadioButton rdBtnMasc;
    private javax.swing.JRadioButton rdBtnOutros;
    private javax.swing.ButtonGroup sexo;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQtdePessoas;
    // End of variables declaration//GEN-END:variables

    private void LimparCampos() {
        txtIdade.setText("");
        txtNome.setText("");
        ddlUF.setSelectedIndex(0);
        ddlOlhos.setSelectedIndex(0);
        txtCpf.setText("");
        txtData.setText("");
        txtCidade.setText("");
        
    }
}
