
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bell Rodrigues
 */
public class TelaNovoCadastro1 extends javax.swing.JFrame {
    
    /*VARIÁVEIS CALCULO*/
    double salariobruto;
    double inss;
    double fgts;
    double passagem;
    double passagemtotal;
    double alimentacao;
    double alimentacaototal;
    double salariobase;
    
    /*variaveis de inserção de valores*/
    int numcpf;
    int numrg;
    int numcep;
    int numctps;
    int numpis;
    int numtel;
    int numcel;
    
    /*CHAMA METODOS*/
    ChamaMetodos chamametodos = new ChamaMetodos();
    
       
    public TelaNovoCadastro1() {
        
        initComponents();
        this.setSize(1024,768);
        setLocationRelativeTo(null);
      
    }
     public void CalcularInss() {
          salariobruto = Double.parseDouble(SalBruto.getText());
          
          if (salariobruto >= 1 || salariobruto <= 1.69372) {
              inss = salariobruto*8/100;
              TXTInss.setText(String.valueOf(inss));
              
          }
          else if (salariobruto >= 1.69373 || salariobruto <= 2.82290){
              inss = salariobruto*9/100;
              TXTInss.setText(String.valueOf(inss));
              
          }
          else if (salariobruto >= 2.82291 || salariobruto <= 5.64580){
              inss = salariobruto*11/100;
              TXTInss.setText(String.valueOf(inss));
              
          }
        }
     
     public void CalcularFGTS() {
         fgts = salariobruto*8/100;
         TXTFgts.setText(String.valueOf(fgts));
     }
     
     public void AlimentacaoPassagem() {
         passagem = Double.parseDouble(TXTPassagem.getText());
         passagemtotal = salariobruto*passagem/100;
         alimentacao = Double.parseDouble(TXTAlimentacao.getText());
         alimentacaototal = salariobruto*alimentacao/100;
     }
     
     public void CalculoSalarioBase(){
         AlimentacaoPassagem();
         salariobase = salariobruto - inss - passagemtotal - alimentacaototal;
         SalBase.setText(String.valueOf(salariobase));
     }
     
     public void NovoCadastro() {
         SalBruto.setText("");
         TXTPassagem.setText("");
         TXTAlimentacao.setText("");
         SalBase.setText("");
         TXTInss.setText("");
         TXTFgts.setText("");
     }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        nomefunc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        datanascimento = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ctps = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pis = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        end = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cep = new javax.swing.JTextField();
        setor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cel = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        IdFuncionario = new javax.swing.JTextField();
        CodAutomatico = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        SalBruto = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TXTAlimentacao = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TXTInss = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TXTFgts = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        SalBase = new javax.swing.JTextField();
        cargo = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        TXTPassagem = new javax.swing.JTextField();
        rg = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tel1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        DadosCadastrais = new javax.swing.JPanel();
        DadosSalario = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 160, 60, 17);
        getContentPane().add(nomefunc);
        nomefunc.setBounds(90, 150, 570, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data Nasc.:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 210, 90, 17);
        getContentPane().add(datanascimento);
        datanascimento.setBounds(120, 200, 190, 30);
        getContentPane().add(cpf);
        cpf.setBounds(760, 150, 230, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CPF:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(710, 160, 50, 17);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CTPS:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(670, 210, 50, 17);
        getContentPane().add(ctps);
        ctps.setBounds(720, 200, 270, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PIS:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 260, 50, 17);
        getContentPane().add(pis);
        pis.setBounds(90, 250, 220, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("End:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(340, 260, 50, 17);
        getContentPane().add(end);
        end.setBounds(390, 250, 400, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CEP:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(810, 260, 60, 17);
        getContentPane().add(cep);
        cep.setBounds(850, 250, 140, 30);
        getContentPane().add(setor);
        setor.setBounds(90, 350, 80, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("TEL:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 310, 50, 17);
        getContentPane().add(cel);
        cel.setBounds(390, 300, 220, 30);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CEL:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(340, 310, 50, 17);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cód. Funcionário:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(30, 120, 140, 17);

        IdFuncionario.setEditable(false);
        getContentPane().add(IdFuncionario);
        IdFuncionario.setBounds(160, 110, 140, 30);

        CodAutomatico.setSelected(true);
        CodAutomatico.setText("Automático");
        CodAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodAutomaticoActionPerformed(evt);
            }
        });
        getContentPane().add(CodAutomatico);
        CodAutomatico.setBounds(310, 110, 100, 30);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Sal. Bruto:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(30, 480, 90, 17);
        getContentPane().add(SalBruto);
        SalBruto.setBounds(120, 470, 220, 30);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Alimentação:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(820, 480, 90, 17);
        getContentPane().add(TXTAlimentacao);
        TXTAlimentacao.setBounds(920, 470, 80, 30);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("INSS:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(370, 480, 40, 17);

        TXTInss.setEditable(false);
        getContentPane().add(TXTInss);
        TXTInss.setBounds(410, 470, 70, 30);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("FGTS:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(510, 480, 50, 17);

        TXTFgts.setEditable(false);
        getContentPane().add(TXTFgts);
        TXTFgts.setBounds(560, 470, 80, 30);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Sal. Base:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(30, 530, 90, 17);
        getContentPane().add(SalBase);
        SalBase.setBounds(120, 520, 220, 30);
        getContentPane().add(cargo);
        cargo.setBounds(750, 300, 240, 30);

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Cargo/Função:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(630, 310, 110, 17);

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Setor:");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(30, 360, 50, 17);
        getContentPane().add(TXTPassagem);
        TXTPassagem.setBounds(740, 470, 70, 30);

        rg.setEditable(false);
        getContentPane().add(rg);
        rg.setBounds(390, 200, 270, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("RG:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(340, 210, 50, 17);
        getContentPane().add(tel1);
        tel1.setBounds(90, 300, 220, 30);

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Passagem:");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(660, 480, 80, 17);

        jButton3.setText("Códigos dos setores");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(180, 350, 130, 30);

        DadosCadastrais.setBackground(new java.awt.Color(102, 102, 255));
        DadosCadastrais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Funcionário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16))); // NOI18N
        getContentPane().add(DadosCadastrais);
        DadosCadastrais.setBounds(10, 80, 1000, 320);

        DadosSalario.setBackground(new java.awt.Color(102, 102, 255));
        DadosSalario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Salário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16))); // NOI18N
        getContentPane().add(DadosSalario);
        DadosSalario.setBounds(10, 430, 1000, 140);

        jButton1.setText("Novo Cadastro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(790, 590, 120, 30);

        jButton2.setText("Salvar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(920, 590, 80, 30);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TelaCadastro.png"))); // NOI18N
        fundo.setText("jLabel1");
        getContentPane().add(fundo);
        fundo.setBounds(0, -30, 1020, 660);

        jMenuBar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jMenu1.setText("Novo");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenu1.setMargin(new java.awt.Insets(8, 10, 8, 10));

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem1.setText("Novo Cadastro");
        jMenuItem1.setMargin(new java.awt.Insets(5, 0, 0, 5));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem2.setText("Nova consulta de funcionários");
        jMenuItem2.setMargin(new java.awt.Insets(5, 0, 0, 5));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem3.setText("Sair");
        jMenuItem3.setMargin(new java.awt.Insets(5, 0, 0, 5));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatórios");
        jMenu2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenu2.setMargin(new java.awt.Insets(0, 10, 0, 10));

        jMenuItem4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem4.setText("Folha de Pagamento");
        jMenuItem4.setMargin(new java.awt.Insets(5, 0, 0, 50));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem5.setText("Folha por Grupo");
        jMenuItem5.setMargin(new java.awt.Insets(5, 0, 0, 5));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(null, "Você já está na tela de cadastro de funcionários.");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        chamametodos.ConsultaFolhaPagamento();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        chamametodos.Sair();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        chamametodos.ChamaNovaConsulta();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       chamametodos.ConsultaFolhaPagamentoGrupo();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void CodAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodAutomaticoActionPerformed
        
        if (CodAutomatico.isSelected()) {
           IdFuncionario.setEnabled(false);
        }
        else {
            JOptionPane.showMessageDialog(null, "O programa salva automaticamente o código do cliente, \nse desmarcar essa caixa precisará inserir os valores manualmente e \nestes não poderão ser alterados futuralmente.");
            IdFuncionario.setEditable(true);
           
        }
    }//GEN-LAST:event_CodAutomaticoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
            /*CalcularInss();
            CalcularFGTS();
            CalculoSalarioBase();*/
        try {
            
           
           
           
            
            Class.forName("com.mysql.jdbc.Driver");
                   
            Connection con;
         
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/folhacalc?useSSL=false", "root", "");
            
            /*Convertendo valores*/
           
           
           numcpf = Integer.parseInt(cpf.getText());
           numrg = Integer.parseInt(rg.getText());
           numcep = Integer.parseInt(cep.getText());
           numctps = Integer.parseInt(ctps.getText());
           numpis = Integer.parseInt(pis.getText());
           numtel = Integer.parseInt(setor.getText());
           numcel = Integer.parseInt(cel.getText());
           int codsetor = Integer.parseInt(setor.getText());
           
            /*String query = "INSERT INTO funcionario (idfuncionario,nome,cpf,rg,datanascimento,ctps,pis,telefone,celular,cargo,endereco,cep,salariobruto,salariobase,idsetor)VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";*/
           
            
            String query = "INSERT INTO cadastro001 (nome,cpf,rg,dtnasc,ctps,pis,endereco,cep,tel,cel,cargo,idsetor) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            try (PreparedStatement savevalues = con.prepareStatement(query)) {
                savevalues.setString(1, nomefunc.getText());
                savevalues.setInt(2, numcpf);
                savevalues.setInt(3, numrg);
                savevalues.setString(4, datanascimento.getText());
                savevalues.setInt(5, numctps);
                savevalues.setInt(6, numpis);
                savevalues.setString(7, end.getText());
                savevalues.setInt(8, numcep);
                savevalues.setInt(9, numtel);
                savevalues.setInt(10, numcel);
                savevalues.setString(11, cargo.getText());
                savevalues.setInt(12, codsetor);
                
                
                /*savevalues.setInt(1, codfunc);
                savevalues.setString(2, nomefunc.getText());
                savevalues.setInt(3, numcpf);
                savevalues.setInt(4, numrg);
                savevalues.setString(5, datanascimento.getText());
                savevalues.setInt(6, numctps);
                savevalues.setInt(7, numpis);
                savevalues.setInt(8, numtel);
                savevalues.setInt(9, numcel);
                savevalues.setString(10, cargo.getText());
                savevalues.setString(11, end.getText());
                savevalues.setInt(12, numcep);
                savevalues.setDouble(13, salariobruto);
                savevalues.setDouble(14, salariobase);*/
                
                savevalues.executeUpdate();
            }
            con.close();
        } 
        catch (ClassNotFoundException ex) {
            System.out.println("Não foi possivel encontrar a classe!");
        }catch (SQLException ex) {
            System.out.println ("Ocorreu um erro de SQL");
        }catch (NumberFormatException nf) {
               JOptionPane.showMessageDialog(null, "Para os campos cpf e rg entre apenas com números");
           }
         
        
        
        
        
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*NovoCadastro();*/
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showMessageDialog(null, "01 Financeiro\n"
                + "02 Administrativo\n"
                + "03 Limpeza");
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CodAutomatico;
    private javax.swing.JPanel DadosCadastrais;
    private javax.swing.JPanel DadosSalario;
    private javax.swing.JTextField IdFuncionario;
    private javax.swing.JTextField SalBase;
    private javax.swing.JTextField SalBruto;
    private javax.swing.JTextField TXTAlimentacao;
    private javax.swing.JTextField TXTFgts;
    private javax.swing.JTextField TXTInss;
    private javax.swing.JTextField TXTPassagem;
    private javax.swing.JTextField cargo;
    private javax.swing.JTextField cel;
    private javax.swing.JTextField cep;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField ctps;
    private javax.swing.JTextField datanascimento;
    private javax.swing.JTextField end;
    private javax.swing.JLabel fundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JTextField nomefunc;
    private javax.swing.JTextField pis;
    private javax.swing.JTextField rg;
    private javax.swing.JTextField setor;
    private javax.swing.JTextField tel1;
    // End of variables declaration//GEN-END:variables
}
