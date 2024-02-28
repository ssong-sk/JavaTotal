package Chap03;

public class P106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		whoIsIt("호랑이"); // 이해가 하나도 안감...
		whoIsIt("참새");
		whoIsIt("고등어");
		whoIsIt("곰팡이");
	}

	static void whoIsIt(String bio) {
		String kind = switch (bio) {
		case "호랑이", "사자" -> "포유류";
		case "독수리", "참새" -> "조류";
		case "고등어", "연어" -> "어류";
		default -> {
			System.out.print("어이쿠! ");
			yield "...";

		}
		};
		System.out.printf("%s는 %s이다.\n", bio, kind);
	}
}
