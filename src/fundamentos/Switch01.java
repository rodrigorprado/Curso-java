package fundamentos;

public class Switch01 {

	public static void main(String[] args) {
		
		String faixa = "laranja";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
		break;
		default:
			System.out.println("Nao sei nada!");
// 		O codigo executa todos os cases abaixo do mais alto. Se eu tiver o default, sem break, ele vai rodar todos mais o default		
		}
	}
}
