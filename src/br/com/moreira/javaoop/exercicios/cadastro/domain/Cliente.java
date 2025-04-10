package br.com.moreira.javaoop.exercicios.cadastro.domain;

import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public class Cliente implements Comparable<Cliente> {
  private UUID codigo;
  private String nome;
  private String cpf;
  private TipoSexo sexo;
  private byte[] foto;

  public Cliente(String nome, String cpf, TipoSexo sexo, byte[] foto) {
    this.codigo = UUID.randomUUID();
    this.nome = nome;
    this.cpf = cpf;
    this.sexo = sexo;
    this.foto = foto;
  }

  public Cliente(String nome, String cpf, TipoSexo sexo) {
    this.codigo = UUID.randomUUID();
    this.nome = nome;
    this.cpf = cpf;
    this.sexo = sexo;
  }

  public UUID getCodigo() {
    return codigo;
  }

  public void setCodigo(UUID codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public TipoSexo getSexo() {
    return sexo;
  }

  public void setSexo(TipoSexo sexo) {
    this.sexo = sexo;
  }

  public byte[] getFoto() {
    return foto;
  }

  public void setFoto(byte[] foto) {
    this.foto = foto;
  }

  @Override
  public String toString() {
    return "-------------------------DADOS DO CLIENTE: ------------------------" +
        "\n- CODIGO: " + codigo +
        "\n- NOME: " + nome +
        "\n- CPF: " + cpf +
        "\n- SEXO: " + sexo +
        "\n----------------------------------------------------------------------------";

  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Cliente cliente = (Cliente) o;
    return Objects.equals(codigo, cliente.codigo) &&
           Objects.equals(nome, cliente.nome) &&
           Objects.equals(cpf, cliente.cpf) &&
           sexo == cliente.sexo &&
           Objects.deepEquals(foto, cliente.foto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, nome, cpf, sexo, Arrays.hashCode(foto));
  }

  @Override
  public int compareTo(Cliente o) {

    return this.nome.compareTo(o.getNome()) |
           this.codigo.compareTo(o.getCodigo()) |
           this.sexo.compareTo(o.getSexo());
  }
}
