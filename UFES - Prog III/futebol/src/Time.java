import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Time {
	private String nome;
	private String treinador;
	private Cidade sede = new Cidade();
	private Set<Pessoa> jogadoresContratados = new HashSet<>();

	public double getMediaIdadeJogadoresContratados()
	{
		double soma=0.0;
		for (Pessoa p : jogadoresContratados )
		{
			soma+=p.getIdade();
		}
		return soma/jogadoresContratados.size();
	}

	public void contrataJogador(Pessoa jogador)
	{
		jogadoresContratados.add(jogador);
	}


	// getter
	public String getNome()
	{
		return nome;
	}

	public Cidade getSede()
	{
		return sede;
	}

	public String getTreinador()
	{
		return treinador;
	}

	public void setTreinador(String tr)
	{
		treinador = tr;
	}

	public List<Pessoa> getJogadoresContratados() {
		return new LinkedList<Pessoa>(jogadoresContratados);
	}

	public void setJogadoresContratados(List<Pessoa> jogadoresContratados) {
		this.jogadoresContratados.clear();
		this.jogadoresContratados.addAll(jogadoresContratados);
	}

	// setter
	public void setNome(String n)
	{
		nome=n;
	}

}
