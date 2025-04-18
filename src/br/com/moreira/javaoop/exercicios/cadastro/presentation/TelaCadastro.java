package br.com.moreira.javaoop.exercicios.cadastro.presentation;

import br.com.moreira.javaoop.exercicios.cadastro.domain.Cliente;
import br.com.moreira.javaoop.exercicios.cadastro.domain.TipoSexo;
import br.com.moreira.javaoop.exercicios.cadastro.domain.exceptions.CpfInvalidoException;
import br.com.moreira.javaoop.exercicios.cadastro.repositories.Cadastro;
import br.com.moreira.javaoop.exercicios.cadastro.repositories.CadastroEmMemoria;
import br.com.moreira.javaoop.exercicios.cadastro.utils.FotoToArrayByte;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;
import java.util.Objects;

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
  private Cadastro<Cliente> cadastro;
  private  JButton botaoFoto;

  public TelaCadastro(Cadastro<Cliente> cadastro) {
    this.cadastro = cadastro;
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

  private void adicionarComponenteFoto(){
    String fotoPath = "/br/com/moreira/javaoop/exercicios/cadastro/presentation/img.png";
    URL fotoUrl = getClass().getResource(fotoPath);
    ImageIcon imageIcon = new ImageIcon(fotoUrl);

    Image image = imageIcon
        .getImage()
        .getScaledInstance(200,200, Image.SCALE_SMOOTH);

    imageIcon = new ImageIcon(image);

    labelFoto = new JLabel();
    labelFoto.setIcon(imageIcon);
    labelFoto.setBounds(500,50,200, 200);
    getContentPane().add(labelFoto);

    botaoFoto = new JButton("ALTERAR FOTO");
    botaoFoto.setBounds(500,400,200,40);
    botaoFoto.addActionListener(acaoBotaoFoto());
    getContentPane().add(botaoFoto);
  }

  private ActionListener acaoBotaoFoto() {
    return new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        int opcao = fileChooser.showOpenDialog(TelaCadastro.this);

        if(opcao == JFileChooser.APPROVE_OPTION) {
          File fotoFile = fileChooser.getSelectedFile();
          String path = fotoFile.getAbsolutePath();

          ImageIcon imageIcon = new ImageIcon(path);
          labelFoto.setIcon(imageIcon);
        }
      }
    };
  }

  private ActionListener acaoBotaoSalvar() {
    return  new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        String nome = campoNome.getText();
        String cpf = campoCpf.getText();
        TipoSexo sexo = (TipoSexo)campoSexo.getSelectedItem();
        Cliente cliente = new Cliente(nome, cpf, sexo);

        byte[] byteArray = FotoToArrayByte.run(labelFoto.getIcon());
        cliente.setFoto(byteArray);
        try {
          cadastro.salvar(cliente);
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(null, ex.getMessage());
        }
      }
    };
  }
}
