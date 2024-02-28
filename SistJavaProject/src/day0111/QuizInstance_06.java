package day0111;


class Artist {
	
	//변수명

	private String Group;
	private String Song;
	
	static String Name;
	static int cnt = 0;
	//명시적 생성자
	public void setArtist(String group, String song) {
		this.Group = group;
		this.Song = song;
	}
	
	//출력메서드 한번에 만들기
	
	public void ArtistData() { //void는 리턴이 없지만, String이나 int를 쓰면 return을 꼭 입력해야함.
		cnt++;
		System.out.println("**아티스트 정보_ " + cnt + "***");
		System.out.println("소속기획사 : " + Artist.Name);
		System.out.println("그룹명 : " + this.Group);
		System.out.println("대표곡 : " + this.Song);
		System.out.println("------------------------------");
		
	}
	
}
public class QuizInstance_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Artist art1 = new Artist();
		Artist art2 = new Artist();
		
		art1.setArtist("bts", "버터");
		art2.setArtist("뉴진스", "어텐션");
		
		Artist.Name = "하이브";
		
		art1.ArtistData();
		art2.ArtistData();
		
	}

}
