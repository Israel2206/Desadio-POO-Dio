package br.com.dio.desafio.dominio;

public class Curso {

	private String titulo;
	private String descricao;
	private int cargaHoraria;

    public String getTitulo() {
        return titulo;
    }

    public String getDescrisao() {
        return descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescrisao(String descrisao) {
        this.descricao = descrisao;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" + 
		"titulo='" + titulo + '\'' +
		", descrisao='" + descricao +'\'' +
		", cargaHoraria=" + cargaHoraria +
		'}';
    }


}
