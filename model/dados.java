package model;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

public class dados {

    Connection con;

    public boolean conecta() {
        boolean retorno = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // con = DriverManager.getConnection("jdbc:mysql://"+ local +"/"+ banco , usuario, senha);
            String URLConexao = "jdbc:mysql://127.0.0.1/poseidonturismobd";
            //LOCAL BANCO              //BANCO
            con = DriverManager.getConnection(URLConexao, "root", "root");
            //USUARIO   //SENHA
            retorno = true;
        } catch (ClassNotFoundException e) {
            System.err.println("Erro de conexão:\n" + e);
        } catch (SQLException e) {
            System.err.println("Erro de conexão:\n" + e);
        }
        return retorno;
    }

    public ResultSet consulta(String consulta) {
        ResultSet rs = null;
        try {
            PreparedStatement stmt = (PreparedStatement) this.con.prepareStatement(consulta);
            rs = stmt.executeQuery();
        } catch (Exception e) {
            System.err.println("Erro CONSULTA: " + e);
        }
        return rs;
    }

    public boolean insere(String tabela, String nome, String endereco, String bairro, String estado, String tel) {
        boolean retorno = false;
        try {
            PreparedStatement stmt = (PreparedStatement) this.con.prepareStatement("insert into " + tabela + "(nome,endereco,bairro,estado,tel) values('" + nome + "','" + endereco + "','" + bairro + "','" + estado + "','" + tel + "');");
            stmt.execute();
            stmt.close();
            retorno = true;

        } catch (SQLException ex) {
            retorno = false;
            System.err.println("Erro INSERT:" + ex);
        }
        return retorno;
    }

    public boolean insereProdutos(String tabela, String nome, String valor, String status) {
        boolean retorno = false;
        try {
            PreparedStatement stmt = (PreparedStatement) this.con.prepareStatement("insert into " + tabela + "(descricao_prod,valorpadrao,status) values('" + nome + "','" + valor + "','" + status + "');");
            stmt.execute();
            stmt.close();
            retorno = true;

        } catch (SQLException ex) {
            retorno = false;
            System.err.println("Erro INSERT:" + ex);
        }
        return retorno;
    }

    public boolean insereNavios(String tabela, String nome, String status) {
        boolean retorno = false;
        try {
            PreparedStatement stmt = (PreparedStatement) this.con.prepareStatement("insert into " + tabela + "(nome_navios,status) values('" + nome + "','" + status + "');");
            stmt.execute();
            stmt.close();
            retorno = true;

        } catch (SQLException ex) {
            retorno = false;
            System.err.println("Erro INSERT:" + ex);
        }
        return retorno;
    }

    public boolean insereClientes(String tabela, String telefone, String endereco, String nome, String bairro) {
        boolean retorno = false;
        try {
            PreparedStatement stmt = (PreparedStatement) this.con.prepareStatement("insert into " + tabela + "(telefone,endereco,nome,bairro) values('" + telefone + "','" + endereco + "','" + nome + "','" + bairro + "');");
            stmt.execute();
            stmt.close();
            retorno = true;

        } catch (SQLException ex) {
            retorno = false;
            System.err.println("Erro INSERT:" + ex);
        }
        return retorno;
    }

    public boolean insereVenda(String tabela, String telefone, String nome, String endereco, String obs, String bairro, int navios, String dt, String hora, int produto, String valor, int pgto) {
        boolean retorno = false;
        try {
            PreparedStatement stmt = (PreparedStatement) this.con.prepareStatement("insert into " + tabela + "(telefone,nome,endereco,observacao,bairro,id_navios,dt,hora,id_produto,valor,id_pgto) values('" + telefone + "','" + nome + "','" + endereco + "','" + obs + "','" + bairro + "'," + navios + ",'" + dt + "','" + hora + "'," + produto + ",'" + valor + "'," + pgto + ");");
            stmt.execute();
            stmt.close();
            retorno = true;

        } catch (SQLException ex) {
            retorno = false;
            System.err.println("Erro INSERT:" + ex);
        }
        return retorno;
    }

    public boolean insereVendaBkp(String tabela, String id_venda, String telefone, String nome, String endereco, String obs, String bairro, int navios, String dt, String hora, int produto, String valor, int pgto) {
        boolean retorno = false;
        try {
            PreparedStatement stmt = (PreparedStatement) this.con.prepareStatement("insert into " + tabela + "(id_venda,telefone,nome,endereco,observacao,bairro,id_navios,dt,hora,id_produto,valor,id_pgto) values('" + id_venda + "','" + telefone + "','" + nome + "','" + endereco + "','" + obs + "','" + bairro + "'," + navios + ",'" + dt + "','" + hora + "'," + produto + ",'" + valor + "'," + pgto + ");");
            stmt.execute();
            stmt.close();
            retorno = true;

        } catch (SQLException ex) {
            retorno = false;
            System.err.println("Erro INSERT:" + ex);
        }
        return retorno;
    }

    public boolean atualiza(String tabela, String campos, String condicao) {
        boolean retorno = false;
        try {
            PreparedStatement stmt = (PreparedStatement) this.con.prepareStatement("update " + tabela + " set idade = " + campos + " where nome = " + "'" + condicao + "'");
            stmt.execute();
            stmt.close();
            retorno = true;
        } catch (SQLException ex) {
            retorno = false;
            System.err.println("Erro UPDATE: " + ex);
        }
        return retorno;
    }

    public boolean atualizaClientes(String tabela, String campos, String condicao) {
        boolean retorno = false;
        try {
            PreparedStatement stmt = (PreparedStatement) this.con.prepareStatement("update " + tabela + " set " + campos + " where " + condicao);
            stmt.execute();
            stmt.close();
            retorno = true;
        } catch (SQLException ex) {
            retorno = false;
            System.err.println("Erro UPDATE: " + ex);
        }
        return retorno;
    }

    public boolean exclui(String tabela, String condicao) {
        boolean retorno = false;

        try {
            PreparedStatement stmt = (PreparedStatement) this.con.prepareStatement("delete from " + tabela + " where " + condicao);
            stmt.execute();
            stmt.close();
            retorno = true;
        } catch (SQLException ex) {
            retorno = false;
            System.out.println("Erro DELETE: " + ex);
        }

        return retorno;
    }

}
