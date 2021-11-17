public class App {
	public static void main(String[] args) throws Exception {
		Time vasco = new Time();
		vasco.setNome("Vasco");
		vasco.setTreinador("Fernando Diniz");
		Cidade sede = vasco.getSede();
		sede.setNomeCidade("Rio de Janeiro");
		sede.setNomeEstado("RJ");
		System.out.println("A sede do Fluminense fica em/no: " + sede.getNomeCidade() + " - " + sede.getNomeEstado());
		System.out.println("O treinador do Vasco é: " + vasco.getTreinador());
		int i=0;
		int j=i;
		i++;
		System.out.println(j);

		Pessoa jp = new Pessoa();
		Pessoa joaopaulo = jp;
		jp.setNome("João Paulo");
		jp.setIdade(44);
		System.out.println(joaopaulo.getNome());
		if (jp==joaopaulo) { System.out.println("mesmo objeto!"); }

		Pessoa fulano = new Pessoa();
		fulano.setNome("Fulano");
		fulano.setIdade(20);

		vasco.contrataJogador(jp);
		vasco.contrataJogador(fulano);

		for(Pessoa p : vasco.getJogadoresContratados())
		{
			System.out.println(p.getNome());
			System.out.println(p.getIdade());
		}
		System.out.println("A média de idade dos jogadores do "+vasco.getNome()+" é "+vasco.getMediaIdadeJogadoresContratados());

		Time flamengo = new Time();
		flamengo.setNome("Flamengo");
		flamengo.setTreinador("Renato Gaúcho");
		sede = flamengo.getSede();
		sede.setNomeCidade("Rio de Janeiro");
		sede.setNomeEstado("RJ");
		System.out.println("A sede do Flamengo fica em/no: " + sede.getNomeCidade() + " - " + sede.getNomeEstado());
		System.out.println("O treinador do Flamengo é: " + flamengo.getTreinador());

		Time fluminense = new Time();
		fluminense.setNome("Fluminense");
		fluminense.setTreinador("Marco Aurélio de Oliveira");
		sede = fluminense.getSede();
		sede.setNomeCidade("Rio de Janeiro");
		sede.setNomeEstado("RJ");
		System.out.println("A sede do Fluminense fica em/no: " + sede.getNomeCidade() + " - " + sede.getNomeEstado());
		System.out.println("O treinador do Fluminense é: " + fluminense.getTreinador());

		Partida flavasco = new Partida(flamengo, vasco);
		//flavasco.setTimeA(flamengo);
		//flavasco.setTimeB(vasco);
		flavasco.marcaGolTimeA();
		flavasco.marcaGolTimeA();
		flavasco.marcaGolTimeB();
		System.out.println(flavasco.getTimeA().getNome()+" fez "+flavasco.getnGolsTimeA()+" gol(s).");
		System.out.println(flavasco.getTimeB().getNome()+" fez "+flavasco.getnGolsTimeB()+" gol(s).");
		flavasco.marcaGolTimeB();
		System.out.println(flavasco.getTimeA().getNome()+" fez "+flavasco.getnGolsTimeA()+" gol(s).");
		System.out.println(flavasco.getTimeB().getNome()+" fez "+flavasco.getnGolsTimeB()+" gol(s).");

		Partida flaflu = new Partida(null, null);
		flaflu.setTimeA(flamengo);
		flaflu.setTimeB(fluminense);
	}
}
