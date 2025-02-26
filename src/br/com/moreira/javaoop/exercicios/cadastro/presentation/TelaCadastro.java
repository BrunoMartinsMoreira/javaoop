package br.com.moreira.javaoop.exercicios.cadastro.presentation;

import br.com.moreira.javaoop.exercicios.cadastro.domain.Cliente;
import br.com.moreira.javaoop.exercicios.cadastro.domain.TipoSexo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastro extends JFrame {
  private JLabel labelNome;
  private JLabel labelCpf;
  private JLabel labelSexo;
  private JLabel labelFoto;

  private JTextField campoNome;
  private JTextField campoCpf;
  private JComboBox<TipoSexo> campoSexo;
  private JFileChooser campoFoto;

  private JButton botaoSalvar;

  public TelaCadastro() {
    construirTela();
  }

  private void construirTela() {
    setSize(800,650);
    setTitle("Cadastro de clientes");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setLayout(null);

    this.adicionarCampos();
    this.adicionarBotoes();
    this.adicionarComponenteFoto();
  }

  private void adicionarCampos() {
    Font fonteCampos = new Font("SansSerif", Font.PLAIN, 18);
    Font fonteLabels = new Font("SansSerif", Font.BOLD, 16);

    labelNome = new JLabel("Nome: ");
    labelNome.setBounds(20, 20, 400, 40);
    labelNome.setFont(fonteLabels);
    getContentPane().add(labelNome);



    campoNome = new JTextField();
    campoNome.setBounds(20, 50, 400, 40);
    campoNome.setFont(fonteCampos);
    getContentPane().add(campoNome);

    labelCpf = new JLabel("CPF: ");
    labelCpf.setBounds(20, 100, 400, 40);
    labelCpf.setFont(fonteLabels);
    getContentPane().add(labelCpf);

    campoCpf = new JTextField();
    campoCpf.setBounds(20, 130, 400, 40);
    campoCpf.setFont(fonteCampos);
    getContentPane().add(campoCpf);

    labelSexo = new JLabel("Sexo: ");
    labelSexo.setBounds(20, 180, 400, 40);
    labelSexo.setFont(fonteLabels);
    getContentPane().add(labelSexo);


    TipoSexo[] tipoSexo = {null, TipoSexo.M, TipoSexo.F};
    campoSexo = new JComboBox<TipoSexo>(tipoSexo);
    campoSexo.setBounds(20, 210, 400, 40);
    campoSexo.setFont(fonteCampos);
    getContentPane().add(campoSexo);
  }

  private void adicionarBotoes() {
    botaoSalvar = new JButton("SALVAR");
    botaoSalvar.setBounds(20, 400, 200, 40);
    botaoSalvar.setFont(new Font("SansSerif", Font.PLAIN, 18));

    botaoSalvar.addActionListener(this.acaoBotaoSalvar());

    getContentPane().add(botaoSalvar);
  }

  private void adicionarComponenteFoto(){}

  private ActionListener acaoBotaoSalvar() {
    return  new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String nome = campoNome.getText();
        String cpf = campoCpf.getText();
        TipoSexo sexo = (TipoSexo)campoSexo.getSelectedItem();

        System.out.println("Nome: " +nome);
        System.out.println("CPF: "+ cpf);
        System.out.println("Sexo: "+ sexo);

        Cliente cliente = new Cliente(nome, cpf, sexo);
        System.out.println(cliente);

        JOptionPane.showMessageDialog(null, cliente);
      }
    };
  }
}
