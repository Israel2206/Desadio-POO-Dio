package br.com.dio.desafio.dominio;
import java.time.LocalDate;


public class Mentoria {

	private String titulo;
    private String descricao;
	private LocalDate data;	

    public String getTitulo() {
        return titulo;
    }

    public String getDescrisao() {
        return descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescrisao(String descrisao) {
        this.descricao = descrisao;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
		"titulo='" + titulo + '\'' + 
		", descrisao='" + descricao + '\'' +
		", data=" + data +
		'}';
    }

}
